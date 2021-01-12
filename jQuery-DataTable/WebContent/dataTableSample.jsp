<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DataTables example</title>
<style type="text/css" title="currentStyle">
@import "resources/css/demo_table.css";
</style>
<script type="text/javascript" language="javascript"
	src="resources/js/jquery.js"></script>
<script type="text/javascript" language="javascript"
	src="resources/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf-8">
	$(document).ready(function() {
		var oTable = $('#example').dataTable({
			"processing" : true,
			"ajax" : {
				"url" : "/jQuery-DataTable/DataTableServlet",
				"dataSrc" : "demo",
				"type" : "POST"
			}
		});
	});
</script>
</head>
<body id="dt_example">

	<div id="dynamic">
		<table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
			<thead>
				<tr>
					<th width="10%">First Name</th>
					<th width="10%">Last Name</th>
					<th width="10%">Address 1</th>
					<th width="10%">Address 2</th>
				</tr>
			</thead>
		</table>
	</div>
</body>

</html>