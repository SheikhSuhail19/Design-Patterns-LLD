package org.designpattern.structural.proxy.protectionproxy;

class RealSecureService implements SecureService
{
	@Override
	public void performOperation()
	{
		System.out.println("Performing a secure operation...");
	}
}
