package org.designpattern.structural.facade.hotelbookingsystem;

// Subsystem 2: Payment Service
public class PaymentService
{
	public boolean processPayment(String guestName, double amount)
	{
		System.out.println("Processing payment of " + amount + " for guest: " + guestName);
		return true; // Assume payment is always successful
	}
}
