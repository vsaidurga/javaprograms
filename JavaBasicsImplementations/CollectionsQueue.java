package JavaBasicsImplementations;

import java.util.PriorityQueue;

public class CollectionsQueue {
public static void main(String[] args) {
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	for(int i =10;i>0;i--) {
		q.add(i);
	}
	System.out.println("queue size is"+q.size());
	System.out.println(q.peek());
	q.poll();
	System.out.println("after poll queue size is"+q.size());
}
}
