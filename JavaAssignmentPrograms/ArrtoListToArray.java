package JavaAssignmentPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrtoListToArray {
public static void main(String[] args) {
	//list to Array
	ArrayList languages = new ArrayList<>();
	languages.add("telugu");
	languages.add("English");
	languages.add("Hindi");
	String[] str = new String[languages.size()];
	languages.toArray(str);
   System.out.print("Array:");
	for(String item : str) {
		System.out.print(item+"");
		System.out.println("\n");
	}
	//array to list
	String[] Array= {"sai","Durga","Devi"};
	List list = new ArrayList<>(Arrays.asList(Array));
	System.out.println("List"+list);
}
}
