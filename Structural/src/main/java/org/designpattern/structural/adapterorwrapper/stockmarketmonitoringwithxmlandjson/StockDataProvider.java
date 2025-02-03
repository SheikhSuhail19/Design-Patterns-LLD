package org.designpattern.structural.adapterorwrapper.stockmarketmonitoringwithxmlandjson;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class StockDataProvider
{

	public Document getStockData()
	{
		try
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();

			// Root element
			Element root = document.createElement("stockData");
			document.appendChild(root);

			// Stock data
			addStock(document, root, "Google", "1000");
			addStock(document, root, "Facebook", "2000");
			addStock(document, root, "Amazon", "3000");
			addStock(document, root, "Microsoft", "4000");
			addStock(document, root, "Apple", "5000");

			return document;
		}
		catch (Exception e)
		{
			throw new RuntimeException("Error creating XML document", e);
		}
	}

	private void addStock(Document doc, Element root, String name, String price)
	{
		Element stock = doc.createElement("stock");

		Element stockName = doc.createElement("stockName");
		stockName.appendChild(doc.createTextNode(name));
		stock.appendChild(stockName);

		Element stockPrice = doc.createElement("stockPrice");
		stockPrice.appendChild(doc.createTextNode(price));
		stock.appendChild(stockPrice);

		root.appendChild(stock);
	}
}
