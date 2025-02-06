package org.designpattern.structural.compositeorobjecttree.filesystem;

// Leaf: Represents individual files
class File implements FileSystemComponent
{
	private final String name;

	public File(String name)
	{
		this.name = name;
	}

	@Override
	public void showDetails(int depth)
	{
		System.out.println("    ".repeat(depth) + "File: " + name);
	}
}
