package org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction;

import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Fuel;

public abstract class AbstractVehicle implements Vehicle
{
	protected final Fuel fuel; // Bridge to fuel

	public AbstractVehicle(Fuel fuel)
	{
		this.fuel = fuel;
	}

	public abstract String getNickName(); // Each vehicle has a nickname

	@Override
	public void manufacture()
	{
		System.out.println("Manufacturing for your buddy nicknamed: \"" + getNickName() + "\" has started.");
		System.out.println("Environmental Impact: " + fuel.getEnvironmentalImpact());
		System.out.println("Performance Level: " + fuel.getPerformance());
	}
}