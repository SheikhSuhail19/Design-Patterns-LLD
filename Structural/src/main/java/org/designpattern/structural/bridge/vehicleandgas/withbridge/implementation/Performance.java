package org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation;

public enum Performance
{
	LOW("Performance is low"),
	MEDIUM("Performance is medium"),
	HIGH("Performance is high");

	private final String description;

	Performance(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return description;
	}
}
