package org.designpattern.creational.factory.dynamicpaymentprocessor;

public class CreditCard implements PaymentProcessor
{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Paid $" + amount + " using Credit Card");
	}
}
