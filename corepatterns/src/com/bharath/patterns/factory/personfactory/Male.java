package com.bharath.patterns.factory.personfactory;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println("Male wishes a " + msg);
	}
}
