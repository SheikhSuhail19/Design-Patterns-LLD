package org.designpattern.creational.factory.dynamicpaymentprocessor;

public class Crypto implements PaymentProcessor
{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("Paid $" + amount + " using Crypto Wallet");
	}
}
