package org.designpattern.creational.prototypeorclone.documentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Application
{
	public static void main(String[] args)
	{

		List<Document> documents = new ArrayList<>();
		List<Document> documentsCopy = new ArrayList<>();

		Report report = new Report();
		report.setTitle("Monthly Report");
		report.setSummary("This is a summary.");
		report.setContent("This is the content.");
		report.setAuthor("John Doe");
		report.setCreationDate("2021-01-01");

		Report clonedReport = (Report) report.clone();

		System.out.println(report.toString());
		System.out.println(clonedReport.toString());

		documents.add(report);
		documentsCopy.add(clonedReport);


		Invoice invoice = new Invoice();
		invoice.setTitle("Order Invoice");
		invoice.setCustomerName("Jane Doe");
		invoice.setProduct("Laptop");
		invoice.setAmount(1500);
		invoice.setContent("Laptop with charger & bag.");
		invoice.setAuthor("Jane Doe");
		invoice.setCreationDate("2026-01-01");

		Invoice clonedInvoice = (Invoice) invoice.clone();

		System.out.println(invoice.toString());
		System.out.println(clonedInvoice.toString());

		documents.add(invoice);
		documentsCopy.add(clonedInvoice);


		Presentation presentation = new Presentation();
		presentation.setTitle("Project Presentation");
		presentation.setContent("This is the content of the presentation.");
		presentation.setAuthor("Jack Doe");
		presentation.setCreationDate("2026-01-01");
		presentation.setSlides("Slide 1\nSlide 2\nSlide 3");
		presentation.setTemplate("Template 1");

		Presentation clonedPresentation = (Presentation) presentation.clone();

		System.out.println(presentation.toString());
		System.out.println(clonedPresentation.toString());

		documents.add(presentation);
		documentsCopy.add(clonedPresentation);

		// Compare the original documents and the copied documents
		for (int i = 0; i < documents.size(); i++)
		{
			if (documents.get(i) != documentsCopy.get(i))
			{
				System.out.println("Documents and copied documents are different objects (yaaay!)");
				if (documents.get(i).equals(documentsCopy.get(i)))
				{
					System.out.println("Documents and copied documents are equal (yaaay!)");
				}
				else
				{
					System.out.println("Documents and copied documents are not equal (booo!)");
				}
			}
			else
			{
				System.out.println("Documents and copied documents are the same object (booo!)");
			}
		}

		// Change the content of the original documents to verify that the copied documents are not affected

		report.setTitle("New Title");
		report.setSummary("New Summary");
		report.setContent("New Content");
		report.setAuthor("New Author");
		report.setCreationDate("2022-01-01");

		invoice.setTitle("New Title");
		invoice.setCustomerName("New Customer Name");
		invoice.setProduct("New Product");
		invoice.setAmount(2000);
		invoice.setContent("New Content");
		invoice.setAuthor("New Author");
		invoice.setCreationDate("2023-01-01");

		presentation.setTitle("New Title");
		presentation.setContent("New Content");
		presentation.setAuthor("New Author");
		presentation.setCreationDate("2024-01-01");
		presentation.setSlides("New Slide 1\nNew Slide 2\nNew Slide 3");
		presentation.setTemplate("New Template 1");

		// Compare the original documents and the copied documents again
		for (int i = 0; i < documents.size(); i++)
		{
			if (documents.get(i) != documentsCopy.get(i))
			{
				System.out.println("Documents and copied documents are different objects (yaaay!)");
				if (documents.get(i).equals(documentsCopy.get(i)))
				{
					System.out.println("Documents and copied documents are equal (booo!)");
				}
				else
				{
					System.out.println("Documents and copied documents are not equal (yaaay!)");
				}
			}
			else
			{
				System.out.println("Documents and copied documents are the same object (booo!)");
			}
		}

	}

}
