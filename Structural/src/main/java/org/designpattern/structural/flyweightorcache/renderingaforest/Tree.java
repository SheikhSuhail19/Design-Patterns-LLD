package org.designpattern.structural.flyweightorcache.renderingaforest;

import java.awt.*;

// The contextual object contains the extrinsic part of the tree
// state. An application can create billions of these since they
// are pretty small: just two integer coordinates and one
// reference field.

public class Tree
{
	private final int x;
	private final int y;
	private final TreeType type;

	public Tree(int x, int y, TreeType type)
	{
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public void draw(Graphics g)
	{
		type.draw(g, x, y);
	}
}