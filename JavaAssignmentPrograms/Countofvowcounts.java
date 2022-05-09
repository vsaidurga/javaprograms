package JavaAssignmentPrograms;

import java.util.Scanner;

public class Countofvowcounts {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a word:");
	String str =sc.nextLine();
	int v=0,c=0;
	str=str.toUpperCase();
	for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			v++;
		else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
		{
			c++;
		}
	}
	System.out.println("The count of Vowels is " +v);
	System.out.println("The count of Consonants is "+c);
}
}
