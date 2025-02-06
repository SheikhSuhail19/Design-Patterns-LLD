package org.designpattern.structural.compositeorobjecttree.organizationhierarchymanagement;

public class Application
{
	public static void main(String[] args)
	{
		// Creating leaf employees (no subordinates)
		OrganisationComponent david = new Employee("David", "Software Engineer");
		OrganisationComponent eve = new Employee("Eve", "Software Engineer");
		OrganisationComponent helen = new Employee("Helen", "Sales Representative");

		// Creating managers and adding subordinates
		OrganisationComponent charlie = new Manager("Charlie", "Engineering Manager");
		charlie.addSubordinate(david);
		charlie.addSubordinate(eve);

		OrganisationComponent grace = new Manager("Grace", "Sales Manager");
		grace.addSubordinate(helen);

		OrganisationComponent bob = new Manager("Bob", "VP of Engineering");
		bob.addSubordinate(charlie);

		OrganisationComponent frank = new Manager("Frank", "VP of Sales");
		frank.addSubordinate(grace);

		// Creating CEO and adding VPs
		OrganisationComponent alice = new Manager("Alice", "CEO");
		alice.addSubordinate(bob);
		alice.addSubordinate(frank);

		// Print the hierarchy
		alice.showDetails(0);
	}
}