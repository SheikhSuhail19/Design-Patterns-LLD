package org.designpattern.creational.singleton.threadsafesingleton.serializedsingleton;

import java.io.Serial;
import java.io.Serializable;

//The problem with serialized singleton class is that whenever we deserialize it, it will create a new instance of the class
//To overcome this scenario, all we need to do it provide the implementation of readResolve() method.
public class SerializedSingleton implements Serializable
{
	@Serial
	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton()
	{
	}

	private static class SingletonHelper
	{
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance()
	{
		return SingletonHelper.instance;
	}

	@Serial
	protected Object readResolve()
	{
		return getInstance();
	}
}
