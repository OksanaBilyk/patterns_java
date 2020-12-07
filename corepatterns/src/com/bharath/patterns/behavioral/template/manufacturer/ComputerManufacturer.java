package com.bharath.patterns.behavioral.template.manufacturer;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		String hardDisk = addHardDisk();
		String ram = addRAM();
		String keyboard = addKeyboard();
		System.out.println("Build computer: set " + hardDisk + " then " + ram + " and " + keyboard);
	}

	public abstract String addHardDisk();

	public abstract String addRAM();

	public abstract String addKeyboard();

}
