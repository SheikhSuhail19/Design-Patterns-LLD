package org.designpattern.creational.singleton.testmyskills.test1;

public class BillPughSingletonSolution
{

	private int counter = 0;

	private BillPughSingletonSolution()
	{
	}

	public void incrementCounter()
	{
		counter++;
	}

	public int getCounter()
	{
		return counter;
	}


	private static class MySingletonClassHelper
	{
		private static final BillPughSingletonSolution INSTANCE = new BillPughSingletonSolution();
	}

	public static BillPughSingletonSolution getInstance()
	{
		return MySingletonClassHelper.INSTANCE;
	}
}
