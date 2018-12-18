package com.oldsugar.pattern.factory;

public class TestFactory {
	public static void main(String[] args) {
		Factory factory = new ShoesFactory();
		CreateSomething createSomething = factory.makeSomething();
		createSomething.createSomething();
	}
}
