package org.designpattern.structural.adapterorwrapper.iphone4schargerforiphone6s;

public class Iphone4sCharger implements Charger
{
	public Iphone4sCharger()
	{
	}

	@Override
	public void charge()
	{
		System.out.println("Charging Iphone 4s");
	}
}
