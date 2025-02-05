package org.designpattern.structural.bridge.documentprocessingdevices.implementation;

public class Projector implements OutputDevice
{
	@Override
	public void renderContent(String content)
	{
		System.out.println("Projecting: " + content);
	}
}
