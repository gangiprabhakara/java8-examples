package com.gangi.examples.java8.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachMap {

	public static void main(String[] args) {
        
        Map<String, Integer> bayAreaCitiesPopulation = new HashMap<>();
        bayAreaCitiesPopulation.put("Fremont", 100000);
        bayAreaCitiesPopulation.put("San Francisco", 200000);
        bayAreaCitiesPopulation.put("Menlo Park", 25000);
        bayAreaCitiesPopulation.put("Oakland", 150000);
        
        //Usage 1
        bayAreaCitiesPopulation.forEach((k,v) -> System.out.println("City : " + k + " Population : " + v));
        
        //Usage 2
        bayAreaCitiesPopulation.forEach((k,v) -> {
        	System.out.println("City : " + k + " Population : " + v);
        	
        	if(k.equals("Fremont")) {
        		System.out.println("***** It's my city. ***************");
        	}
        	
        });
        
        //Usage 3
        bayAreaCitiesPopulation.forEach(new MyBiConsumer());
        
        //Usage 4
        bayAreaCitiesPopulation.forEach(new MyBiConsumer().andThen(new MyBiConsumer2()));
        
	}
}

class MyBiConsumer implements BiConsumer<String, Integer> {

	@Override
	public void accept(String cityName, Integer population) {
		System.out.println("City : " + cityName + " Population : " + population);
	}
}

class MyBiConsumer2 implements BiConsumer<String, Integer> {

	@Override
	public void accept(String cityName, Integer population) {
		System.out.println("Percentage:" + (population/4750));
	}
}
