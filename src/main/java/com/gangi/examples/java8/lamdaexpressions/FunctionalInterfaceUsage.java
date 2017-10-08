package com.gangi.examples.java8.lamdaexpressions;

public class FunctionalInterfaceUsage {

	public static void main(String[] args) {
		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);

	}

}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
