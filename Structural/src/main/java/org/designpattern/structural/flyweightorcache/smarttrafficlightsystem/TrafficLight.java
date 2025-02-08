package org.designpattern.structural.flyweightorcache.smarttrafficlightsystem;

public class TrafficLight implements Runnable
{
	//	Unique (Extrinsic) Properties
	private final int intersectionId;
	private final double latitude;
	private final double longitude;
	private String activeLight;

	//	Common (Intrinsic) Properties
	private final TrafficLightType flyweight;

	// Flag to control execution
	private volatile boolean running = true;

	public TrafficLight(int intersectionId, double latitude, double longitude, String activeLight, TrafficLightType flyweight)
	{
		this.intersectionId = intersectionId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.activeLight = activeLight;
		this.flyweight = flyweight;
	}


	private void changeLight() throws InterruptedException
	{
		while (running) // Only run while the flag is true
		{
			flyweight.displayLight(activeLight, intersectionId);
			int duration = getCurrentDuration();
			Thread.sleep(duration * 1000L); // Convert seconds to milliseconds
			switchLight();
		}
	}

	private int getCurrentDuration()
	{
		return switch (activeLight)
		{
			case "RED" -> flyweight.getRedDuration();
			case "YELLOW" -> flyweight.getYellowDuration();
			case "GREEN" -> flyweight.getGreenDuration();
			default -> 5; // Fallback duration
		};
	}

	public void switchLight()
	{
		switch (activeLight)
		{
			case "RED":
				activeLight = "YELLOW";
				break;
			case "YELLOW":
				activeLight = "GREEN";
				break;
			case "GREEN":
				activeLight = "RED";
				break;
		}
	}

	public void stop()
	{ // Stop method to control thread execution
		running = false;
	}

	@Override
	public void run()
	{
		try
		{
			changeLight();
		}
		catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}

}
