package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.ArrayList;
import java.util.List;

public class PostgresQueryExecutor implements QueryExecutor
{
	@Override
	public List<String> executeQuery(String query)
	{
		System.out.println("Executing query: " + query + " in PostgreSQL database");
		return new ArrayList<>();
	}
}
