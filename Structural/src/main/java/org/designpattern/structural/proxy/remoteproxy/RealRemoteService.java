package org.designpattern.structural.proxy.remoteproxy;

class RealRemoteService implements RemoteService
{
	@Override
	public String fetchData()
	{
		return "Data from remote server";
	}
}
