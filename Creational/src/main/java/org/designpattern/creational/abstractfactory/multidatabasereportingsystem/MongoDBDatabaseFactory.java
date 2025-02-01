package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class MongoDBDatabaseFactory implements DatabaseFactory
{
	public DatabaseConnection createConnection()
	{
		return new MongoDBConnection();
	}

	public QueryExecutor createQueryExecutor()
	{
		return new MongoDBQueryExecutor();
	}
}
