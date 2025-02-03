package org.designpattern.creational.factory.shapefactory;




// Step 3: Create a Factory to produce objects
class ShapeFactory
{
	public static Shape getShape(String type)
	{
		if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
		else if (type.equalsIgnoreCase("SQUARE")) return new Square();
		return null;
	}
}


