package org.designpattern.structural.proxy.virtualorlazyproxy;

class RealExpensiveService implements ExpensiveService
{
	public RealExpensiveService()
	{
		System.out.println("Initializing Expensive Service...");
	}

	@Override
	public void process()
	{
		System.out.println("Processing Expensive Service...");
	}
}
