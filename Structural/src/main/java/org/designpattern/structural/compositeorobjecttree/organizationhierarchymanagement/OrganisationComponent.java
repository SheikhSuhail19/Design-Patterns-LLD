package org.designpattern.structural.compositeorobjecttree.organizationhierarchymanagement;

public interface OrganisationComponent
{
	void addSubordinate(OrganisationComponent organisationComponent);

	void showDetails(int level);
}
