/*We can have name of each for loop. To do so, we use label before the for loop. 
 It is useful if we have nested for loop so that we can break/continue specific for loop.

Normally, break and continue keywords breaks/continues the inner most for loop only.*/


package com.cf.example.cntl_stmts;

public class LabeledFor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		 aa:  
		        for(int i=1;i<=3;i++){  
		        	
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;
		                        //break bb;
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        } 

	}

}
