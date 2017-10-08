package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

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

		// to get the aggregate
		List<String> streetsList = bayAreaCities.stream()
				.flatMap(element -> element.getStreets().stream())
				.collect(Collectors.toList());
		System.out.println(streetsList);

		// to get the unique set
		Set<String> citySet = bayAreaCities.stream()
				.flatMap(element -> element.getStreets().stream())
				.collect(Collectors.toSet());
		System.out.println(citySet);

	}
}

class City {

	private String cityName;
	private Set<String> streets;

	public City(String cityName) {
		this.cityName = cityName;
		this.streets = new HashSet<>();
	}
	
	public String getName() {
		return cityName;
	}

	public void add(String street) {
		this.streets.add(street);
	}

	public Set<String> getStreets() {
		return streets;
	}
}
