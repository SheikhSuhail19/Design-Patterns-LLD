package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class FinancialRecordsService implements FinancialRecords
{
	@Override
	public String fetch(int id)
	{
		return String.valueOf("[RealService] Data for user with id: " + id + " to be returned.");
	}
}
