package com.oldsugar.pattern.strategy.model;

import com.oldsugar.pattern.strategy.dao.FlyBehavior;
import com.oldsugar.pattern.strategy.dao.QuackBehavior;
import com.oldsugar.pattern.strategy.dao.impl.RocketFlyImpl;
import com.oldsugar.pattern.strategy.product.MallardDuck;
import com.oldsugar.pattern.strategy.product.ModelDuck;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public abstract void display();
	public void swim() {
		System.out.println("swim����������������");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}

	
	
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new RocketFlyImpl());
		modelDuck.performFly();
	}
}
