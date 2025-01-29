package org.designpattern.creational.abstractfactory.crossplatformui;

public class MacButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("MacButton");
	}
}
