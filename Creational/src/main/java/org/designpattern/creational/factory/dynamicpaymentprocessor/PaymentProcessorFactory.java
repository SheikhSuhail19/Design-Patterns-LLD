package org.designpattern.creational.factory.dynamicpaymentprocessor;

public class PaymentProcessorFactory
{
	public static PaymentProcessor getPaymentProcessor(String paymentMethod)
	{
		return switch (paymentMethod)
		{
			case "Credit Card" -> new CreditCard();
			case "PayPal" -> new PayPal();
			case "Crypto" -> new Crypto();
			default -> throw new IllegalArgumentException("Unsupported payment method: " + paymentMethod);
		};
	}
}
