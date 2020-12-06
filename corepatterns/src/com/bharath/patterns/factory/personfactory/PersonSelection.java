package com.bharath.patterns.factory.personfactory;

public class PersonSelection {

	public Person selectPerson(String sex) {
		Person person = PersonFactory.createPerson(sex);
		person.wish("new car");
		return person;
	}
}
