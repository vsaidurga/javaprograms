package JavaBasicsImplementations;

import java.util.ArrayList;

public class CollectionsList {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>(); //specific data type
	list.add("sai");
	list.add("Durga");
	list.add("capgemini");
	
	ArrayList list1 = new ArrayList();// any type of data can be used
	list1.add(1);
	list1.add("devi");
	list1.add(1.5);
	System.out.println(list);
	System.out.println(list1);
	
	//to get specific element from list 
	String str = list.get(1);
	System.out.println(str);
	// to get specific element from list1
	Object o = list1.get(2);
	System.out.println(o);
	
	//to update the element
	list.set(2, "Devi");
	System.out.println(list);
	list1.set(2, 2.5);
	System.out.println(list1);
	
	//to remove
	list.remove(2);
	System.out.println(list);
	
	
	if(list.contains("sai"))
		System.out.println("Sai is in the list");
	}
	
}

