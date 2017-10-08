package com.gangi.examples.java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachList {

	public static void main(String[] args) {
        List<String> bayAreaCities = Arrays.asList("Fremont", "San Francisco", "Menlo Park", "Oakland");
        
        //Usage 1
        bayAreaCities.forEach(System.out::println);
        
        //Usage 2
        bayAreaCities.forEach(ForEachList::printCityName);
        
        //Usage 3
        bayAreaCities.forEach(new MyConsumer());
        
        //Usage 4
        bayAreaCities.forEach(new Consumer<String>() {
        	public void accept(String cityName) {
        		System.out.println(cityName);
        	}
        });
        
        //Usage 5
        bayAreaCities.stream().forEach(System.out::println);
        
        //Usage 6
        bayAreaCities.stream().forEach(ForEachList::printCityName);
        
        //Usage 7
        bayAreaCities.stream().forEach(new MyConsumer());
        
        //Usage 8
        bayAreaCities.stream().forEach(new Consumer<String>() {
        	public void accept(String cityName) {
        		System.out.println(cityName);
        	}
        });
        
	}
	
	private static void printCityName(String cityName) {
		System.out.println(cityName);
	}

}

class MyConsumer implements Consumer<String> {

	public void accept(String cityName) {
		System.out.println(cityName);
	}
}
