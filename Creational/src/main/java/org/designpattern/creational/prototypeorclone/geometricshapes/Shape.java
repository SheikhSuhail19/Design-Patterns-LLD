package org.designpattern.creational.prototypeorclone.geometricshapes;

// Base prototype.

import java.util.Objects;

public abstract class Shape
{
	private int x;
	private int y;
	private String color;

	// A regular constructor.
	public Shape()
	{
	}

	// A copy constructor.
	// The prototype constructor. A fresh object is initialized with values from the existing object.
	public Shape(Shape source)
	{
		this.x = source.x;
		this.y = source.y;
		this.color = source.color;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	// The clone method. Returns a fresh object with values from the existing object.
	public abstract Shape clone();

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Shape shape2)) return false;
		return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
	}

}
