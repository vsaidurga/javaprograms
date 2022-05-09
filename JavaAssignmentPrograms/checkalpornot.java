package JavaAssignmentPrograms;

import java.util.Scanner;

public class checkalpornot {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter any Alphabet:");
	 char ch = sc.next().charAt(0);
	 if((ch>='A' && ch<='z')|| (ch>='a' && ch<='z')) {
		 System.out.println(ch+ " is a Alphabet");
	 }
	 else {
		 System.out.println(ch+ " is not a Alphabet, its a digit");
	 }
}
}
