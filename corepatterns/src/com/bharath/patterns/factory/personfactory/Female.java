package com.bharath.patterns.factory.personfactory;

public class Female implements Person {

	@Override
	public void wish(final String msg) {
		System.out.println("Female wishes a " + msg);
	}
}
