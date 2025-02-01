package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class CSVReportFactory implements ReportFactory
{
	public ReportGenerator createReportGenerator()
	{
		return new CSVReportGenerator();
	}
}
