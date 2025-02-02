package org.designpattern.creational.singleton.threadsafesingleton.billpugh;

//Prior to Java 5, the Java memory model had a lot of issues, and the previous approaches used to fail in certain scenarios where too many threads tried to get the instance of the singleton class simultaneously. So Bill Pugh came up with a different approach to create the singleton class using an inner static helper class.
public class BillPughSingleton
{
	private BillPughSingleton()
	{
	}

	//	Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method, this class gets loaded and creates the singleton class instance. This is the most widely used approach for the singleton class as it doesn’t require synchronization.
	private static class SingletonHelper
	{
		public static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	//	This class implements the Singleton design pattern using the Bill Pugh Singleton approach, which is
	//	thread-safe and efficient. The Singleton instance is lazily initialized when the `getInstance()` method is called for the first time. The  inner static class `SingletonHelper` is loaded by the JVM in a thread-safe manner,  ensuring that the instance is created only once, even in a multi-threaded environment. This approach avoids synchronization overhead and ensures optimal performance.

	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
}
