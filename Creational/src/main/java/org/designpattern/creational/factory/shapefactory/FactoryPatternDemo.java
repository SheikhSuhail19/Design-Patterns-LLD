package org.designpattern.creational.factory.shapefactory;

// Step 4: Client code
public class FactoryPatternDemo
{
	public static void main(String[] args)
	{
		Shape shape1 = ShapeFactory.getShape("CIRCLE");
		shape1.draw(); // Output: Drawing Circle

		Shape shape2 = ShapeFactory.getShape("SQUARE");
		shape2.draw(); // Output: Drawing Square
	}
}
