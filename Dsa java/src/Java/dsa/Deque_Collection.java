package Java.dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque <Integer> queue=new ArrayDeque<>();
		
//Queue Principle FIFO
		System.out.println("Deque - > Queue");
		queue.offerFirst(1);
		queue.offerFirst(3);
		queue.offerFirst(2);
		queue.offerFirst(4);
		queue.offerFirst(5);
		System.out.println("Queue : "+queue);
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		System.out.println("----------------------");
//Stack Principle LIFO
		Deque <Integer> stack=new ArrayDeque<>();
		System.out.println("Deque - > Stack");
		stack.offerLast(1);
		stack.offerLast(2);
		stack.offerLast(3);
		stack.offerLast(4);
		stack.offerLast(5);
		System.out.println("Stack"+stack);
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());

		

		
		
		
	}

}
