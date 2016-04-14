package com.test.testLambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8FilterAMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "c");
		
		String result="";
		System.out.println("Classic: Search in a map");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			if("b".equals(entry.getValue())) {
				result = entry.getValue();
			}
		}
		System.out.println(result);
		
		System.out.println("Map -> Stream -> Filter -> String");
		result = map.entrySet().stream().filter(m -> "b".equals(m.getValue())).map(m -> m.getValue()).collect(Collectors.joining());
		System.out.println(result);
		
		System.out.println("Map -> Stream -> Filter -> Map");
		Map<Integer, String> resultMap = (Map<Integer, String>)map.entrySet().stream().filter(m -> m.getKey() == 2).collect(Collectors.toMap(p->p.getKey(), p->p.getValue()));
		System.out.println(resultMap);
	}
}
