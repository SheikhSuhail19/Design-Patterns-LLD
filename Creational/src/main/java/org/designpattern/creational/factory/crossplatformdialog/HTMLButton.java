package org.designpattern.creational.factory.crossplatformdialog;

public class HTMLButton implements Button
{
	@Override
	public void render()
	{
		System.out.println("Rendered HTML Button");
	}

	@Override
	public void onClick()
	{
		System.out.println("Clicked HTML Button");
	}
}