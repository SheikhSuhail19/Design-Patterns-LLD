package org.designpattern.creational.singleton.testmyskills.test1;

public class MultiThreadedClient
{

	public static void main(String[] args)
	{
		// Number of threads to simulate concurrent access
		int numThreads = 10;

		// Creating multiple threads that will access the Singleton instance
		Thread[] threads = new Thread[numThreads];

		for (int i = 0; i < numThreads; i++)
		{
			threads[i] = new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					// Get the Singleton instance and increment the counter
					BillPughSingletonSolution singleton = BillPughSingletonSolution.getInstance();
					singleton.incrementCounter();
					System.out.println(Thread.currentThread().getName() + " - Counter: " + singleton.getCounter());
				}
			});
		}

		// Start all threads
		for (Thread thread : threads)
		{
			thread.start();
		}

		// Wait for all threads to finish
		for (Thread thread : threads)
		{
			try
			{
				thread.join();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		// Verify that all threads have used the same Singleton instance
		System.out.println("Final counter value: " + BillPughSingletonSolution.getInstance().getCounter());
	}
}
