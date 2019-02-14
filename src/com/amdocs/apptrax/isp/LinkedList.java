package com.amdocs.apptrax.isp;

public class LinkedList implements Dequeue {

	@Override
	public void add(Object value) {
		System.out.println("LinkedList element added!!!");
	}

	@Override
	public void remove(int index) {
		System.out.println("LinkedList element removed from index!!!");
		
	}

	@Override
	public void peek(Object value) {
		System.out.println("LinkedList element added at the tail!!!");
	}

	@Override
	public void poll() {
		System.out.println("LinkedList element removed from head!!!");
	}
}
