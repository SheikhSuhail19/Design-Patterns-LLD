package org.designpattern.structural.proxy.smartreferenceproxy;

public class SmartReferenceProxyDemo
{
	public static void main(String[] args)
	{
		SmartReferenceProxy proxy = new SmartReferenceProxy();

		Client client1 = proxy.getClient();
		Client client2 = proxy.getClient();

		client1.useService();
		client2.useService();

		client1.close(); // Only one client remains
		client2.close(); // Last client closes, service is released
	}
}
