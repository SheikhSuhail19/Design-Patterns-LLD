package org.designpattern.structural.flyweightorcache.renderingaforest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// Flyweight factory decides whether to re-use existing
// flyweight or to create a new object.

public class TreeFactory
{
	static Map<String, TreeType> treeTypes = new HashMap<>();

	public static TreeType getTreeType(String name, Color color, String otherTreeData)
	{
		return treeTypes.computeIfAbsent(name, n -> new TreeType(n, color, otherTreeData));
	}
}