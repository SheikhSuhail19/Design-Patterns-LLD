package org.designpattern.structural.facade.paymentprocessingsystem;

// Subsystem 3: Notification Service
class NotificationService
{
	public void sendNotification(String accountNumber, double amount)
	{
		System.out.println("Sending payment confirmation for " + amount + " to account: " + accountNumber);
	}
}
