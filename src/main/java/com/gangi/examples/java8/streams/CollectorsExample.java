package com.gangi.examples.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
		
		//joining()
		String result = bayAreaCities.stream().map(s -> s).collect(Collectors.joining());
        System.out.println(result);
        
        result = bayAreaCities.stream().map(s -> s).collect(Collectors.joining(" | "));
        System.out.println(result);
        
        result = bayAreaCities.stream().map(s -> s).collect(Collectors.joining(", ", "{", "}"));
        System.out.println(result);
        
        //toList()
        List<String> filteredCities = bayAreaCities.stream().filter(s -> s.length() > 7).collect(Collectors.toList());
	    System.out.println(filteredCities);
	    
	    //toSet()
        Set<String> filteredCitiesSet = bayAreaCities.stream().filter(s -> s.length() > 7).collect(Collectors.toSet());
	    System.out.println(filteredCitiesSet);
	    
	    //groupBy
		List<City> cities = getCities();
		Map<String, List<City>> groupByMap = cities.stream().collect(
				Collectors.groupingBy(City::getName));
		
		groupByMap.forEach((k,v) -> {
			System.out.println(k);
			v.forEach(city -> System.out.println(city.getStreets()));
		});
		
		//partioningBy
		Map<Boolean, List<City>> partitionMap = cities.stream().collect(
				Collectors.partitioningBy(city -> city.getStreets().size()> 2));
		
		partitionMap.forEach((k,v) -> {
			System.out.println(k);
			v.forEach(city -> System.out.println(city.getStreets()));
		});
		
	
	}
	
	private static List<City> getCities() {
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
		return Arrays.asList(oakland, sanFrancisco, menloPark, fremont);
	}

}
