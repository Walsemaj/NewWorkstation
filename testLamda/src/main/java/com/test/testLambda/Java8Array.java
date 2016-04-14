package com.test.testLambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;

public class Java8Array {
	public static void main(String[] args) {		
		//Object Type Arrays
		String[] s1 = new String[] {"a", "b", "c"};
		String[] s2 = new String[] {"d", "e", "f"};
		
		//Primitive Type Arrays
		int[] int1 = new int[]{1,2,3};
		int[] int2 = new int[]{4,5,6};
		
		System.out.println("Apache Commons Lang – ArrayUtils");
		String[] result = ArrayUtils.addAll(s1, s2);		
		System.out.println(Arrays.toString(result));		
		
		int[] result2 = ArrayUtils.addAll(int1, int2);		
		System.out.println(Arrays.toString(result2));

		System.out.println("Pure Java API example, supports both primitive and generic types");
		result = joinArrayGeneric(s1, s2);
		result2 = joinArray(int1, int2);
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
		
		System.out.println("Java 8 Stream example to join arrays");
		
		//join object type array
		result = Stream.of(s1, s2).flatMap(Stream::of).toArray(String[]::new);
		System.out.println(Arrays.toString(result));
				
		result2 = IntStream.concat(Arrays.stream(int1), Arrays.stream(int2)).toArray();
		System.out.println(Arrays.toString(result2));
		
		int[] int3 = new int[]{7, 8, 9};
		System.out.println(Arrays.toString(IntStream.concat(Arrays.stream(int1), IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray()));
	}

	static <T> T[] joinArrayGeneric(T[]...arrays) {
		int length = 0;
		
		for(T[] array: arrays) {
			length += array.length;
		}
		
		//T[] result = new T[length]
		final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
		
		int offset = 0;
		
		for(T[] array: arrays) {
			System.arraycopy(array, 0, result, offset, array.length);
			offset += array.length;
		}
		
		return result;
	}
	
	static int[] joinArray(int[]... arrays) {
		int length = 0;
		for(int[] array: arrays) {
			length += array.length;
		}
		
		final int[] result = new int[length];
		
		int offset = 0;
		for(int[] array: arrays) {
			System.arraycopy(array, 0, result, offset, array.length);
			offset += array.length;
		}		
		
		return result;
	}
}
