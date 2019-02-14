package com.amdocs.apptrax.ocp;

//Developer 1
public class FacebookMessanger implements Messanger {
	
	public void send(String accountId,String message) {
		// 20 loc calling Facebook REST API
		System.out.printf("Info : %s is sent to facebook account %s.%n",message,accountId);

	}
}
