package org.designpattern.structural.proxy.virtualorlazyproxy;

class ExpensiveServiceProxy implements ExpensiveService
{
	private RealExpensiveService realService;

	@Override
	public void process()
	{
		if (realService == null)
		{
			realService = new RealExpensiveService(); // Lazy initialization
		}
		realService.process();
	}
}
