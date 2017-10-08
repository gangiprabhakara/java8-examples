package com.gangi.examples.java8.lamdaexpressions;

public class MethodAndConstructorReferences {

	public static void main(String[] args) {
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);   // 123
		
		
		Something something = new Something();
		Converter<String, String> converter2 = something::startsWith;
		String converted2 = converter2.convert("Java");
		System.out.println(converted2);    // "J"
		
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Prabhakara", "Gangi");
		System.out.println(person.firstName);

	}

}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}