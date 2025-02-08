package org.designpattern.structural.facade.travelpackagewithhotelbookingsystem;

// Subsystem 3: Notification Service
public class NotificationService
{
	public void sendConfirmation(String guestName, String roomType)
	{
		System.out.println("Sending booking confirmation to " + guestName + " for room type: " + roomType);
	}

	public void sendCancellation(String guestName, String roomType)
	{
		System.out.println("Sending cancellation notification to " + guestName + " for room type: " + roomType);
	}
}
