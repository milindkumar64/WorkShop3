package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListSort {
	/*
	 * Ability to find min and max even number in the number stream.
	 * arraylist[4,5,2,6,7,33,45,32,45,89,102,117,8,10,11,18]
	 */
	
	public static void main(String[] args) {
		
	
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(new Integer(4));
		arrlist.add(new Integer(5));
		arrlist.add(new Integer(2));
		arrlist.add(new Integer(6));
		arrlist.add(new Integer(7));
		arrlist.add(new Integer(33));
		arrlist.add(new Integer(45));
		arrlist.add(new Integer(32));
		arrlist.add(new Integer(89));
		arrlist.add(new Integer(102));
		arrlist.add(new Integer(117));
		arrlist.add(new Integer(8));
		arrlist.add(new Integer(10));
		arrlist.add(new Integer(11));
		arrlist.add(new Integer(18));

		System.out.println(arrlist);
		
		ArrayList<Integer> s = (ArrayList<Integer>) arrlist.stream().filter(i->i%2==0).sorted().collect(Collectors.toList());
		System.out.println("Even number present in the list is : " +s);
		System.out.println("Min Even number of the ArryList is : "+s.get(0) );
		System.out.println("Min Even number of the ArryList is : "+s.get(7) );

		
	
		
	}

}
