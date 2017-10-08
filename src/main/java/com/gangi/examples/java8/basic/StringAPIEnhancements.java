package com.gangi.examples.java8.basic;

import java.util.Arrays;
import java.util.List;

public class StringAPIEnhancements {

	public static void main(String[] args) {
		//String join actually uses StringJoiner
		System.out.println(String.join("/", "", "Users", "pgangi", "work"));
		
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
		System.out.println(String.join(",", bayAreaCities));
		
	}

}
