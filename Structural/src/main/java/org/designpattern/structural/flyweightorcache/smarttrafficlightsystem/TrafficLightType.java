package org.designpattern.structural.flyweightorcache.smarttrafficlightsystem;

import java.awt.*;

// Flyweight class representing a traffic light

public class TrafficLightType
{
	private final String shape;  // All traffic lights are circular
	private final Color redColor;
	private final Color yellowColor;
	private final Color greenColor;
	private final int redDuration;
	private final int yellowDuration;
	private final int greenDuration;

	public TrafficLightType(int redDuration, int yellowDuration, int greenDuration)
	{
		this.shape = "CIRCLE";
		this.redColor = Color.RED;
		this.yellowColor = Color.YELLOW;
		this.greenColor = Color.GREEN;
		this.redDuration = redDuration;
		this.yellowDuration = yellowDuration;
		this.greenDuration = greenDuration;
	}

	public int getRedDuration()
	{
		return redDuration;
	}

	public int getYellowDuration()
	{
		return yellowDuration;
	}

	public int getGreenDuration()
	{
		return greenDuration;
	}

	public void displayLight(String currentLight, int intersectionId)
	{
		System.out.println("Intersection " + intersectionId + " - Light: " + currentLight);
	}
}