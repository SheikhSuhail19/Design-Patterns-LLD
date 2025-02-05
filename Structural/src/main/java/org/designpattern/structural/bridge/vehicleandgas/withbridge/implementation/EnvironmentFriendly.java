package org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation;

public enum EnvironmentFriendly
{
	YES("Fuel is environment friendly"),
	NO("Fuel is not environment friendly");

	private final String description;

	EnvironmentFriendly(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return description;
	}
}