package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class ExcelReportFactory implements ReportFactory
{
	public ReportGenerator createReportGenerator()
	{
		return new ExcelReportGenerator();
	}
}
