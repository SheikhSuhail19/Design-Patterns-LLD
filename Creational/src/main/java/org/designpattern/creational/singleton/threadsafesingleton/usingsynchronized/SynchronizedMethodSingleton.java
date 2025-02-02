package org.designpattern.creational.singleton.threadsafesingleton.usingsynchronized;

//A simple way to create a thread-safe singleton class is to make the global access method synchronized so that only one thread can execute this method at a time.

//This implementation works fine and provides thread-safety, but it reduces the performance because of the
// cost associated with the synchronized method, although we need it only for the first few threads that might create separate instances. To avoid this extra overhead every time, double-checked locking principle is used.
public class SynchronizedMethodSingleton
{
	private static SynchronizedMethodSingleton instance;

	private SynchronizedMethodSingleton()
	{
	}

	public static synchronized SynchronizedMethodSingleton getInstance()
	{
		if (instance == null)
		{
			instance = new SynchronizedMethodSingleton();
		}
		return instance;
	}

}
