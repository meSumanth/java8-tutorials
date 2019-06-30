package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Sumanth
 *
 */
public class Stram2List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stream<String> stream = Stream.of("java","oracle","python");
		List<String> list = stream.collect(Collectors.toList());
		System.out.println(list);
		
		list.forEach(System.out::println);
		
		Stream<String> stream2 = Stream.of("java","oracle","python");
		List<String> list2 = stream2.filter(x-> !"java".equalsIgnoreCase(x)).collect(Collectors.toList());
		System.out.println(list2);
		
		Stream<String> stream3 = Stream.of("java","oracle","python");
		List<String> list3 = stream3.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list3);
		
	}

}
