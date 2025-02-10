package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

public class Application
{
	public static void main(String[] args)
	{
		System.out.println("===== Proxy Pattern Test Started =====");

		// Step 1: Create the SmartReferenceProxy
		SmartReferenceProxy proxyManager = new SmartReferenceProxy();

		// Step 2: Get two clients
		System.out.println("\n[TEST] Client 1 connects and requests data...");
		Client client1 = proxyManager.getClient();
		System.out.println(client1.useService(101)); // Should initialize the chain and fetch fresh data

		System.out.println("\n[TEST] Client 2 connects and requests data...");
		Client client2 = proxyManager.getClient();
		System.out.println(client2.useService(101)); // Should hit the cache

		System.out.println("\n[TEST] Client 1 requests a different ID...");
		System.out.println(client1.useService(202)); // Should fetch fresh data

		System.out.println("\n[TEST] Client 2 requests the same ID as Client 1...");
		System.out.println(client2.useService(202)); // Should hit the cache

		// Step 3: Test invalid ID
		System.out.println("\n[TEST] Client 1 tries an invalid ID...");
		try
		{
			System.out.println(client1.useService(-5)); // Should trigger protection proxy
		}
		catch (SecurityException e)
		{
			System.out.println("[ERROR] " + e.getMessage());
		}

		// Step 4: Client 1 disconnects
		System.out.println("\n[TEST] Client 1 disconnects...");
		client1.close();

		// Step 5: Client 2 disconnects (should trigger cleanup)
		System.out.println("\n[TEST] Client 2 disconnects...");
		client2.close();

		// Step 6: New client connects after cleanup
		System.out.println("\n[TEST] Client 3 connects after cleanup...");
		Client client3 = proxyManager.getClient();
		System.out.println(client3.useService(101)); // Should reinitialize the chain and fetch fresh data

		// Cleanup
		System.out.println("\n[TEST] Client 3 disconnects...");
		client3.close();

		System.out.println("\n===== Proxy Pattern Test Completed =====");
	}
}
