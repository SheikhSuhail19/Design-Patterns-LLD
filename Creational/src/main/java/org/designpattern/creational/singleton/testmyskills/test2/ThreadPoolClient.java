package org.designpattern.creational.singleton.testmyskills.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolClient
{
	public static void main(String[] args)
	{
		// Create a thread pool with 10 threads
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		// Submit 10 tasks to the thread pool
		for (int i = 0; i < 10; i++)
		{
			executorService.submit(() -> {
				EnumSingletonSolution singleton = EnumSingletonSolution.INSTANCE;
				singleton.incrementCounter();
				System.out.println(Thread.currentThread().getName() + " - Counter: " + singleton.getCounter());
			});
		}

		// Shutdown the executor service
		executorService.shutdown();

		// Give some time for all threads to complete execution before printing final result
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		// Verify final counter value
		System.out.println("Final Counter Value: " + EnumSingletonSolution.INSTANCE.getCounter());
	}
}
