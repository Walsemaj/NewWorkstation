package com.test.testLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Random {
	
	public static void main(String[] args) {
		//nextInt(range) = nextInt(max - min)
		System.out.println(Java8Random.getRandomNumberInRangeUtilRan(1, 5)); // [0...5] [min=0, max=5]
		System.out.println(Java8Random.getRandomNumberInRangeUtilRan(50, 99)); // [50...99] [min=50, max=99]
		
		System.out.println("Util Random Integer in a range 0-10 inclusively");
		for (int i = 0; i < 10; i++) {
			System.out.println(Java8Random.getRandomNumberInRangeUtilRan(5, 10));
		}
		
		System.out.println("Math Random Integer in a range 0-10 inclusively");
		for (int i = 0; i < 10; i++) {
			System.out.println(Java8Random.getRandomNumberInRangeUtilRan(5, 10));
		}
		
		//Java8 new methodsd are added in util.Random
		//IntStream ints(int randomNumberOrigin, int randomNumberBound)
		System.out.println("Java8 Random Integer in a range 0-10 inclusively");
		for (int i = 0; i < 10; i++) {
			System.out.println(Java8Random.getRandomNumberInRangeUtilRan(5, 10));
		}
		
		System.out.println("IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound)");
		System.out.println("Generates random integers in a range between 33 (inclusive) and 38 (exclusive),"); 
		System.out.println("with stream size of 10 (or 10 numbers). And print out the items with forEach.");
		new Random().ints(10, 33, 38).forEach(System.out::println);
		
		System.out.println("\nGenerating non-repeating random number");	
	    Integer[] arr = new Integer[1000];
	    IntStream.range(0, arr.length).forEach(i ->arr[i]=++i);
	    
	    //P.S. SHUFFLE only applicables for Integer not int*
	    Collections.shuffle(Arrays.asList(arr));
	    System.out.println(Arrays.toString(arr));
		
	}
	
	private static int getRandomNumberInRangeUtilRan(int min, int max) {
		if(min >= max) {
			throw new IllegalArgumentException("max must be great than min");
		}
		
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	private static int getRandomNumberInRangeMathRan(int min, int max) {
		if(min >= max) {
			throw new IllegalArgumentException("max must be great than min");
		}
		
		return (int) (Math.random()) * ((max - min) + 1) + min;
	}
	
	private static int getRandomNumberInRangeJava8(int min, int max) {
		if(min >= max) {
			throw new IllegalArgumentException("max must be great than min");
		}
		
		Random r = new Random();
		
		// Random.ints(int origin, int bound) or Random.ints(int min, int max) 
		// generates a random integer from origin (inclusive) to bound (exclusive).
		return r.ints(min, (max+1)).findFirst().getAsInt();
	}
}
