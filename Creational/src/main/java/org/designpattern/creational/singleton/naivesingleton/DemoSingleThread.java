package org.designpattern.creational.singleton.naivesingleton;

public class DemoSingleThread
{
	public static void main(String[] args)
	{
		System.out.println("If you see the same value, then lazyInitializedSingleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");

		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance("FOO");
		LazyInitializedSingleton anotherLazyInitializedSingleton = LazyInitializedSingleton.getInstance("BAR");
		System.out.println(lazyInitializedSingleton.getValue());
		System.out.println(anotherLazyInitializedSingleton.getValue());

		if (lazyInitializedSingleton == anotherLazyInitializedSingleton)
		{
			System.out.println("Singletons are the same");
		}
		else
		{
			System.out.println("Singletons are different");
		}
	}
}
