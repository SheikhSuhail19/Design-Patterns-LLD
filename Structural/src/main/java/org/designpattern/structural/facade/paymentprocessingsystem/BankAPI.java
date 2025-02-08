package org.designpattern.structural.facade.paymentprocessingsystem;

// Subsystem 1: Bank API
class BankAPI
{
	public boolean processTransaction(String accountNumber, double amount)
	{
		System.out.println("Processing payment of " + amount + " for account: " + accountNumber);
		return true; // Assume transaction is always successful
	}
}
