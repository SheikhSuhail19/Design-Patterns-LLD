package org.designpattern.creational.singleton.reflectiondestroyssingleton;

import org.designpattern.creational.singleton.threadsafesingleton.billpugh.BillPughSingleton;
import org.designpattern.creational.singleton.threadsafesingleton.eager.eagerinitialized.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

//Reflection can be used to destroy all the previous singleton implementation approaches
// Except for Enum Singleton
public class ReflectionSingletonTest
{
	public static void main(String[] args)
	{
		destroyEagerApproach();
		destroyBillPughApproach();
	}

	private static void destroyEagerApproach()
	{
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;

		try
		{
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}


	private static void destroyBillPughApproach()
	{
		BillPughSingleton billPughSingletonInstanceOne = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingletonInstanceTwo = null;

		try
		{
			Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				constructor.setAccessible(true);
				billPughSingletonInstanceTwo = (BillPughSingleton) constructor.newInstance();
				break;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(billPughSingletonInstanceOne.hashCode());
		System.out.println(billPughSingletonInstanceTwo.hashCode());

	}
}
