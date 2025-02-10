package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class ProtectionProxy implements FinancialRecords
{
	private final FinancialRecords next;

	public ProtectionProxy(FinancialRecords next)
	{
		this.next = next;
	}

	@Override
	public String fetch(int id)
	{
		System.out.println("[Security] Validating request before forwarding to server...");
		if (id < 0)
		{
			System.out.println("Fetching operation is not allowed, since ID passed is not valid");
			throw new SecurityException("Invalid Request: ID passed is not valid");
		}
		return next.fetch(id); // Delegate to next proxy
	}
}