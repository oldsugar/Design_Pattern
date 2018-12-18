package com.oldsugar.pattern.strategy.product;

import com.oldsugar.pattern.strategy.dao.impl.FlyImpl;
import com.oldsugar.pattern.strategy.dao.impl.QuackImpl;
import com.oldsugar.pattern.strategy.model.Duck;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
//		quackBehavior.quack();
//		flyBehavior.fly();
		quackBehavior = new QuackImpl();
		flyBehavior = new FlyImpl();
	}

	@Override
	public void display() {
		System.out.println("I m mallardFuck!!~~~~");
	}

}
