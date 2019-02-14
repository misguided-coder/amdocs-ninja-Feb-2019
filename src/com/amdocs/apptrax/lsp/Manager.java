package com.amdocs.apptrax.lsp;

public class Manager {

	public void manage(Member member) {
		member.useCafetaria();
		member.usePlayGround();
	}

	public void managePlatinumRequest(IPlatinum platinum) {
		platinum.applyForPlatinum();
	}

}
