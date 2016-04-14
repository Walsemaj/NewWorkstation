package com.test.testLambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;
import org.perf4j.StopWatch;
import org.perf4j.log4j.Log4JStopWatch;

public class Java8ParrallelStream {
	
	static final int COUNT = 9_000_000;
	private final static Logger logger = Logger.getLogger(Java8ParrallelStream.class);
	
	public static void main(String[] args) {
		
		List <String> linkedlist = new LinkedList<>();
		Java8ParrallelStream.perf(linkedlist);
				
		List<String> arraylist = new ArrayList<>();		
		Java8ParrallelStream.perf(arraylist);		
		
		Set<String> hashset = new HashSet<>();
		Java8ParrallelStream.perf(hashset);	
		
		Set<String> linkedhashset = new LinkedHashSet<>();
		Java8ParrallelStream.perf(linkedhashset);
		
		TreeSet<String> treeset = new TreeSet<>();
		Java8ParrallelStream.perf(treeset);
	}
	
	private static void perf(Collection<String> collection) {
		StopWatch stopWatch = new Log4JStopWatch(collection.getClass().toString());
		
		IntStream.range(0, COUNT).forEach(i->collection.add("A " + i));
		
		logger.info(collection.getClass().toString());
		logger.info(collection.size());
		
		stopWatch.start();
		logger.info("testActiveIterator()");
		Java8ParrallelStream.testActiveIterator(collection);
		stopWatch.stop();

		stopWatch.start();
		logger.info("testSequential()");
		Java8ParrallelStream.testSequential(collection);
		stopWatch.stop();

		stopWatch.start();
		logger.info("testParrallel()");
		Java8ParrallelStream.testParrallel(collection);
		stopWatch.stop();
		
		collection.clear();
	}
	
	private static long testActiveIterator(Collection<String> names) {
		long count=0;
		for(String name: names) {
			if(name.startsWith("A"))
				++count;
		}
		return count;
	}
	
	private static long testSequential(Collection<String> names) {
		return names.stream().filter(n->n.startsWith("A")).count();
	}
	
	private static long testParrallel(Collection<String> names) {
		return names.parallelStream().filter(n->n.startsWith("A")).count();
	}
}
