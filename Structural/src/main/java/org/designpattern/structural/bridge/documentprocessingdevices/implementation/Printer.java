package org.designpattern.structural.bridge.documentprocessingdevices.implementation;

public class Printer implements OutputDevice
{
	@Override
	public void renderContent(String content)
	{
		System.out.println("Printing: " + content);
	}
}
