package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class Application
{
	public static void main(String[] args)
	{
		String query = "SELECT * FROM users";


		DatabaseFactory postgresDatabaseFactory = new PostgresDatabaseFactory();
		ReportFactory pdfReportFactory = new PDFReportFactory();
		ReportService postgresPdfReportService = new ReportService(postgresDatabaseFactory, pdfReportFactory);
		postgresPdfReportService.generateReport(query);


		DatabaseFactory mysqlDatabaseFactory = new MySQLDatabaseFactory();
		ReportFactory excelReportFactory = new ExcelReportFactory();
		ReportService mysqlExcelReportService = new ReportService(mysqlDatabaseFactory, excelReportFactory);
		mysqlExcelReportService.generateReport(query);



		DatabaseFactory mongoDatabaseFactory = new MongoDBDatabaseFactory();
		ReportFactory csvReportFactory = new CSVReportFactory();
		ReportService mongoCsvReportService = new ReportService(mongoDatabaseFactory, csvReportFactory);
		mongoCsvReportService.generateReport(query);

	}
}