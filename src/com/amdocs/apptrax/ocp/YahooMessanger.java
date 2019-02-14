package com.amdocs.apptrax.ocp;

//Developer 1
public class YahooMessanger implements Messanger {
	
	public void send(String accountId,String message) {
		// 100 loc calling Yahoo Web/REST API
		System.out.printf("Info : %s is sent to yahoo account %s.%n",message,accountId);

	}
}
