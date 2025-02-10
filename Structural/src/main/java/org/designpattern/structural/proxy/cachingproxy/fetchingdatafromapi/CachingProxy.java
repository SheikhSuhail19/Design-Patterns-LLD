package org.designpattern.structural.proxy.cachingproxy.fetchingdatafromapi;

import java.util.HashMap;
import java.util.Map;

class CachingProxy implements DataFetcher
{
	private RealDataFetcher realFetcher;
	private final Map<String, String> cache = new HashMap<>();

	@Override
	public String fetchData(String query)
	{
		if (cache.containsKey(query))
		{
			System.out.println("Returning cached result for: " + query);
			return cache.get(query);
		}
		if (realFetcher == null)
		{
			realFetcher = new RealDataFetcher();
		}
		String result = realFetcher.fetchData(query);
		cache.put(query, result);
		return result;
	}
}
