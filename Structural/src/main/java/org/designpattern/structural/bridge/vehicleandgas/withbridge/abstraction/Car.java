package org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction;

import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Fuel;

public class Car extends AbstractVehicle
{
	public Car(Fuel fuel)
	{
		super(fuel);
	}

	@Override
	public String getNickName()
	{
		return "Shiny Car";
	}
}
