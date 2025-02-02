package org.designpattern.creational.prototypeorclone.documentmanagementsystem.prototyperegistry;

import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Invoice;
import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Presentation;
import org.designpattern.creational.prototypeorclone.documentmanagementsystem.Report;

public class ClientApplication
{
	public static void main(String[] args)
	{
		DocumentRegistry registry = new DocumentRegistry();

		Report monthlyReport = (Report) registry.get("monthlyReport").clone();
		monthlyReport.setTitle("Monthly Report 2023");
		monthlyReport.setSummary("This is a summary of the monthly report.");
		monthlyReport.setAuthor("Jane Doe");
		monthlyReport.setCreationDate("2023-01-01");

		System.out.println(monthlyReport);

		Invoice orderInvoice = (Invoice) registry.get("orderInvoice").clone();
		orderInvoice.setTitle("Order Invoice 2023");
		orderInvoice.setCustomerName("John Doe");
		orderInvoice.setProduct("Laptop");
		orderInvoice.setAmount(1500);
		orderInvoice.setContent("Laptop with charger & bag.");
		orderInvoice.setAuthor("John Doe");
		orderInvoice.setCreationDate("2023-01-01");

		System.out.println(orderInvoice);

		Presentation projectPresentation = (Presentation) registry.get("projectPresentationTemplate").clone();
		projectPresentation.setTitle("Project Presentation 2023");
		projectPresentation.setAuthor("Jack Doe");
		projectPresentation.setCreationDate("2023-01-01");
		projectPresentation.setSlides("Slide 1\nSlide 2\nSlide 3");
		projectPresentation.setTemplate("Template 1");

		System.out.println(projectPresentation);

		// compare cached ones with clones & each other

		Report monthlyReportClone = (Report) registry.get("monthlyReport").clone();
		Invoice orderInvoiceClone = (Invoice) registry.get("orderInvoice").clone();
		Presentation projectPresentationClone = (Presentation) registry.get("projectPresentationTemplate").clone();

		if (monthlyReport == monthlyReportClone)
		{
			System.out.println("monthlyReport and monthlyReportClone are the same object (booo!)");
		}
		else
		{
			System.out.println("monthlyReport and monthlyReportClone are different objects (yay!)");
		}
		if (monthlyReport.equals(monthlyReportClone))
		{
			System.out.println("monthlyReport and monthlyReportClone are equal (booo!)");
		}
		else
		{
			System.out.println("monthlyReport and monthlyReportClone are not equal (yay!)");
		}


		if (orderInvoice == orderInvoiceClone)
		{
			System.out.println("orderInvoice and orderInvoiceClone are the same object (booo!)");
		}
		else
		{
			System.out.println("orderInvoice and orderInvoiceClone are different objects (yay!)");
		}
		if (orderInvoice.equals(orderInvoiceClone))
		{
			System.out.println("orderInvoice and orderInvoiceClone are equal (booo!)");
		}
		else
		{
			System.out.println("orderInvoice and orderInvoiceClone are not equal (yay!)");
		}


		if (projectPresentation == projectPresentationClone)
		{
			System.out.println("projectPresentation and projectPresentationClone are the same object (booo!)");
		}
		else
		{
			System.out.println("projectPresentation and projectPresentationClone are different objects (yay!)");
		}
		if (projectPresentation.equals(projectPresentationClone))
		{
			System.out.println("projectPresentation and projectPresentationClone are equal (booo!)");
		}
		else
		{
			System.out.println("projectPresentation and projectPresentationClone are not equal (yay!)");
		}

	}
}
