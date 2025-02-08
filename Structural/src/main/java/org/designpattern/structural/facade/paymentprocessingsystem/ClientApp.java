package org.designpattern.structural.facade.paymentprocessingsystem;

// Client Code
public class ClientApp
{
	public static void main(String[] args)
	{
		PaymentFacade paymentFacade = new PaymentFacade();

		// Successful transaction
		paymentFacade.processPayment("123456", 5000);

		// Fraudulent transaction
		paymentFacade.processPayment("789012", 15000);
	}
}
