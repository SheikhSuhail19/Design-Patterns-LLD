package org.designpattern.structural.decoratororwrapper.paymentprocessingsystem;

public abstract class PaymentDecorator implements Payment
{
	// The Payment object to be decorated
	private final Payment wrappee;

	public PaymentDecorator(Payment wrappee)
	{
		this.wrappee = wrappee;
	}

	@Override
	public void pay(double amount)
	{
		wrappee.pay(amount);
	}
}
