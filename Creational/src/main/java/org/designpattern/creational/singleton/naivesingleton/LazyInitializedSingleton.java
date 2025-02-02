package org.designpattern.creational.singleton.naivesingleton;

public class LazyInitializedSingleton
{
	private static LazyInitializedSingleton instance;
	private String value;

	private LazyInitializedSingleton()
	{
	}

	private LazyInitializedSingleton(String value)
	{
		// The following code emulates slow initialization.
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		this.value = value;
	}

	public static LazyInitializedSingleton getInstance(String value)
	{
		if (instance == null)
		{
			instance = new LazyInitializedSingleton(value);
		}
		return instance;
	}

	public String getValue()
	{
		return value;
	}
}
