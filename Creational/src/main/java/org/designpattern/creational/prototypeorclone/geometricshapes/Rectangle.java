package org.designpattern.creational.prototypeorclone.geometricshapes;

// Concrete prototype. The cloning method creates a new object
// in one go by calling the constructor of the current class and
// passing the current object as the constructor's argument.
// Performing all the actual copying in the constructor helps to
// keep the result consistent: the constructor will not return a
// result until the new object is fully built; thus, no object
// can have a reference to a partially-built clone.

public class Rectangle extends Shape
{
	private int width;
	private int height;

	public Rectangle()
	{
	}

	public Rectangle(Rectangle source)
	{
		// A parent constructor call is needed to copy private
		// fields defined in the parent class.
		super(source);
		this.width = source.width;
		this.height = source.height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	@Override
	public Shape clone()
	{
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object object2)
	{
		if (!(object2 instanceof Rectangle shape2) || !super.equals(object2)) return false;
		return shape2.width == width && shape2.height == height;
	}

}
