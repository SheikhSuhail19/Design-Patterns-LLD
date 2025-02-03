package org.designpattern.structural.adapterorwrapper.stockmarketmonitoringwithxmlandjson;

import com.fasterxml.jackson.databind.JsonNode;

public class AnalyticsLibrary
{
	public void processStockData(JsonNode json)
	{
		System.out.println("Processing Stock Data in JSON Format:");
		System.out.println(json.toPrettyString());
	}
}
