package org.designpattern.creational.abstractfactory.crossplatformui;

public class MacCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("MacCheckbox");
	}
}
