package org.designpattern.structural.facade.travelpackagewithhotelbookingsystem;

// Second Facade: TravelPackageFacade
public class TravelPackageFacade
{
	private final HotelBookingFacade hotelBookingFacade;

	public TravelPackageFacade()
	{
		this.hotelBookingFacade = new HotelBookingFacade();
	}

	public void bookFullPackage(String guestName, String roomType, double amount)
	{
		System.out.println("Booking full travel package for: " + guestName);
		hotelBookingFacade.bookRoom(guestName, roomType, amount);
	}

	public void cancelFullPackage(String guestName, String roomType, double amount)
	{
		System.out.println("Canceling full travel package for: " + guestName);
		hotelBookingFacade.cancelBooking(guestName, roomType, amount);
	}
}
