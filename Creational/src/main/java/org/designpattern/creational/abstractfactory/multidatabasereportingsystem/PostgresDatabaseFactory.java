package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class PostgresDatabaseFactory implements DatabaseFactory
{
	public DatabaseConnection createConnection()
	{
		return new PostgresConnection();
	}

	public QueryExecutor createQueryExecutor()
	{
		return new PostgresQueryExecutor();
	}
}
