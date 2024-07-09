package Java.dsa;

import java.util.Stack;

public class Stack_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> list=new Stack<>();
		list.push(18);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		
		
		System.out.println("s:"+list.size());
		System.out.println(list.pop());
		System.out.println(list.peek());
		System.out.println(list.peek());
//		while(!list.isEmpty())
//		{
//			System.out.println(list.pop());
//		}
//		System.out.println("Capacity : "+list.capacity());




		
	}

}
