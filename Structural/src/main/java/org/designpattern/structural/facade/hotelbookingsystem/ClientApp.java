package org.designpattern.structural.facade.hotelbookingsystem;

// Client Code
public class ClientApp
{
	public static void main(String[] args)
	{
		HotelBookingFacade bookingFacade = new HotelBookingFacade();

		// Successful booking
		bookingFacade.bookRoom("John Doe", "Deluxe", 200.0);

		// Another booking attempt
		bookingFacade.bookRoom("Jane Smith", "Suite", 500.0);

		// Another booking attempt
		bookingFacade.bookRoom("Alice Johnson", "Standard", 150.0);

		// Failed booking due to room unavailability
		bookingFacade.bookRoom("Bob Brown", "Deluxe", 200.0);
	}
}
