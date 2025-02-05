package org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation;

public class Gasoline implements Fuel
{
	@Override
	public String getPerformance()
	{
		return Performance.HIGH.toString();
	}

	@Override
	public String getEnvironmentalImpact()
	{
		return EnvironmentFriendly.NO.toString();
	}
}
