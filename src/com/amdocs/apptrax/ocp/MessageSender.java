package com.amdocs.apptrax.ocp;

//Developer 1
public class MessageSender {

	public void sendMessage(String accountID,String message,Messanger messanger) {
		//10 loc
		messanger.send(accountID, message);
		System.out.println("Done!!!");
	}
}
