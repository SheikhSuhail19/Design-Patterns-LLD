package org.designpattern.structural.compositeorobjecttree.graphicalshapes;

import java.awt.*;

// The leaf class represents end objects of a composition. A
// leaf object can't have any sub-objects. Usually, it's leaf
// objects that do the actual work, while composite objects only
// delegate to their sub-components.

public class Dot extends BaseShape
{
	private final int DOT_SIZE = 3;

	public Dot(int x, int y, Color color)
	{
		super(x, y, color);
	}

	@Override
	public int getWidth()
	{
		return DOT_SIZE;
	}

	@Override
	public int getHeight()
	{
		return DOT_SIZE;
	}

	@Override
	public void paint(Graphics graphics)
	{
		super.paint(graphics);
		graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
	}
}

