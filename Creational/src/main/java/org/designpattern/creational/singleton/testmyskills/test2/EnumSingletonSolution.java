package org.designpattern.creational.singleton.testmyskills.test2;

public enum EnumSingletonSolution
{
	INSTANCE;

	private int counter = 0;

	public void incrementCounter()
	{
		counter++;
	}

	public int getCounter()
	{
		return counter;
	}

	public static EnumSingletonSolution getInstance()
	{
		return INSTANCE;
	}
}
