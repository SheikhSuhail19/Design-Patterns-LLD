package org.designpattern.creational.prototypeorclone.documentmanagementsystem.prototyperegistry;

import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Document;
import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Invoice;
import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Presentation;
import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Report;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry
{
	private final Map<String, Document> cache = new HashMap<>();

	public DocumentRegistry()
	{
		Report report = new Report();
		report.setTitle("Monthly Report");
		report.setSummary("This is a summary.");
		report.setContent("This is the content.");
		report.setAuthor("John Doe");
		report.setCreationDate("2021-01-01");

		cache.put("monthlyReport", report);

		Invoice invoice = new Invoice();
		invoice.setTitle("Order Invoice");
		invoice.setCustomerName("Jane Doe");
		invoice.setProduct("Laptop");
		invoice.setAmount(1500);
		invoice.setContent("Laptop with charger & bag.");
		invoice.setAuthor("Jane Doe");
		invoice.setCreationDate("2026-01-01");

		cache.put("orderInvoice", invoice);

		Presentation presentation = new Presentation();
		presentation.setTitle("Project Presentation");
		presentation.setContent("This is the content of the presentation.");
		presentation.setAuthor("Jack Doe");
		presentation.setCreationDate("2026-01-01");
		presentation.setSlides("Slide 1\nSlide 2\nSlide 3");
		presentation.setTemplate("Template 1");

		cache.put("projectPresentationTemplate", presentation);
	}

	public Document put(String key, Document document)
	{
		cache.put(key, document);
		return document;
	}

	public Document get(String key)
	{
		return cache.get(key).clone();
	}
}
