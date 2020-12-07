package com.bharath.patterns.behavioral.template.renderer;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV data";
	}

	@Override
	public String processData(final String data) {
		return "Processed " + data;
	}
}
