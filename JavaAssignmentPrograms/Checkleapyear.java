package JavaAssignmentPrograms;

import java.util.Scanner;

public class Checkleapyear {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Year:");
	int year = sc.nextInt();
     if(year%400==0) {
    	 System.out.println(year+ " is a leap year");
     }else if(year%100==0) {
    	 System.out.println(year+ " is not a leap year");
     }else if(year%4==0) {
    	 System.out.println(year+ " is a leap year");
     }else {
    	 System.out.println(year+ " is not a leap year");
     }
}
}
