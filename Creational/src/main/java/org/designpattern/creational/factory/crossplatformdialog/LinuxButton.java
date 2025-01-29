package org.designpattern.creational.factory.crossplatformdialog;

public class LinuxButton implements Button
{
	@Override
	public void render()
	{
		System.out.println("Rendered Linux Button");
	}

	@Override
	public void onClick()
	{
		System.out.println("Clicked Linux Button");
	}
}
