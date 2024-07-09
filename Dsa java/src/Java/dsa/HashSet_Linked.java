package Java.dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet will not be sorted order
		System.out.println("HashSet");
		Set<Integer> list=new HashSet<>();
		list.add(1);
		list.add(100);
		list.add(35);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(1);
		System.out.println("List 1"+list);
		HashSet<Integer> list2=new HashSet<>();
		list2.add(6);
		list2.add(9);
		list2.add(13);
		list2.add(15);
		list2.add(20);
		list2.add(25);
		list2.add(29);
//		list2.add(46);
		System.out.println("List 2"+list2);
//		list.retainAll(list2);
//		System.out.println("Intersection : "+list);
		list.addAll(list2);
		System.out.println("Union : "+list);
		list.removeAll(list2);
		System.out.println("Difference : "+list);
		
		System.out.println("----------------");
//LinkedHashSet 
		System.out.println("LinkedHashSet");
//		Set<Integer> list3=new LinkedHashSet<>();
//		list3.add(5);
//		list3.add(6);
//		list3.add(6);
//		list3.add(2);
//		list3.add(8);
//		
//		System.out.println(list3);
		
		
		Set<Character> list3=new HashSet<>();
		list3.add('c');
		list3.add('o');
		list3.add('m');
		list3.add('p');
		list3.add('t');
		list3.add('u');
		list3.add('r');
		list3.add('c');
		list3.add('a');
		list3.add('t');
		
		list3.add('p');
		list3.add('l');
		list3.add('z');
		list3.add('x');
		list3.add('q');
		
		
		
		System.out.println(list3);
// Can Do The Same Operation In LinkedHashSet Also
		
	}

}
