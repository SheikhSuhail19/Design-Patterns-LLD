package org.designpattern.structural.decoratororwrapper.paymentprocessingsystem;

public class SecurityCheckDecorator extends PaymentDecorator
{
	public SecurityCheckDecorator(Payment payment)
	{
		super(payment);
	}

	@Override
	public void pay(double amount)
	{
		check(amount);
		super.pay(amount);
	}

	private void check(double amount)
	{
		if (amount > 1000)
		{
			System.out.println("[SECURITY ALERT] High-value transaction detected: $" + amount);
		}
	}
}
