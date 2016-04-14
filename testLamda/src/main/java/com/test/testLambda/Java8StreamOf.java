package com.test.testLambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamOf {
	public static void main(String[] args) { 
		System.out.println(Java8StreamOf.toLowerUnderscore("ASDF1234asdf"));
	}
	
	//Input ASDF1234asdf
    private static String toLowerUnderscore(String upperCamel) {
    	
//    	a
//    	s
//    	d
//    	f1234asdf    	
    	Stream
        .of(upperCamel.split("(?=[A-Z])"))
        .map(s -> s.toLowerCase()).forEach(System.out::println);;

//      a_s_d_f1234asdf
        return Stream
                .of(upperCamel.split("(?=[A-Z])"))
                .map(s -> s.toLowerCase())
                .collect(Collectors.joining("_"));
    }
}
