package org.designpattern.structural.compositeorobjecttree.graphicalshapes;

import java.awt.*;

// The component interface declares common operations for both
// simple and complex objects of a composition.

public interface Shape
{
	int getX();

	int getY();

	int getWidth();

	int getHeight();

	void move(int x, int y);

	boolean isInsideBounds(int x, int y);

	void select();

	void unSelect();

	boolean isSelected();

	void paint(Graphics graphics);
}

