package com.test.testLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Sorting {
	public static void main(String[] args) {
		List<Object> objs = getObjects();
		
		System.out.println("Classic: Before Sort");
		
		for(Object obj: objs) {
			System.out.println(obj);
		}
		/**
		 * CLASSIC
		 */
		Collections.sort(objs, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				//Classic way to compare String
				return o1.toString().compareTo(o2.toString());
				//Classic way to compare int
				//return i1 - i2;
			}
		});
		
		System.out.println("Classic: After sort");
		for(Object obj: objs) {
			System.out.println(obj);
		}
		
		/**
		 * LAMBDA
		 */
		
		//Lambda way to sort String
		List<Object> objsLambda = getObjects();
		
		objsLambda.sort((Object o1, Object o2)->o1.toString().compareTo(o2.toString()));
		// OR 		
		// objsLambda.sort((o1, o2)->o1.toString().compareTo(o2.toString()));
		// OR
		// Comparator<Object> objComparator = (o1, o2)-> o1.toString().compareTo(o2.toString());
		// objsLambda.sort(objComparator);
		
		//Reversed Order
		// objsLambda.sort(objComparator.reversed());
		
		System.out.println("Lambda: After sort");
		objsLambda.forEach((obj)->System.out.println(obj.toString()));		

	}
	
	private static List<Object> getObjects() {
		List<Object> objs = new ArrayList<Object>();
		objs.add(new String("x1000"));
		objs.add(new String("b500"));
		objs.add(new String("z10000"));
		objs.add(new String("a50"));
		return objs;
	}
}
