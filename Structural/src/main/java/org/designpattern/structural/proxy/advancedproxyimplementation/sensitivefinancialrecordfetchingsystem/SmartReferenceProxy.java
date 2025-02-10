package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SmartReferenceProxy implements FinancialRecords
{
	private FinancialRecords chain; // This will be the chain of proxies
	private final Set<Client> activeClients = ConcurrentHashMap.newKeySet();

	public SmartReferenceProxy()
	{
		this.chain = null; // Lazy initialization
	}

	public synchronized Client getClient()
	{
		if (chain == null)
		{
			System.out.println("[SmartRef] Initializing Proxy Chain...");
			chain = new LoggingProxy(
					new ProtectionProxy(
							new CachingProxy(
									new RemoteProxy(
											new FinancialRecordsService()
									)
							)
					)
			);
		}
		Client client = new Client(this);
		activeClients.add(client);
		return client;
	}

	@Override
	public String fetch(int id)
	{
		if (chain == null)
		{
			System.out.println("[SmartRef] No active clients. Service unavailable.");
			return null;
		}
		return chain.fetch(id);
	}

	public synchronized void releaseClient(Client client)
	{
		activeClients.remove(client);
		System.out.println("[SmartRef] Client released. Active clients: " + activeClients.size());

		if (activeClients.isEmpty())
		{
			System.out.println("[SmartRef] No active clients. Releasing Proxy Chain...");
			chain = null; // Free up memory
		}
	}
}