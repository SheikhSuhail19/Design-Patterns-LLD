package org.designpattern.structural.adapterorwrapper.stockmarketmonitoringwithxmlandjson;

import com.fasterxml.jackson.databind.JsonNode;
import org.w3c.dom.Document;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class StockMarketApp
{
	public static void main(String[] args)
	{
		StockDataProvider stockDataProvider = new StockDataProvider();
		Document stockDataXML = stockDataProvider.getStockData();

		// Convert XML Document to String for printing
		String xmlString = convertDocumentToString(stockDataXML);
		System.out.println("Stock Data in XML Format:\n" + xmlString);

		// AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
		// analyticsLibrary.processStockData(stockDataXML); // This line will not compile because the processStockData method expects a JSON string as input

		StockDataXmlToJsonAdapter adapter = new StockDataXmlToJsonAdapter(stockDataProvider);
		JsonNode stockDataJson = adapter.getStockDataAsJson();

		// Now the processStockData method can be called with the JSON data
		AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
		analyticsLibrary.processStockData(stockDataJson);
	}


	private static String convertDocumentToString(Document doc)
	{
		try
		{
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");

			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new java.io.StringWriter());
			transformer.transform(source, result);

			return result.getWriter().toString();
		}
		catch (TransformerException e)
		{
			throw new RuntimeException("Error converting XML Document to String", e);
		}
	}
}
