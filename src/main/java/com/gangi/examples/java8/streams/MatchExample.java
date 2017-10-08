package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
		System.out.println(bayAreaCities.stream().anyMatch(city -> city.length() > 8));
		
		System.out.println(bayAreaCities.stream().allMatch(city -> city.length() > 5));
		
		System.out.println(bayAreaCities.stream().noneMatch(city -> city.length() > 100));

	}

}
