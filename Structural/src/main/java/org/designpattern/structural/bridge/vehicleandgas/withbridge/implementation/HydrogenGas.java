package org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation;

public class HydrogenGas implements Fuel
{
	@Override
	public String getPerformance()
	{
		return Performance.MEDIUM.toString();
	}

	@Override
	public String getEnvironmentalImpact()
	{
		return EnvironmentFriendly.YES.toString();
	}
}
