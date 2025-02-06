package org.designpattern.structural.compositeorobjecttree.organizationhierarchymanagement;

import java.util.ArrayList;
import java.util.List;

public class Manager implements OrganisationComponent
{
	private final String name;
	private final String position;

	private final List<OrganisationComponent> components = new ArrayList<>();

	public Manager(String name, String position)
	{
		this.name = name;
		this.position = position;
	}

	@Override
	public void addSubordinate(OrganisationComponent organisationComponent)
	{
		components.add(organisationComponent);
	}

	@Override
	public void showDetails(int level)
	{
		System.out.println("    ".repeat(level) + position + " : " + name);
		for (OrganisationComponent component : components)
		{
			component.showDetails(level + 1);
		}
	}
}
