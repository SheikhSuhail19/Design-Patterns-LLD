package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class LoggingProxy implements FinancialRecords
{
	private final FinancialRecords next;

	public LoggingProxy(FinancialRecords next)
	{
		this.next = next;
	}

	@Override
	public String fetch(int id)
	{
		System.out.println("[LOG] Request received at " + System.currentTimeMillis() + " to access records for user " +
				"with " +
				"id: " + id);
		return next.fetch(id); // Delegate to next proxy
	}
}