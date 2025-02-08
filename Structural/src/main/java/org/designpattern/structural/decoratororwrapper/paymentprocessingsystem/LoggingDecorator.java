package org.designpattern.structural.decoratororwrapper.paymentprocessingsystem;

public class LoggingDecorator extends PaymentDecorator
{
	public LoggingDecorator(Payment payment)
	{
		super(payment);
	}

	@Override
	public void pay(double amount)
	{
		log(amount);
		super.pay(amount);
	}

	private void log(double amount)
	{
		System.out.println("[LOG] Processing payment of: $" + amount);
	}
}
