package JavaAssignmentPrograms;

import java.util.Scanner;

public class Swap2numbers {
 public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number :");
	int i = sc.nextInt();
	System.out.println("Enter 2nd number :");
	int n = sc.nextInt();
	
	//swap
	int temp = i;
	i=n;
	n=temp;
	System.out.println("After swap the numbers are: " +i+ " & " +n);
	
	
}
}
