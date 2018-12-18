package com.oldsugar.pattern.strategy.product;

import com.oldsugar.pattern.strategy.dao.impl.FlyImpl;
import com.oldsugar.pattern.strategy.dao.impl.QuackImpl;
import com.oldsugar.pattern.strategy.model.Duck;

public class ModelDuck extends Duck{
	public ModelDuck() {
		quackBehavior = new QuackImpl();
		flyBehavior = new FlyImpl();
	}

	@Override
	public void display() {
		System.out.println("I M NEW duck!!!");		
	}

}
