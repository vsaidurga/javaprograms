package JavaAssignmentPrograms;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		int i=20, count = 0;
       if(i>0) {
    	   for(int n=1;n<=i;n++)
    	   {
    		   if(i%n==0) {
    			   count++;
    	   }
       }
       if(count==2) {
    	   System.out.println("Its Prime number");  
       }
       else {
    	   System.out.println("Its not prime number");
       
	}
	}
       else {
    	  System.out.println("Its not prime number");
       
       }
	}
}
	
