package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.List;

public class ExcelReportGenerator implements ReportGenerator
{
	@Override
	public void generateReport(List<String> data)
	{
		System.out.println("Excel Report generated");
	}
}
