package com.gangi.examples.java8.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesExample {

	public static void main(String[] args) {
		try (Stream<Path> stream = Files.list(Paths.get("/Users/pgangi/work/git"))) {
		    String joined = stream
		        .map(String::valueOf)
		        .filter(path -> !path.startsWith("."))
		        .sorted()
		        .collect(Collectors.joining("; "));
		    System.out.println("List: " + joined);
		} catch (IOException e) {
		}

	}

}
