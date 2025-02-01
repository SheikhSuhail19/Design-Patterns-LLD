package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class MySQLDatabaseFactory implements DatabaseFactory
{
	public DatabaseConnection createConnection()
	{
		return new MySQLConnection();
	}

	public QueryExecutor createQueryExecutor()
	{
		return new MySQLQueryExecutor();
	}
}


