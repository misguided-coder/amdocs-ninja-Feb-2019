package com.amdocs.apptrax.isp;

public interface Dequeue extends Queue {
	void peek(Object value);
	void poll();
}
