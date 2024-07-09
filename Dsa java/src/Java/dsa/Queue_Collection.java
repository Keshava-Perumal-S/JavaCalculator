package Java.dsa;

import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;


public class Queue_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer>list=new LinkedList<>();
		list.add(11);
		list.offer(12);
		list.offer(13);
		list.offer(14);
		list.offer(15);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.peek());
		
		
		while(!list.isEmpty())
		{
			System.out.println("Loop : "+list.poll());
		}
		list.offer(10);
		list.offer(66);
		System.out.println("Remove : " +list.remove());
		
		System.out.println(list.contains(11));
		System.out.println(list.offer(1));
		

		System.out.println(list.peek());
		


	}

}
