package com.amdocs.apptrax.lsp;

public class GoldMember extends Member implements IGold,IPlatinum {
	
	@Override
	public boolean isGold() {
		return true;
	}
	
	public void useBar() {
		System.out.println("GoldMember can use bar inside club!!!!");
	}
	
	@Override
	public void applyForPlatinum() {
		System.out.println("GoldMember can apply for upgrade to platinum!!!!");
	}
	
}
