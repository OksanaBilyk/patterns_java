package com.bharath.patterns.behavioral.template.manufacturer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {

		return "SSD";
	}

	@Override
	public String addRAM() {

		return "SRAM";
	}

	@Override
	public String addKeyboard() {

		return "handheld keyboard";
	}
}
