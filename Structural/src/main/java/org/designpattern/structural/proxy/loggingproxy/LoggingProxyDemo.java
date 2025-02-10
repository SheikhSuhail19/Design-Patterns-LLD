package org.designpattern.structural.proxy.loggingproxy;

public class LoggingProxyDemo
{
	public static void main(String[] args)
	{
		DataService proxy = new LoggingProxy();
		proxy.requestData();
		proxy.requestData();
		proxy.requestData();
		proxy.requestData();
		proxy.requestData();
		proxy.requestData();
	}
}
