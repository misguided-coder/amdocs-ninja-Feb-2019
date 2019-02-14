package com.amdocs.apptrax.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		currentDate = currentDateTime.toLocalDate();
		currentTime = currentDateTime.toLocalTime();
		System.out.println(currentDate);
		System.out.println(currentTime);
		
		currentDate = LocalDate.of(2010, 11, 12);
		System.out.println(currentDate);
	
		currentDate = LocalDate.ofYearDay(2012,200);
		System.out.println(currentDate);
		
	}

}
