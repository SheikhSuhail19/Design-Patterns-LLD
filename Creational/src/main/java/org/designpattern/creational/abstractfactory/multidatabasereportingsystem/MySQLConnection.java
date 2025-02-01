package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

public class MySQLConnection
		implements DatabaseConnection
{
	@Override
	public void connect()
	{
		System.out.println("Connected to MySQL database...");
	}

	@Override
	public void disconnect()
	{
		System.out.println("Disconnected from MySQL database...");
	}
}
