package com.test.testLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8StreamReduce {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");
		
		System.out.println("Sum without reduce");
		Stream<String> sumStream = list.stream();
		int s = sumStream.map(x -> x.length())
				.mapToInt(Integer::new)
				.sum();		 
		System.out.println(s);

		System.out.println("Sum via reduce & optional type");
		Stream<String> reduceStream = list.stream();
		Stream<Integer> lengthStream = reduceStream.map(x -> x.length());
		Optional<Integer> sum = lengthStream.reduce((x, y) -> x + y);
		sum.ifPresent(System.out::println);
		
		//In the previous example, the reduce() method returns an Optional. 
		//We can avoid optional type, by giving it an initial value [0]:
		System.out.println("Sum via reduce, but avoid optional type");
		Stream<Integer> lengthStream2 = list.stream().map(x->x.length());
		int sum2 = lengthStream2.reduce(0, (x, y) -> x + y);
		System.out.println(sum2);
		
		/*
		 * The three parameters of reduce() are identify, reducer, and combiner.
			- identity - identity value for the combiner function
			- reducer - function for combining two results
			- combiner - function for adding an additional element into a result.
			
			Example 
				reduct({identity}, {reducer}, {combiner})
				reduce(0, (x,y)->x+y.length(), (x,y)->x+y);
				reduct(0, (x,y)->x+y).
							
		 */
		System.out.println("Sum via reduce, with identity, reducer & combiner");
		Stream<String> wordStream = list.stream();
		int l = wordStream.reduce(0, (x, y) -> x + y.length(), (x, y) -> x + y);
		System.out.println(s);
	}
}
