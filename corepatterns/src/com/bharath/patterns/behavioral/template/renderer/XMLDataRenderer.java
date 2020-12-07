package com.bharath.patterns.behavioral.template.renderer;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "XML data";
	}

	@Override
	public String processData(final String data) {
		return "Processed " + data;
	}
}
