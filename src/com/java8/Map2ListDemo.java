package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sumanth
 *
 */
public class Map2ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        List<Integer> result1 = new ArrayList<>(map.keySet());
        System.out.println(result1);
        
        List<String> result2 = new ArrayList<>(map.values());
        System.out.println(result2);
        
        List<String> result3 = map.values().stream().map(x-> x).collect(Collectors.toList());
        System.out.println(result3);
        
        List<String> result4 = map.values().stream().collect(Collectors.toList());
        System.out.println(result4);
        
        List<String> result5 = map.values().stream().filter(x-> !"banana".equalsIgnoreCase(x)).collect(Collectors.toList());
        System.out.println(result5);
        
	}

}
