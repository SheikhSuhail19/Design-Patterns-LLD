package org.designpattern.structural.proxy.loggingproxy;

class LoggingProxy implements DataService
{
	private RealDataService realService;

	@Override
	public void requestData()
	{
		System.out.println("Logging request at " + System.currentTimeMillis());
		if (realService == null)
		{
			realService = new RealDataService();
		}
		try
		{
			Thread.sleep(10);
		}
		catch (Exception ignored)
		{
		}
		realService.requestData();
	}
}
