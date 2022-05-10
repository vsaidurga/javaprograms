package JavaAssignmentPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortValue {
	public static void main(String[] args) {
		
	
Map<String,Integer> map = new HashMap<>();

map.put("sai",1);
map.put("apple", 10);
map.put("ball", 1000);
map.put("green", 20);
map.forEach((k,v)->System.out.println(k+"="+v));
System.out.println("After Sorting by value:");
List<Entry<String,Integer>>list = new ArrayList<>(map.entrySet());
list.sort(Entry.comparingByValue());
list.forEach(System.out::println);



	}
}
