package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.List;

public class ReportService
{
	private final DatabaseFactory databaseFactory;
	private final ReportFactory reportFactory;

	public ReportService(DatabaseFactory databaseFactory, ReportFactory reportFactory)
	{
		this.databaseFactory = databaseFactory;
		this.reportFactory = reportFactory;
	}

	public void generateReport(String query)
	{
		DatabaseConnection connection = databaseFactory.createConnection();
		QueryExecutor queryExecutor = databaseFactory.createQueryExecutor();
		ReportGenerator reportGenerator = reportFactory.createReportGenerator();

		connection.connect();
		List<String> data = queryExecutor.executeQuery(query);
		reportGenerator.generateReport(data);
		connection.disconnect();
	}

}
