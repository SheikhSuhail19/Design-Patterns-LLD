package org.designpattern.structural.proxy.smartreferenceproxy;

class RealHeavyService implements HeavyService
{
	public RealHeavyService()
	{
		System.out.println("Initializing Heavy Service...");
	}

	@Override
	public void process()
	{
		System.out.println("Processing Heavy Service...");
	}

	public void cleanup()
	{
		System.out.println("Releasing Heavy Service resources...");
	}
}
