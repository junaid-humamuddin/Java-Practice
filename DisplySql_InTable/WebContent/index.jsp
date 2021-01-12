<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Audit Log</title>
<link href='http://fonts.googleapis.com/css?family=oxygen'
	rel='stylesheet' type='text/css'>
<style type="text/css">
table, td, th {
	border: 1px solid black;
	font-family: 'oxygen', sans-serif;
}

th {
	background-color: grey;
	color: white;
}

body {
	text-align: center;
}

.container {
	margin-left: auto;
	margin-right: auto;
	width: 70em; //
	padding: 10px;
}

#tablediv{
	
}
</style>
<script src='js/jquery-3.3.1.min.js'></script>
<script type="text/javascript">
$(document).ready(function() {
/* 	$("#tablediv").hide(); */
     $("#showTable").toggle(function(event){
           $.get('PopulateTable',function(responseJson) {
        	   if(responseJson!=null){
            	   $("#logtable").find("tr:gt(0)").remove();
            	   var table1 = $("#logtable");
	               $.each(responseJson, function(key,value) { 
	               		   var rowNew = $("<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>");
	                       rowNew.children().eq(0).text(value['dao_name']); 
	                       rowNew.children().eq(1).text(value['dao_position']); 
	                       rowNew.children().eq(2).text(value['date_appointed']); 
	                       rowNew.children().eq(3).text(value['download_pdf']); 
	                       rowNew.children().eq(4).text(value['init_training_completed_date']); 
	                       rowNew.children().eq(5).text(value['last_annual_refresher_training_completed_date']); 
	                       rowNew.children().eq(6).text(value['training_overdue']); 
	                       rowNew.children().eq(7).text(value['training_record_link']); 
	                       rowNew.appendTo(table1);
	               });
                }
            });
            $("#tablediv").show();          
	 });
     $("#myInput").on("keyup", function() {
    	    var value = $(this).val().toLowerCase();
    	    $("#logtable tr").filter(function() {
    	      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    	    });
    	  });
});
</script>
</head>
<body class="container">
	<h1>Audit Log Database</h1>
	<h4>Demo on Audit Log</h4>
	<input type="button" value="Show Table" id="showTable" />
	<br />
	<br />
	<input type="text" id="myInput" onkeyup="myFunction()"
		placeholder="Search .." title="Type in a name">
	<br />
	<br />
	<div id="tablediv">
		<table cellspacing="0" id="logtable">
			<tr>
				<th scope="col">DAO Name</th>
				<th scope="col">DAO Duty/Position</th>
				<th scope="col">Date of Appointment</th>
				<th scope="col">Download DD577 PDF</th>
				<th scope="col">Date Initial Training Completed</th>
				<th scope="col">Date Last Annual Refresher Training Completed</th>
				<th scope="col">Training Overdue</th>
				<th scope="col">A link to their Training record</th>
			</tr>
		</table>
	</div>
</body>
</html>