package org.designpattern.structural.facade.hotelbookingsystem;

// Subsystem 1: Room Service
public class RoomService
{
	public static int AVAILABLE_ROOMS = 3;

	public boolean isRoomAvailable(String roomType)
	{
		System.out.println("Checking availability for room type: " + roomType);
		return AVAILABLE_ROOMS-- != 0;
	}

	public void reserveRoom(String guestName, String roomType)
	{
		System.out.println("Reserving " + roomType + " for guest: " + guestName);
	}
}
