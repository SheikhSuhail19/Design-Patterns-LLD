package org.designpattern.creational.abstractfactory.multidatabasereportingsystem;

import java.util.List;

public interface QueryExecutor
{
	List<String> executeQuery(String query);
}
