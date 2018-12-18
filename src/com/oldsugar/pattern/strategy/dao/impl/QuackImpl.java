package com.oldsugar.pattern.strategy.dao.impl;

import com.oldsugar.pattern.strategy.dao.QuackBehavior;

public class QuackImpl implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack...........");
	}

}
