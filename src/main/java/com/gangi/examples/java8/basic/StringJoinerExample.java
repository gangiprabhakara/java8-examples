package com.gangi.examples.java8.basic;

import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("Fremont");
		sj.add("San Francisco");
		sj.add("San Jose");
		
		System.out.println(sj.toString());
		
		//creating instance with delimiter, prefix, suffix
		sj = new StringJoiner(", ", "{", "}");
		sj.add("Fremont");
		sj.add("San Francisco");
		sj.add("San Jose");
		
		System.out.println(sj.toString());
		
		//method chars creates a stream for all characters of the string, 
		//so you can use stream operations upon those characters
		String result = "foobar:foo:bar"
	    .chars()
	    .distinct()
	    .mapToObj(c -> String.valueOf((char)c))
	    .sorted()
	    .collect(Collectors.joining());
		
		System.out.println(result);
		
	}

}
