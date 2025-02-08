package org.designpattern.structural.facade.paymentprocessingsystem;

// Subsystem 2: Fraud Detection
class FraudDetection
{
	public boolean isFraudulent(String accountNumber, double amount)
	{
		System.out.println("Checking for fraud on account: " + accountNumber);
		return amount > 10000; // Mark as fraud if amount is too high
	}
}
