package com.bharath.patterns.behavioral.template.manufacturer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public String addHardDisk() {
		return "HDD";

	}

	@Override
	public String addRAM() {

		return "DRAM";
	}

	@Override
	public String addKeyboard() {

		return "wireless keyboard";
	}
}
