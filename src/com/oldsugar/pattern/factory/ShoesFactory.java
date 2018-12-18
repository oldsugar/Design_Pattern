package com.oldsugar.pattern.factory;

public class ShoesFactory implements Factory{

	@Override
	public CreateSomething makeSomething() {
		return new CreateShoes();
	}


}
