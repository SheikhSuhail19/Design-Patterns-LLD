package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;
public class PostgresConnection
		implements DatabaseConnection
{
	@Override
	public void connect()
	{
		System.out.println("Connected to Postgres database...");
	}

	@Override
	public void disconnect()
	{
		System.out.println("Disconnected from Postgres database...");
	}
}
