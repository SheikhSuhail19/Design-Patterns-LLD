package org.designpattern.creational.builder.withdirector.employeereportgenerator;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class Director
{

	private final ReportBuilder reportBuilder;

	public Director(ReportBuilder reportBuilder)
	{
		this.reportBuilder = reportBuilder;
	}

	//	HR may need comprehensive reports with all details.
	public void constructHRReport()
	{
		reportBuilder.setName("John Doe")
				.setEmployeeId("12345")
				.setDepartment("IT")
				.setEmail("john.doe@corporate.com")
				.setPhoneNumber("1234567890")
				.setAddress("123, Corporate Street, Corporate City, Corporate Country")
				.setDesignation("Software Engineer")
				.setDateOfJoining(new Date("01/01/2020"))
				.setSalary("100000")
				.setManagerName("Jane Doe")
				.setKpis(List.of("KPI 1", "KPI 2", "KPI 3"))
				.setPerformanceRatings(5)
				.setProjectContributions(List.of("Project 1", "Project 2", "Project 3"))
				.setCustomNotes(List.of("Note 1", "Note 2", "Note 3"));
	}

	//	Managers may only need basic information with performance metrics.
	public void constructManagerReport()
	{
		reportBuilder.setName("John Doe")
				.setEmployeeId("12345")
				.setDepartment("IT")
				.setEmail("john.doe@corporate.com")
				.setPhoneNumber("1234567890")
				.setAddress("123, Corporate Street, Corporate City, Corporate Country")
				.setDesignation("Software Engineer")
				.setKpis(List.of("KPI 1", "KPI 2", "KPI 3"))
				.setPerformanceRatings(5)
				.setProjectContributions(List.of("Project 1", "Project 2", "Project 3"));
	}

	//	Finance might only need basic information and employment details for payroll processing.
	public void constructFinanceReport()
	{
		reportBuilder.setName("John Doe")
				.setEmployeeId("12345")
				.setDepartment("IT")
				.setEmail("john.doe@corporate.com")
				.setPhoneNumber("1234567890")
				.setAddress("123, Corporate Street, Corporate City, Corporate Country")
				.setDesignation("Software Engineer")
				.setDateOfJoining(new Date("01/01/2020"))
				.setSalary("100000");
	}

}
