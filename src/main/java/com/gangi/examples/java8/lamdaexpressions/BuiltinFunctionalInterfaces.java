package com.gangi.examples.java8.lamdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BuiltinFunctionalInterfaces {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
		
		//1.Predicates (Used for filtering)
		System.out.println("Predicate usage Start");
		Predicate<String> lengthPredicate = (String s) -> s.length() > 7;
		List<String> filteredCities = bayAreaCities.stream().filter(lengthPredicate).collect(Collectors.toList());
		System.out.println(filteredCities.toString());
		System.out.println("Predicate usage End");
		
		//2.Functions
		System.out.println("Function usage Start");
		Function<String, Integer> lengthConverter = (String s) -> s.length();
		List<Integer> lengths = bayAreaCities.stream().map(lengthConverter).collect(Collectors.toList());
		System.out.println(lengths);
		System.out.println("Function usage End");
		
		//3.Suppliers
		System.out.println("Supplier usage Start");
		
		
		
		System.out.println("Supplier usage End");
		
		//4.Consumers (Used to perform some action for each element
		System.out.println("Consumer usage Start");
		bayAreaCities.forEach(new MyConsumer());
		System.out.println("Consumer usage End");
		
		//5.Comparators
		System.out.println("Comparator usage Start");
		//Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);
		Comparator<String> comparator = Comparator.comparingInt(String::length); 
		//bayAreaCities.sort(comparator);
		List<String> orderedCities = bayAreaCities.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println(orderedCities.toString());
		System.out.println("Comparator usage End");
		

	}

}

class MyConsumer implements Consumer<String> {

	public void accept(String cityName) {
		System.out.println(cityName);
	}
}
