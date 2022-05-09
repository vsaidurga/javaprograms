package JavaAssignmentPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String name = "sai";
	
		String rev = "";
		for(int i = name.length()-1;i>=0;i--)
			rev=rev+name.charAt(i);
		
		if(name.equals(rev))
			System.out.println(name+ " Is palindrom");
		else {
			System.out.println(name+ " not palindrom");
		}
			
		
	}
}
