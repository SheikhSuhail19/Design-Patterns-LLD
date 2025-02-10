package org.designpattern.structural.proxy.remoteproxy;

public class RemoteProxyDemo
{
	public static void main(String[] args)
	{
		RemoteService proxy = new RemoteServiceProxy();
		System.out.println(proxy.fetchData()); // Connects remotely
		System.out.println(proxy.fetchData()); // Uses existing instance
	}
}
