package org.designpattern.structural.proxy.protectionproxy;

class SecureServiceProxy implements SecureService
{
	private RealSecureService realService;
	private final String userRole;

	public SecureServiceProxy(String userRole)
	{
		this.userRole = userRole;
	}

	@Override
	public void performOperation()
	{
		if (!"ADMIN".equals(userRole))
		{
			System.out.println("User is not allowed, you must have Admin permissions");
			throw new SecurityException("Access Denied: Insufficient permissions!");
		}
		if (realService == null)
		{
			realService = new RealSecureService();
		}
		realService.performOperation();
	}
}
