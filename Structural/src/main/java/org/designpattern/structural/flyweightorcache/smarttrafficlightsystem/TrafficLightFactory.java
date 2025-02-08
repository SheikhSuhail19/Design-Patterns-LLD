package org.designpattern.structural.flyweightorcache.smarttrafficlightsystem;

import java.util.HashMap;
import java.util.Map;

public class TrafficLightFactory
{
	private static final Map<String, TrafficLightType> lightTypes = new HashMap<>();

	public static TrafficLightType getTrafficLightType(String type)
	{
		return lightTypes.computeIfAbsent(type, t -> {
			return switch (t)
			{
				case "Urban" -> new TrafficLightType(50, 5, 40);
				case "Highway" -> new TrafficLightType(60, 5, 50);
				case "Pedestrian" -> new TrafficLightType(30, 5, 20);
				default -> throw new IllegalArgumentException("Unknown traffic light type: " + t);
			};
		});
	}
}
