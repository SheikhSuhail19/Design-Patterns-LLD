package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class Client
{
	private final SmartReferenceProxy proxy;

	public Client(SmartReferenceProxy proxy)
	{
		this.proxy = proxy;
	}

	public String useService(int id)
	{
		return proxy.fetch(id);
	}

	public void close()
	{
		proxy.releaseClient(this);
	}
}
