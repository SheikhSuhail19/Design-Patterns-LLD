package org.designpattern.structural.decoratororwrapper.paymentprocessingsystem;

public class ClientApp
{
	public static void main(String[] args)
	{
		System.out.println("Payment processing without any Decorators");
		Payment payment = new PayPalPayment();
		payment.pay(100);

		System.out.println("Payment processing with Decorators");
		payment = new LoggingDecorator(payment);
		payment = new SecurityCheckDecorator(payment);
		payment.pay(1000);
		payment.pay(1500);

		System.out.println("More payment methods");
		payment = new StripePayment();
		payment = new SecurityCheckDecorator(payment);
		payment.pay(2000);
		payment.pay(1000000);

		payment = new BankTransferPayment();
		payment = new LoggingDecorator(payment);
		payment.pay(500);
		payment.pay(100000);
	}
}
