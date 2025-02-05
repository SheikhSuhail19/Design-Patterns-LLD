package org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction;

import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Fuel;

public class Bike extends AbstractVehicle
{
	public Bike(Fuel fuel)
	{
		super(fuel);
	}

	@Override
	public String getNickName()
	{
		return "Cool Bike";
	}
}
