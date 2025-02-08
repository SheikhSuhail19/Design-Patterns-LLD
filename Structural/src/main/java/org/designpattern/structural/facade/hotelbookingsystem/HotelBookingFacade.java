package org.designpattern.structural.facade.hotelbookingsystem;

// Facade
public class HotelBookingFacade
{
	private final RoomService roomService;
	private final PaymentService paymentService;
	private final NotificationService notificationService;

	public HotelBookingFacade()
	{
		this.roomService = new RoomService();
		this.paymentService = new PaymentService();
		this.notificationService = new NotificationService();
	}

	public boolean bookRoom(String guestName, String roomType, double amount)
	{
		if (!roomService.isRoomAvailable(roomType))
		{
			System.out.println("Room not available!");
			return false;
		}

		if (!paymentService.processPayment(guestName, amount))
		{
			System.out.println("Payment failed!");
			return false;
		}

		roomService.reserveRoom(guestName, roomType);
		notificationService.sendConfirmation(guestName, roomType);
		return true;
	}
}
