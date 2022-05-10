package JavaBasicsImplementations;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsSets {
public static void main(String[] args) {
	//HashSet<String> set = new HashSet<String>();
	TreeSet<String> set = new TreeSet<String>();
	set.add("sai");
	set.add("devi");
	set.add("sai");
	set.add("devi");
	set.add("sai");
	set.add("durga");
	System.out.println(set);
	
	Iterator<String> itr = set.iterator();
	while(itr.hasNext()) {
		String str = itr.next();
		System.out.println(str);
	}
	set.remove("sai");
	System.out.println("after removing is: "+set);
	
}
}
