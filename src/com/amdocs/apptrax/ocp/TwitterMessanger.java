package com.amdocs.apptrax.ocp;

//Developer 1
public class TwitterMessanger implements Messanger {
	
	public void send(String accountId,String message) {
		// 100 loc calling Twitter REST API
		System.out.printf("Info : %s is sent to twitter account %s.%n",message,accountId);

	}
}
