package org.designpattern.structural.proxy.advancedproxyimplementation.sensitivefinancialrecordfetchingsystem;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements FinancialRecords
{
	private final FinancialRecords next;

	private final Map<Integer, String> cache = new HashMap<>();

	public CachingProxy(FinancialRecords next)
	{
		this.next = next;
	}

	@Override
	public String fetch(int id)
	{
		if (cache.containsKey(id))
		{
			System.out.println("[Cache] Returning cached result for: " + id);
			return cache.get(id);
		}

		String result = next.fetch(id); // Delegate to next proxy
		cache.put(id, result);
		return result;
	}
}