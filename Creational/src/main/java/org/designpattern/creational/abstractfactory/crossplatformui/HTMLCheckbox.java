package org.designpattern.creational.abstractfactory.crossplatformui;

public class HTMLCheckbox implements Checkbox
{
	@Override
	public void paint()
	{
		System.out.println("HTMLCheckbox");
	}
}
