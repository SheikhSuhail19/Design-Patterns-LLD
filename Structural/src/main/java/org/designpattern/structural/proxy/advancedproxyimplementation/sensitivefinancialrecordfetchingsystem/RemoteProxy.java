package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class RemoteProxy implements FinancialRecords
{
	private final FinancialRecords next;

	public RemoteProxy(FinancialRecords next)
	{
		this.next = next;
	}

	@Override
	public String fetch(int id)
	{
		System.out.println("[Remote] Fetching data from server...");
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException ignored)
		{
		}
		return next.fetch(id); // Delegate to next proxy
	}
}