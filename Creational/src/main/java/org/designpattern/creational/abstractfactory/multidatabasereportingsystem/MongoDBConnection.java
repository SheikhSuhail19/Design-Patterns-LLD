package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;
public class MongoDBConnection
		implements DatabaseConnection
{
	@Override
	public void connect()
	{
		System.out.println("Connected to MongoDB database...");
	}

	@Override
	public void disconnect()
	{
		System.out.println("Disconnected from MongoDB database...");
	}
}
