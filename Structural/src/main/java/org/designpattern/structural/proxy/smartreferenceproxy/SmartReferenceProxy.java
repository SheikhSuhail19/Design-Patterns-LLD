package org.designpattern.structural.proxy.smartreferenceproxy;

import java.util.HashSet;
import java.util.Set;

class SmartReferenceProxy implements HeavyService
{
	private RealHeavyService realService;
	private final Set<Client> activeClients = new HashSet<>();

	public Client getClient()
	{
		if (realService == null)
		{
			realService = new RealHeavyService();
		}
		Client client = new Client(this);
		activeClients.add(client);
		return client;
	}

	public void releaseClient(Client client)
	{
		activeClients.remove(client);
		if (activeClients.isEmpty())
		{
			realService.cleanup();
			realService = null; // Free resources
			System.out.println("All clients released. Service destroyed.");
		}
	}

	@Override
	public void process()
	{
		if (realService == null)
		{
			System.out.println("No active clients. Service is not available.");
		}
		else
		{
			realService.process();
		}
	}
}
