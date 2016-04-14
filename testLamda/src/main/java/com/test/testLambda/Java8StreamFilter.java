package com.test.testLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8StreamFilter {
	public static void main(String[] args) {
		
		List<String> characters = new ArrayList<>();
		characters.add("A");
		characters.add("B");
		characters.add("C");
		characters.add("D");
		characters.add("E");
				
		//Steam & Filter
		characters.stream().filter(character->character.contains("B")).forEach(System.out::println);
	}
}
