package com.gangi.examples.java8.lamdaexpressions;

import java.util.Arrays;
import java.util.List;

public class LamdaExpressions {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
		bayAreaCities.sort((a,b) -> a.compareTo(b));
		System.out.println(bayAreaCities.toString());
	}

}
