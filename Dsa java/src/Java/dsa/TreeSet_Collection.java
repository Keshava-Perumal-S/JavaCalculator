package Java.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Tree Set is only Sorted Order
		//SortedSet<Integer> list4=new TreeSet<>();
		 //               or
		Set<Integer> list4=new TreeSet<>();
		list4.add(6);
		list4.add(9);
		list4.add(13);
		list4.add(15);
		list4.add(20);
		list4.add(25);
		list4.add(29);
		list4.add(46);
		System.out.println(list4);
		Set <Integer>alist2=new TreeSet<>();
		alist2.add(23);
		alist2.add(67);
		alist2.add(46);
		alist2.add(87);
		System.out.println(alist2);
		list4.removeAll(alist2);
		System.out.println(list4);

		

		
//Can do all operations like HashSet
	}

}
