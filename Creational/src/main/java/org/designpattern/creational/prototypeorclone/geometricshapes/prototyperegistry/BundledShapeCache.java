package org.designpattern.creational.prototypeorclone.geometricshapes.prototyperegistry;

//You could implement a centralized prototype registry (or factory), which would contain a set of pre-defined prototype objects. This way you could retrieve new objects from the factory by passing its name or other parameters. The factory would search for an appropriate prototype, clone it and return you a copy.

import org.designpattern.creational.prototypeorclone.geometricshapes.Circle;
import org.designpattern.creational.prototypeorclone.geometricshapes.Rectangle;
import org.designpattern.creational.prototypeorclone.geometricshapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache
{
	private final Map<String, Shape> cache = new HashMap<>();

	public BundledShapeCache()
	{
		Circle circle = new Circle();
		circle.setX(7);
		circle.setY(7);
		circle.setRadius(45);
		circle.setColor("Green");

		Rectangle rectangle = new Rectangle();
		rectangle.setX(6);
		rectangle.setY(9);
		rectangle.setWidth(8);
		rectangle.setHeight(10);
		rectangle.setColor("Blue");

		cache.put("Big green circle", circle);
		cache.put("Medium blue rectangle", rectangle);
	}

	public Shape put(String key, Shape shape)
	{
		cache.put(key, shape);
		return shape;
	}

	public Shape get(String key)
	{
		return cache.get(key).clone();
	}
}
