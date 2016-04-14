package com.test.testLambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java8ForEach {
	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//Classic: For Each
		for(Map.Entry<String, Integer> entry: items.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
				
		//Java8: For Each
		items.forEach((k, v)-> System.out.println(k + " " + v));
		
		items.forEach((k, v)->{ 
			System.out.println(k + " " + v);
			if("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
		
		List<String> characters = new ArrayList<>();
		characters.add("A");
		characters.add("B");
		characters.add("C");
		characters.add("D");
		characters.add("E");
		
		characters.forEach(character->System.out.println(character));	
		
		characters.forEach(character->{ System.out.println(character);
		if("E".equals(character))
				System.out.println("Hello E");
		});
		
		characters.forEach(System.out::println);
	}
}
