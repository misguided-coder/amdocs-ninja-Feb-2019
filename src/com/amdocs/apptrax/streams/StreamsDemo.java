package com.amdocs.apptrax.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,67,43,65,87,98,12,23,54,67,89,12,90,80,60,20,45,55,66,22,11);
		
		//numbers.stream().forEach((value)->System.out.printf("Value is %s%n",value));
		//numbers.stream().map((value)-> value*value).forEach((value)->System.out.printf("Square is %s%n",value));
		int rs= numbers.stream().map((value)-> value*value).reduce((accumulator,value)-> accumulator+value).get();
		System.out.println(rs);		
	}
}
