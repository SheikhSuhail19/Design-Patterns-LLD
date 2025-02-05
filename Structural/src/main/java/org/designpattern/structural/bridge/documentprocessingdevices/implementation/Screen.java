package org.designpattern.structural.bridge.documentprocessingdevices.implementation;

public class Screen implements OutputDevice
{
	@Override
	public void renderContent(String content)
	{
		System.out.println("Displaying on Screen: " + content);
	}
}
