package com.amdocs.apptrax.lsp;

public class LegacyMember extends Member implements ILegacy {

	public void useBar() {
		System.out.println("LegacyMember can use bar inside club!!!!");
	}

	public void useGym() {
		System.out.println("LegacyMember can use gym inside club!!!!");
	}

	public void useAccomodation() {
		System.out.println("LegacyMember can use accomodation inside club!!!!");
	}
	
}
