package org.designpattern.creational.singleton.threadsafesingleton.eager.staticblock;

//Static block initialization implementation is similar to eager initialization, except that instance of the class is created in the static block that provides the option for exception handling.

//Static block initialization creates the instance even before it’s being used and that is not the best practice to use.

public class StaticBlockSingleton
{
	private static StaticBlockSingleton instance;

	private StaticBlockSingleton()
	{
	}

	// static block initialization for exception handling
	static
	{
		try
		{
			instance = new StaticBlockSingleton();
		}
		catch (Exception e)
		{
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
