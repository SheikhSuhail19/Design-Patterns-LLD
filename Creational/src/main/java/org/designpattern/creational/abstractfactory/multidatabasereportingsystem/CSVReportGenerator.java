package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.List;

public class CSVReportGenerator implements ReportGenerator
{
	@Override
	public void generateReport(List<String> data)
	{
		System.out.println("CSV Report generated");
	}
}


