package JavaAssignmentPrograms;

import java.util.Scanner;

public class GetDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String that contains numbers: ");
	String str = sc.nextLine();
	String num = str.replaceAll("[^0-9]", "");
	System.out.println("The numbers in the String is: " +num);
	
}
}
