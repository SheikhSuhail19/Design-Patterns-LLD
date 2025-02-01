package org.designpattern.creational.builder.withdirector.employeereportgenerator;

import java.util.Date;
import java.util.List;

public class EmployeeReportBuilder implements ReportBuilder
{
	private String name;
	private String employeeId;
	private String department;
	private String email;
	private String phoneNumber;
	private String address;
	private String designation;
	private Date dateOfJoining;
	private String salary;
	private String managerName;
	private List<String> kpis;
	private Integer performanceRatings;
	private List<String> projectContributions;
	private List<String> customNotes;

	@Override
	public ReportBuilder setName(String name)
	{
		this.name = name;
		return this;
	}

	@Override
	public ReportBuilder setEmployeeId(String employeeId)
	{
		this.employeeId = employeeId;
		return this;
	}

	@Override
	public ReportBuilder setDepartment(String department)
	{
		this.department = department;
		return this;
	}

	@Override
	public ReportBuilder setEmail(String email)
	{
		this.email = email;
		return this;
	}

	@Override
	public ReportBuilder setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	@Override
	public ReportBuilder setAddress(String address)
	{
		this.address = address;
		return this;
	}

	@Override
	public ReportBuilder setDesignation(String designation)
	{
		this.designation = designation;
		return this;
	}

	@Override
	public ReportBuilder setDateOfJoining(Date dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
		return this;
	}

	@Override
	public ReportBuilder setSalary(String salary)
	{
		this.salary = salary;
		return this;
	}

	@Override
	public ReportBuilder setManagerName(String managerName)
	{
		this.managerName = managerName;
		return this;
	}

	@Override
	public ReportBuilder setKpis(List<String> kpis)
	{
		this.kpis = kpis;
		return this;
	}

	@Override
	public ReportBuilder setPerformanceRatings(Integer performanceRatings)
	{
		this.performanceRatings = performanceRatings;
		return this;
	}

	@Override
	public ReportBuilder setProjectContributions(List<String> projectContributions)
	{
		this.projectContributions = projectContributions;
		return this;
	}

	@Override
	public ReportBuilder setCustomNotes(List<String> customNotes)
	{
		this.customNotes = customNotes;
		return this;
	}

	public Report build()
	{
		Report report = new Report(name, employeeId, department, email, phoneNumber, address, designation,
				dateOfJoining,
			salary,
				managerName, kpis, performanceRatings, projectContributions, customNotes);

		this.reset();

		return report;
	}

	public void reset()
	{
		name = null;
		employeeId = null;
		department = null;
		email = null;
		phoneNumber = null;
		address = null;
		designation = null;
		dateOfJoining = null;
		salary = null;
		managerName = null;
		kpis = null;
		performanceRatings = null;
		projectContributions = null;
		customNotes = null;
	}
}