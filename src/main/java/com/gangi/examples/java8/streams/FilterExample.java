package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");

		List<String> filteredCities = bayAreaCities.stream().filter(s -> s.length() > 7).collect(Collectors.toList());
	    System.out.println(filteredCities);
	    
	    bayAreaCities.parallelStream()
	    .filter(s -> {
	        System.out.format("filter: %s [%s]\n",
	            s, Thread.currentThread().getName());
	        return true;
	    })
	    .map(s -> {
	        System.out.format("map: %s [%s]\n",
	            s, Thread.currentThread().getName());
	        return s.toUpperCase();
	    })
	    .sorted((s1, s2) -> {
	        System.out.format("sort: %s <> %s [%s]\n",
	            s1, s2, Thread.currentThread().getName());
	        return s1.compareTo(s2);
	    })
	    .forEach(s -> System.out.format("forEach: %s [%s]\n",
	        s, Thread.currentThread().getName()));
	}

}
