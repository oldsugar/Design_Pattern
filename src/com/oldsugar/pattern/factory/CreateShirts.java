package com.oldsugar.pattern.factory;


public class CreateShirts implements CreateSomething {

	@Override
	public void createSomething() {
		System.out.println("create shirts...");
	}

}
