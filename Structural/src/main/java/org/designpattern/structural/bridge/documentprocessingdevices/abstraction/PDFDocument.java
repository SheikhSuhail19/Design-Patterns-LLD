package org.designpattern.structural.bridge.documentprocessingdevices.abstraction;

import org.designpattern.structural.bridge.documentprocessingdevices.implementation.OutputDevice;

public class PDFDocument extends AbstractDocument {
	public PDFDocument(OutputDevice outputDevice) {
		super(outputDevice);
	}

	@Override
	public String getContent() {
		return "PDF Content";
	}
}
