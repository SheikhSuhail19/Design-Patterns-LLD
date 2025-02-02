package org.designpattern.creational.prototypeorclone.geometricshapes;

public class Circle extends Shape
{
	private int radius;

	public Circle()
	{
	}

	public Circle(Circle source)
	{
		super(source);
		this.radius = source.radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	@Override
	public Shape clone()
	{
		return new Circle(this);
	}

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Circle shape2) || !super.equals(object2)) return false;
		return shape2.radius == radius;
	}

}
