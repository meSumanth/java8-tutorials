package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author Sumanth
 *
 */
public class StringJoinerDemo {
	
	public static void main(String[] args) {
		
		System.out.println("String Joiner: "+ withStringJoiner());
		
		System.out.println("With Prefix & Suffix: "+ withPrefixSuffix());
		
		System.out.println("With Join: "+ withJoin());
		
		System.out.println("With List: "+ joinWithList());
		
		System.out.println("With Collectors: "+ withCollectors());
		
	}
	
	private static String withStringJoiner()
	{
		StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result = sj.toString();
        return result;
	}
	
	private static String withPrefixSuffix()
	{
		StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
        sj.add("1992");
        sj.add("06");
        sj.add("09");
        String result = sj.toString();
        return result;
	}
	
	private static String withJoin()
	{
		String result = String.join("-", "2015", "10", "31" );
		return result;
	}
	
	private static String joinWithList()
	{
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		return String.join(",", list);
	}
	
	private static String withCollectors()
	{
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		return list.stream().map(x-> x).collect(Collectors.joining(","));
	}

}
