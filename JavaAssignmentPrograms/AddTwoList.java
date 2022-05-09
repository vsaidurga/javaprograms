package JavaAssignmentPrograms;

import java.util.ArrayList;



public class AddTwoList {
public static void main(String[] args) {
ArrayList<Integer> list1 = new ArrayList<Integer>();
list1.add(1);
list1.add(2);
list1.add(3);
ArrayList<Integer> list2 = new ArrayList<Integer>();
list2.add(4);
list2.add(5);
list2.add(6);

list1.addAll(list2);
System.out.println("list of array after joining:" +list1);

}
}
