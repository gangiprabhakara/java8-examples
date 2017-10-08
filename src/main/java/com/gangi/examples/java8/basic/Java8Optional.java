package com.gangi.examples.java8.basic;

import java.util.Optional;

public class Java8Optional {

	public static void main(String[] args) {
		Optional<String> optional = Optional.of("Gangi");

		System.out.println(optional.isPresent()); 
		System.out.println(optional.get());
		System.out.println(optional.orElse("fallback"));

		optional.ifPresent((s) -> System.out.println(s.charAt(0)));
		
		optional = Optional.ofNullable(null);

		System.out.println(optional.isPresent()); 
		//System.out.println(optional.get());
		System.out.println(optional.orElse("fallback"));

		optional.ifPresent((s) -> System.out.println(s.charAt(0))); 

	}

}
