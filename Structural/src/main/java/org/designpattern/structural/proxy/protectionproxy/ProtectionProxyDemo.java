package org.designpattern.structural.proxy.protectionproxy;

public class ProtectionProxyDemo
{
	public static void main(String[] args)
	{
		SecureService adminProxy = new SecureServiceProxy("ADMIN");
		adminProxy.performOperation(); // Allowed

		SecureService userProxy = new SecureServiceProxy("USER");
		userProxy.performOperation(); // Throws SecurityException
	}
}
