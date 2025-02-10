package org.designpattern.structural.proxy.cachingproxy.fetchingdatafromapi;

public class CachingProxyDemo
{
	public static void main(String[] args)
	{
		DataFetcher proxy = new CachingProxy();
		System.out.println(proxy.fetchData("query1"));
		System.out.println(proxy.fetchData("query1")); // Cached
		System.out.println(proxy.fetchData("query2"));
	}
}
