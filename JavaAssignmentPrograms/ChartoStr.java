package JavaAssignmentPrograms;

public class ChartoStr {
 public static void main(String[] args) {
	 //char to String
	 char ch = 's';
	 String s1 = Character.toString(ch);
	 System.out.println(s1);
	 //String to char
	 String name = "Sai";
	 for(int i=0;i<name.length();i++)
	 {
		 char c=name.charAt(i);
		 System.out.println(c);
	 }
 }
}
