package org.designpattern.creational.singleton.naivesingleton;

public class DemoMultiThread
{

	// Below demo is to show that naive singleton is not thread safe
	public static void main(String[] args)
	{
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
				"If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
				"RESULT:" + "\n");

		Thread thread1 = new Thread(() ->
		{
			LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance("FOO");
			System.out.println(lazyInitializedSingleton1.getValue());
		});

		Thread thread2 = new Thread(() ->
		{
			LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance("BAR");
			System.out.println(lazyInitializedSingleton2.getValue());
		});

		thread1.start();
		thread2.start();
	}
}
