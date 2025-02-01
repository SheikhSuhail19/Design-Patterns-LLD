package org.designpattern.creational.builder.withdirector.employeereportgenerator;

import java.util.Date;
import java.util.List;

public interface ReportBuilder
{
	ReportBuilder setName(String name);

	ReportBuilder setEmployeeId(String employeeId);

	ReportBuilder setDepartment(String department);

	ReportBuilder setEmail(String email);

	ReportBuilder setPhoneNumber(String phoneNumber);

	ReportBuilder setAddress(String address);

	ReportBuilder setDesignation(String designation);

	ReportBuilder setDateOfJoining(Date dateOfJoining);

	ReportBuilder setSalary(String salary);

	ReportBuilder setManagerName(String managerName);

	ReportBuilder setKpis(List<String> kpis);

	ReportBuilder setPerformanceRatings(Integer performanceRatings);

	ReportBuilder setProjectContributions(List<String> projectContributions);

	ReportBuilder setCustomNotes(List<String> customNotes);
}
