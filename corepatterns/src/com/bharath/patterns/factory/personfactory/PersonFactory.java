package com.bharath.patterns.factory.personfactory;

public class PersonFactory {

	static Person createPerson(String sex) {
		Person person = null;
		if (sex.equalsIgnoreCase("male")) {
			person = new Male();
		}
		else if (sex.equalsIgnoreCase("female")) {
			person = new Female();
		}
		return person;
	}

}
