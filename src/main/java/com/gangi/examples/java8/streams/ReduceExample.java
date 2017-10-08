package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		City oakland = new City("Oakland");
		oakland.add("15th St");
		oakland.add("10th St");
		oakland.add("Jackson St");
		oakland.add("Harrison St");

		City sanFrancisco = new City("San Francisco");
		sanFrancisco.add("Battery St");
		sanFrancisco.add("North Point St");
		sanFrancisco.add("Jackson St");
		
		City menloPark = new City("Menlo Park");
		menloPark.add("Willow Rd");
		menloPark.add("Middlefield Rd");
		
		City fremont = new City("Fremont");
		fremont.add("Fallas Ter");
		fremont.add("Paseo Padre Pkwy");
		
		List<City> bayAreaCities = Arrays.asList(oakland, sanFrancisco, menloPark, fremont);

		bayAreaCities.stream()
				.reduce((c1, c2) -> c1.getStreets().size() > c2.getStreets().size() ? c1 : c2)
				.ifPresent(System.out::println);
		
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80);
		
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		
		System.out.println(numbers.stream().reduce(0, (output, number) -> output + number, (a,b) -> a+b));
		
		

	}
}

