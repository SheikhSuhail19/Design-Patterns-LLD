package org.designpattern.structural.facade.travelpackagewithhotelbookingsystem;

// Subsystem 1: Room Service
public class RoomService
{
	public boolean isRoomAvailable(String roomType)
	{
		System.out.println("Checking availability for room type: " + roomType);
		return true; // Assume room is always available
	}

	public void reserveRoom(String guestName, String roomType)
	{
		System.out.println("Reserving " + roomType + " for guest: " + guestName);
	}

	public void cancelReservation(String guestName, String roomType)
	{
		System.out.println("Canceling reservation for " + guestName + " in room type: " + roomType);
	}
}
