package org.designpattern.structural.proxy.smartreferenceproxy;

class Client
{
	private final SmartReferenceProxy proxy;

	public Client(SmartReferenceProxy proxy)
	{
		this.proxy = proxy;
	}

	public void useService()
	{
		proxy.process();
	}

	public void close()
	{
		proxy.releaseClient(this);
	}
}
