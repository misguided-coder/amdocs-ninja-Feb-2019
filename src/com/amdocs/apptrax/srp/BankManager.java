package com.amdocs.apptrax.srp;

public class BankManager {

	public static void main(String[] args) {
		
		AccountService accountService = new AccountService();
		accountService.open();
		SMSService.sendSMS("Open");
		EmailService.sendEmail("Open");
		WhatsAppService.sendWhatsApp("Open");
	}

}
