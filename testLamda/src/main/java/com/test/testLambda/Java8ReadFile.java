package com.test.testLambda;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ReadFile {
	public static void main(String[] args) {
		String filename = "lines.txt";
		
		//Java8 Read File + Stream + try-with-resources
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(filename))) 
		{
			stream.forEach(System.out::println);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Read File + Stream + Filter + Collectors");
		List<String> list = new ArrayList();
		try(Stream<String> stream = Files.lines(Paths.get(filename))) {
			
			//1. filter line 3
			//2. convert all content to upper case [.map the given function]
			//3. convert it into a List [.collect]
			list = stream.filter(line-> !line.startsWith("line3")).map(String::toUpperCase).collect(Collectors.toList());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);
		
		System.out.println("Buffered Reader + Stream");
		try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))) {
			
			//br returns as stream and convert it into a List
			list = br.lines().filter(line-> !line.startsWith("line3")).collect(Collectors.toList());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);
	}
}
