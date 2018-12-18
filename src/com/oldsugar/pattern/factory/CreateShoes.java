package com.oldsugar.pattern.factory;


public class CreateShoes implements CreateSomething {

	@Override
	public void createSomething() {
		System.out.println("create shoes...");
	}

}
