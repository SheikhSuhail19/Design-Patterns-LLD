package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class PDFReportFactory implements ReportFactory
{
	public ReportGenerator createReportGenerator()
	{
		return new PDFReportGenerator();
	}
}
