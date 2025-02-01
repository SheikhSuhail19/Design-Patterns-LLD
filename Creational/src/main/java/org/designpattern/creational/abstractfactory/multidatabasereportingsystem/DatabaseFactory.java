package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public interface DatabaseFactory
{
	DatabaseConnection createConnection();
	QueryExecutor createQueryExecutor();
}
