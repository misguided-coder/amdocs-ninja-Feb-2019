package com.amdocs.apptrax.isp;

public class ArrayList implements Queue {

	@Override
	public void add(Object value) {
		System.out.println("ArrayList element added!!!");
	}

	@Override
	public void remove(int index) {
		System.out.println("ArrayList element removed from index!!!");
		
	}
}
