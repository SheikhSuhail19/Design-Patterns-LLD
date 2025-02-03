package org.designpattern.structural.adapterorwrapper.iphone4schargerforiphone6s;

public class IPhone4s implements IPhone
{
	public IPhone4s()
	{
	}

	@Override
	public void OnCharge()
	{
		System.out.println("Charging Iphone 4s");
	}
}
