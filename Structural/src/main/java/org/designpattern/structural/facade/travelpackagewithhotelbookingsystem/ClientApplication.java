package org.designpattern.structural.facade.travelpackagewithhotelbookingsystem;

// Client Code
public class ClientApplication
{
	public static void main(String[] args)
	{
		TravelPackageFacade travelPackageFacade = new TravelPackageFacade();

		// Book a full package
		travelPackageFacade.bookFullPackage("John Doe", "Deluxe", 200.0);

		// Cancel a full package
		travelPackageFacade.cancelFullPackage("John Doe", "Deluxe", 200.0);
	}
}
