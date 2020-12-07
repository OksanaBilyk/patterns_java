package com.bharath.patterns.behavioral.template.manufacturer;

public class ManufacturerTest {

	public static void main(String[] args) {
		ComputerManufacturer cm = new LaptopManufacturer();
		cm.buildComputer();
	}

}
