package com.amdocs.apptrax.lsp;

public class Club {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.manage(new Member());
		manager.manage(new GoldMember());
		manager.manage(new LegacyMember());
		
		manager.managePlatinumRequest(new GoldMember());
	}
}
