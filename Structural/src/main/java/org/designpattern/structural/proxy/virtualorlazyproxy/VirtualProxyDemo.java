package org.designpattern.structural.proxy.virtualorlazyproxy;

public class VirtualProxyDemo
{
	public static void main(String[] args)
	{
		ExpensiveService proxy = new ExpensiveServiceProxy();
		System.out.println("Proxy created. Service is not initialized yet.");
		proxy.process(); // Initializes and calls process
		proxy.process(); // Reuses initialized instance
	}
}
