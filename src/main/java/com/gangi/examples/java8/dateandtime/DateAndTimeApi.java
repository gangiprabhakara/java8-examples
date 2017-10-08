package com.gangi.examples.java8.dateandtime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeApi {

	public static void main(String[] args) {
		
		System.out.println(new Date().toString());
		
		LocalDate date = LocalDate.now();
		System.out.println(date.toString());
		
		LocalTime time = LocalTime.now();
		System.out.println(time.toString());
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.toString());
		
		Instant instant = Instant.now();
		System.out.println(instant.toString());
		
		Duration duration = Duration.between(dateTime, dateTime);
		System.out.println(duration.toString());
		
		Period period = Period.between(date, date);
		System.out.println(period.toString());
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime.toString());
		
		HijrahDate  hijrahDate = HijrahDate.now();
		System.out.println(hijrahDate.toString());
		
		JapaneseDate jpDate = JapaneseDate.now();
		System.out.println(jpDate.toString());
		
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		System.out.println(millis);

		Instant instant2 = clock.instant();
		Date legacyDate = Date.from(instant2);
		System.out.println(legacyDate);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		// prints all available timezone ids

		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());
		
		DateTimeFormatter formatter =
			    DateTimeFormatter
			        .ofPattern("MMM dd, yyyy - HH:mm");

			LocalDateTime parsed = LocalDateTime.parse("Dec 31, 2016 - 07:13", formatter);
			String string = formatter.format(parsed);
			System.out.println(string); 
	}

}
