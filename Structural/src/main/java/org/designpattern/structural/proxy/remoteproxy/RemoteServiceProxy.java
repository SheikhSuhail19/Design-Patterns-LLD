package org.designpattern.structural.proxy.remoteproxy;

class RemoteServiceProxy implements RemoteService
{
	private RealRemoteService realService;

	@Override
	public String fetchData()
	{
		if (realService == null)
		{
			System.out.println("Connecting to remote server...");
			realService = new RealRemoteService();
			System.out.println("Connection established to remote server.");
		}
		return realService.fetchData();
	}
}
