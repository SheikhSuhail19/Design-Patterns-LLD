package org.designpattern.creational.abstractfactory.crossplatformui;

public class WinCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("WinCheckbox");
	}
}
