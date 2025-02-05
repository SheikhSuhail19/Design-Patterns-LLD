package org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction;

import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Fuel;

public class Truck extends AbstractVehicle
{
	public Truck(Fuel fuel)
	{
		super(fuel);
	}

	@Override
	public String getNickName()
	{
		return "Super Truck";
	}
}
