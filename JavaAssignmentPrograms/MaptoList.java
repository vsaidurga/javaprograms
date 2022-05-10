package JavaAssignmentPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaptoList {
public static void main(String[] args) {
	Map<Integer,String> map =new HashMap<>();
	map.put(10,"Sai");
	map.put(20, "devi");
	map.put(30, "durga");
	List<Integer> keylist = new ArrayList(map.keySet());
	List<String> valuelist = new ArrayList(map.values());
	System.out.println( keylist+ "\n" +valuelist);
	
}
}
