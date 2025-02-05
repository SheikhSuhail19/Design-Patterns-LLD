package org.designpattern.structural.bridge.documentprocessingdevices.abstraction;

import org.designpattern.structural.bridge.documentprocessingdevices.implementation.OutputDevice;

public class ExcelDocument extends AbstractDocument
{

	public ExcelDocument(OutputDevice outputDevice)
	{
		super(outputDevice);
	}

	@Override
	public String getContent()
	{
		return "Excel Content";
	}
}
