package JavaAssignmentPrograms;

import java.util.Scanner;

public class NonRepeating {
public static void main(String[] args) {
	System.out.println("first non repeating char is : " +getNonRepeatedCharacter("aabcd"));
}
	public static Character getNonRepeatedCharacter(String str) {
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if(str.lastIndexOf(ch[i])==str.indexOf(ch[i]))
			
			return ch[i];
	}
	return null;
}
}