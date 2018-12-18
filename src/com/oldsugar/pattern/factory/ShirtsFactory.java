package com.oldsugar.pattern.factory;

public class ShirtsFactory implements Factory{

	@Override
	public CreateSomething makeSomething() {
		return new CreateShirts();
	}


}
