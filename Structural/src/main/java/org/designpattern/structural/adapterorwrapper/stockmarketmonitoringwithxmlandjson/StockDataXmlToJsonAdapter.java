package org.designpattern.structural.adapterorwrapper.stockmarketmonitoringwithxmlandjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class StockDataXmlToJsonAdapter
{
	private final StockDataProvider stockDataProvider;
	private final ObjectMapper objectMapper = new ObjectMapper();

	public StockDataXmlToJsonAdapter(StockDataProvider stockDataProvider)
	{
		this.stockDataProvider = stockDataProvider;
	}

	public JsonNode getStockDataAsJson()
	{
		Document xmlData = stockDataProvider.getStockData();
		return convertXmlToJson(xmlData);
	}

	private JsonNode convertXmlToJson(Document xmlData)
	{
		try
		{
			// Normalize the XML document to avoid issues with nested elements
			xmlData.getDocumentElement().normalize();

			// Extract the stock nodes (Assuming stock elements are structured correctly)
			NodeList stockList = xmlData.getElementsByTagName("stock");
			List<Object> stocks = new ArrayList<>();

			// Loop through the stock list and extract details
			for (int i = 0; i < stockList.getLength(); i++)
			{
				Node stockNode = stockList.item(i);
				if (stockNode.getNodeType() == Node.ELEMENT_NODE)
				{
					Element stockElement = (Element) stockNode;
					String name = stockElement.getElementsByTagName("stockName").item(0).getTextContent();
					String price = stockElement.getElementsByTagName("stockPrice").item(0).getTextContent();

					// Create JSON objects and add to the stock list
					stocks.add(objectMapper.createObjectNode()
							.put("stockName", name)
							.put("stockPrice", Integer.parseInt(price)));
				}
			}

			// Create the final JSON structure and return
			return objectMapper.createObjectNode().set("stocks", objectMapper.valueToTree(stocks));

		}
		catch (Exception e)
		{
			throw new RuntimeException("Error converting XML to JSON", e);
		}
	}
}
