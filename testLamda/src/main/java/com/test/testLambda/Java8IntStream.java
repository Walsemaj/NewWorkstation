package com.test.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.event.ListSelectionEvent;

public class Java8IntStream {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Integer[] nums2 = new Integer[10];
		
		//Array.Stream(OBJECT_BOXED_TYPE) For boxed type e.g. integer
		//IntStream.of(OBJECT_PREMITIVE_TYPE) For primitive type e.g. int
		
		//Traditional Way to repeat a value/function
		//for (int i = 0; i < 10; i++) Repeating a value/function

		//Lambda Way		
		IntStream.range(0, 10).forEach(i ->nums[i]=++i); //Assigning value into an array
		Arrays.stream(nums).forEach(System.out::println); 
		
		System.out.println("mapToObj(IntFunction<? extends U> mapper) returns an object-valued Stream "
				+ "consisting of the results of applying the given function. This is an intermediate operation.");
		IntStream.of(nums).mapToObj(n -> Integer.toBinaryString(n)).forEach(System.out::println);
//		In alternative, Arrays.stream(nums).mapToObj(n -> Integer.toUnsignedString(n, 5)).forEach(System.out::println);
		
		System.out.println("Mapping Function of IntStream");
		IntStream.rangeClosed(1, 8).map(i -> 2 * i - 1).forEach(System.out::println);

		System.out.println("Custom Iteration and limit the size of the iteration");
		IntStream.iterate(1, i -> i+2).limit(8).forEach(System.out::println);

		System.out.println("\nPeek___");
		IntStream.of(1, 2, 3, 4)
        .filter(e -> e > 2)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(e -> e * e)
        .peek(e -> System.out.println("Mapped value: " + e))
        .sum();
		
		/** 
		 * IntSummaryStatistics
		 */
		//Get count, min, max, sum, and average for numbers
		IntSummaryStatistics stats = IntStream.of(nums)
		          .summaryStatistics();
		
		System.out.println("\nIntSummaryStatistics___");		 
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

/**		Sample#2 Using IntSummaryStatistics for list of Integer
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics statistic = numbers
		          .stream()
		          .mapToInt((x) -> x)
		          .summaryStatistics();
*/		
		
		System.out.println("\nGenerating non-repeating random number");	
	    Integer[] arr = new Integer[1000];
	    IntStream.range(0, arr.length).forEach(i ->arr[i]=++i);
	    
	    //P.S. SHUFFLE only applicables for Integer not int*
	    Collections.shuffle(Arrays.asList(arr));
	    System.out.println(Arrays.toString(arr));
	}
}
