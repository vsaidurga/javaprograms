package JavaAssignmentPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StrtoDate {
public static void main(String[] args) throws Exception {
	//String str = "07/10/1998";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a date: ");
	String str =sc.nextLine();
	Date date_formate= new SimpleDateFormat("dd/MM/yyyy").parse(str);
	
	System.out.println("Converted Date is :"+date_formate);
	
}
}
