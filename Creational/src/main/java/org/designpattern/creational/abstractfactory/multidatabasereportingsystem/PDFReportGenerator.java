package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.List;

public class PDFReportGenerator implements ReportGenerator
{
	@Override
	public void generateReport(List<String> data)
	{
		System.out.println("PDF Report generated");
	}
}


