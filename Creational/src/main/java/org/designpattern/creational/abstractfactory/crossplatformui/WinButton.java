package org.designpattern.creational.abstractfactory.crossplatformui;

// Concrete products are created by corresponding concrete
// factories.

public class WinButton implements Button
{
	@Override
	public void paint()
	{
		System.out.println("WinButton");
	}
}
