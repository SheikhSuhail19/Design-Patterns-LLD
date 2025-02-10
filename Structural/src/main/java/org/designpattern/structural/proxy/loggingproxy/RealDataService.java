package org.designpattern.structural.proxy.loggingproxy;

class RealDataService implements DataService
{
	@Override
	public void requestData()
	{
		System.out.println("Fetching data...");
	}
}
