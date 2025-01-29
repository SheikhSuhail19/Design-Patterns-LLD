package org.designpattern.creational.abstractfactory.crossplatformui;

public class HTMLButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("HTMLButton");
	}
}
