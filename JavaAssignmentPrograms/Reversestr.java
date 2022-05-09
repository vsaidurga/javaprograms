package JavaAssignmentPrograms;

public class Reversestr {
public static void main(String[] args) {
	String str = " devi";
	String reversed = reverse(str);
	System.out.println("The reversed sentence is: " + reversed);
}
public static String reverse(String str) {
	if (str.isEmpty())
		return str;

	return reverse(str.substring(1)) + str.charAt(0);
}
}
