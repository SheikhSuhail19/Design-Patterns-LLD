package org.designpattern.creational.singleton.threadsafesingleton.usingsynchronized;

//The SynchronizedMethodSingleton implementation works fine and provides thread-safety, but it reduces the performance because of the cost associated with the synchronized method, although we need it only for the first few threads that might create separate instances. To avoid this extra overhead every time, double-checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional check to ensure that only one instance of a singleton class is created.
public class SynchronizedBlockSingleton
{
	private static SynchronizedBlockSingleton instance;

	private SynchronizedBlockSingleton()
	{
	}

	public static SynchronizedBlockSingleton getInstanceUsingDoubleCheckedLocking()
	{
		if (instance == null)
		{
			synchronized (SynchronizedBlockSingleton.class)
			{
				if (instance == null)
				{
					instance = new SynchronizedBlockSingleton();
				}
			}
		}
		return instance;
	}
}
