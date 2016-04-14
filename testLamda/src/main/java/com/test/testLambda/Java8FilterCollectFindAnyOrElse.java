package com.test.testLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FilterCollectFindAnyOrElse {
	public static void main(String[] args) {
		System.out.println("Classic: Filter a list");
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> result = getFilterOutput(lines, "mkyong");

		for (String temp : result) {
			System.out.println(temp);
		}

		result = lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);

		List<Person> persons = Arrays.asList(
				new Java8FilterCollectFindAnyOrElse().new Person("mkyong"), 
				new Java8FilterCollectFindAnyOrElse().new Person("michael"), 
				new Java8FilterCollectFindAnyOrElse().new Person("lawrance"));
		
		System.out.println("Classic way to get a Person by his name");
		System.out.println(getStudentByName(persons, "michael").getName());
		
		System.out.println("Streams filter(), findAny() and orElse() to return an object conditional");		
		System.out.println((persons.stream() //Convert to stream
				.filter(p -> "michael".equals(p.getName()))
				.findAny()		//If 'findAny' then return found
				.orElse(null))  //If not found, return null
				.getName());
		
		System.out.println(".filter() - Inner function");
		persons = Arrays.asList(
				new Java8FilterCollectFindAnyOrElse().new Person("mkyong", 21), 
				new Java8FilterCollectFindAnyOrElse().new Person("michael", 22),
				new Java8FilterCollectFindAnyOrElse().new Person("michael", 30),
				new Java8FilterCollectFindAnyOrElse().new Person("lawrance", 23));
		
		System.out.println(
				persons.stream().filter(p -> {
					if("michael".equals(p.getName()) && 22==p.getAge()) {
						return true;
					}
					return false;
				}).findAny().orElse(null)
				.getName());
		
		System.out.println(".map() - Convert stream to String");
		String name = persons.stream().filter(p -> "michael".equals(p.getName()))
						.map(Person::getName) //Convert stream to String
						.findAny()
						.orElse("");
		System.out.println(name);
		
		persons.stream().filter(p -> "michael".equals(p.getName()))
		.map(Person::getName).forEach(p-> System.out.println("Result: " + p));
	}

	private static List<String> getFilterOutput(List<String> lines, String filer) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!"mkyong".equals(line)) {
				result.add(line);
			}
		}
		return result;
	}

	private static Person getStudentByName(List<Person> persons, String name) {
		Person result = null;
		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}
	
	class Person {
		private String name;
		private int age;
		
		public Person(String name) { this.name = name; }
		public Person(String name, int age) { this.name = name; this.age = age;}
		public String getName() { return name; }
		public int getAge() { return age; }
	}
}
