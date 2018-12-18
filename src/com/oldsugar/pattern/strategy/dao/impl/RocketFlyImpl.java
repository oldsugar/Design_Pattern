package com.oldsugar.pattern.strategy.dao.impl;

import com.oldsugar.pattern.strategy.dao.FlyBehavior;

public class RocketFlyImpl implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("fly with rocket......");
	}

}
