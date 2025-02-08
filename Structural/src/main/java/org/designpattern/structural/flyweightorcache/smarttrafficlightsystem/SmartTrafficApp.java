package org.designpattern.structural.flyweightorcache.smarttrafficlightsystem;

import java.util.ArrayList;
import java.util.List;

public class SmartTrafficApp
{
	private static final List<TrafficLight> trafficLights = new ArrayList<>();
	private static final List<Thread> trafficLightThreads = new ArrayList<>();

	public static void main(String[] args)
	{
		// Creating 1000 intersections but reusing only 3 TrafficLightType objects!
		for (int i = 0; i < 10; i++)
		{
			String type = (i % 3 == 0) ? "Urban" : (i % 3 == 1) ? "Highway" : "Pedestrian";
			String activeLight = (i % 3 == 0) ? "RED" : (i % 3 == 1) ? "GREEN" : "YELLOW";
			TrafficLightType lightType = TrafficLightFactory.getTrafficLightType(type);
			trafficLights.add(new TrafficLight(i, Math.random() * 90, Math.random() * 180, activeLight, lightType));
		}
		// Simulating traffic light changes
		// Start each traffic light in its own thread
		for (TrafficLight light : trafficLights)
		{
			Thread thread = new Thread(light);
			trafficLightThreads.add(thread);
			thread.start();
		}

		// Simulate system running for 60 seconds before stopping
		try
		{
			Thread.sleep(60_000); // Keep system running for 1 minute
		}
		catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}

		// Stop all traffic lights
		stopAllTrafficLights();
	}

	private static void stopAllTrafficLights()
	{
		System.out.println("Stopping all traffic lights...");

		for (TrafficLight light : trafficLights)
		{
			light.stop(); // Set running = false for each traffic light
		}

		for (Thread thread : trafficLightThreads)
		{
			try
			{
				thread.join(); // Wait for all threads to finish
			}
			catch (InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
		}

		System.out.println("All traffic lights stopped.");
	}
}
