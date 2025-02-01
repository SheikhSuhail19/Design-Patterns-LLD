package org.designpattern.creational.builder.withdirector.employeereportgenerator;

public class ClientApplication
{
	public static void main(String[] args)
	{
		EmployeeReportBuilder builder = new EmployeeReportBuilder();
		Director director = new Director(builder);

		director.constructHRReport();
		Report hrReport = builder.build();
		System.out.println(hrReport);

		director.constructManagerReport();
		Report managerReport = builder.build();
		System.out.println(managerReport);

		director.constructFinanceReport();
		Report financeReport = builder.build();
		System.out.println(financeReport);

	}
}
