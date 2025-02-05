package org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation;

public class Electricity implements Fuel
{
	@Override
	public String getPerformance()
	{
		return Performance.LOW.toString();
	}

	@Override
	public String getEnvironmentalImpact()
	{
		return EnvironmentFriendly.YES.toString();
	}
}