package org.designpattern.structural.decoratororwrapper.paymentprocessingsystem;

public class StripePayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid " + amount + " using Stripe");
	}
}