package org.designpattern.structural.proxy.cachingproxy.fetchingdatafromapi;

class RealDataFetcher implements DataFetcher
{
	@Override
	public String fetchData(String query)
	{
		System.out.println("Fetching data for: " + query);
		return "Data for " + query;
	}
}
