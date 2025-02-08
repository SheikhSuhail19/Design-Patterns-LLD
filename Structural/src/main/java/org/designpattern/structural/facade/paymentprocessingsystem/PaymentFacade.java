package org.designpattern.structural.facade.paymentprocessingsystem;

// Facade
class PaymentFacade
{
	private final BankAPI bankAPI;
	private final FraudDetection fraudDetection;
	private final NotificationService notificationService;

	public PaymentFacade()
	{
		this.bankAPI = new BankAPI();
		this.fraudDetection = new FraudDetection();
		this.notificationService = new NotificationService();
	}

	public boolean processPayment(String accountNumber, double amount)
	{
		if (fraudDetection.isFraudulent(accountNumber, amount))
		{
			System.out.println("Transaction flagged as fraudulent!");
			return false;
		}

		boolean success = bankAPI.processTransaction(accountNumber, amount);
		if (success)
		{
			notificationService.sendNotification(accountNumber, amount);
		}
		return success;
	}
}
