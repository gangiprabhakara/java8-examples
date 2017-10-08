package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");

		List<Integer> cityNameLengths = bayAreaCities.stream().map(s -> s.length()).collect(Collectors.toList());
		System.out.println(cityNameLengths);

	}

}
