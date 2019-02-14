package com.amdocs.apptrax.ocp;

//Developer 2
public class Main {

	public static void main(String[] args) {
		
		MessageSender messageSender = new MessageSender();
		messageSender.sendMessage("@amitabh", "$100 million dollar debited",new TwitterMessanger());
		messageSender.sendMessage("amitabh.bacchan", "$100 million dollar debited",new FacebookMessanger());
		messageSender.sendMessage("amitabh", "$100 million dollar debited",new YahooMessanger());
	}
}
