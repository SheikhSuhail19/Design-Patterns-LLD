package org.designpattern.structural.compositeorobjecttree.filesystem;

import java.util.ArrayList;
import java.util.List;

// Composite: Represents folders that can contain files and other folders
public class Folder implements FileSystemComponent
{
	private final String name;
	private final List<FileSystemComponent> components = new ArrayList<>();

	public Folder(String name)
	{
		this.name = name;
	}

	public void addComponent(FileSystemComponent component)
	{
		components.add(component);
	}

	@Override
	public void showDetails(int depth)
	{
		System.out.println("    ".repeat(depth) + "Folder: " + name);
		for (FileSystemComponent component : components)
		{
			component.showDetails(depth + 1); // Recursively call showDetails on all components
		}
	}
}