package org.designpattern.structural.compositeorobjecttree.organizationhierarchymanagement;

public class Employee implements OrganisationComponent
{
	private final String name;
	private final String position;

	public Employee(String name, String position)
	{
		this.name = name;
		this.position = position;
	}

	@Override
	public void addSubordinate(OrganisationComponent organisationComponent)
	{
		throw new UnsupportedOperationException("An employee can't have a subordinate");
	}

	@Override
	public void showDetails(int level)
	{
		System.out.println("    ".repeat(level) + position + " : " + name);
	}
}
