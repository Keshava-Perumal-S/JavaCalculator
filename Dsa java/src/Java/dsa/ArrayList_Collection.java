package Java.dsa;

import java.util.*;

public class ArrayList_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List 1
		List<Integer> alist=new ArrayList<>();
		alist.add(11);
		alist.add(21);
		alist.add(31);
		alist.add(41);
		//alist.clear();
		System.out.println("List 1 : "+alist);
		
		//System.out.print(alist.indexOf(31)); 2
		Integer [] arr=alist.toArray(new Integer[0] );
		System.out.println("Array is : " +Arrays.toString(arr));
		
//List 2
		//ArrayList alist2=new ArrayList<>(alist); //[11, 21, 31, 41, 23, 67, 45, 87]
		List<Integer> alist2=new ArrayList<>();
		alist2.add(23);
		alist2.add(67);
		alist2.add(45);
		alist2.add(87);
		//Collections.reverseOrder(alist2);
		alist2.toArray();
		//alist2.addAll(alist); [23, 67, 45, 87, 11, 21, 31, 41]
//		Collections.sort(alist2);
		
		System.out.println(" arr List 2 : "+alist2);
//List 3
		List alist3=alist2.subList(0, 3);//will have only the copy of list 2
		System.out.println(alist3.set(0, 100));
		System.out.println("List 3 : "+alist3);
		System.out.println("Size List 3 : "+alist3.size());
		System.out.println("Last Index List 3 : "+alist3.lastIndexOf(67)); //Similar to Index
		//System.out.println("List 3 : "+Collections.sort(alist));
		System.out.println("String List 3 : "+alist3.toString());
		System.out.println("List 3 : "+alist3.containsAll(alist));
		System.out.println("List 3 : "+alist3.equals(alist));
		//System.out.println("List 3 : "+alist3.clear(alist3));
		
		
		

		

	}

}
