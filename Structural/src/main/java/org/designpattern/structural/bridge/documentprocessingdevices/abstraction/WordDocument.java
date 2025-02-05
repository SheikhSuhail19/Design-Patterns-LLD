package org.designpattern.structural.bridge.documentprocessingdevices.abstraction;

import org.designpattern.structural.bridge.documentprocessingdevices.implementation.OutputDevice;

public class WordDocument extends AbstractDocument {
	public WordDocument(OutputDevice outputDevice) {
		super(outputDevice);
	}

	@Override
	public String getContent() {
		return "Word Content";
	}
}
