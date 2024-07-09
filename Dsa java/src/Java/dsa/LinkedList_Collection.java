package Java.dsa;
import java.util.*;
public class LinkedList_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(5);
		list.add(33);
		list.add(1, 67);
		System.out.println(list);
		//System.out.print(list.removeAll(list));
		ListIterator<Integer> iterator=list.listIterator();
		//Next - The elements will be printed and then shifted to next Node;
		
		//Previous - The pointer will be shifted to previous node and then value printed;

		System.out.println(iterator.next());
		System.out.println(iterator.previous());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.previousIndex());
		


//		System.out.println(iterator.nextIndex());

		//System.out.println(iterator.previousIndex());




		
		

		
	}

}
