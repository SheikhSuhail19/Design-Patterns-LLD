package org.designpattern.creational.factory.dynamicpaymentprocessor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class Application
{
	private PaymentProcessor paymentProcessor;

	// The application picks a creator's type depending on the
	// current configuration or environment settings.
	private void initialize()
	{
		Properties props = readApplicationConfigFile();
		String paymentMethod = props.getProperty("payment.processor");

		paymentProcessor = PaymentProcessorFactory.getPaymentProcessor(paymentMethod);
	}

	private Properties readApplicationConfigFile()
	{
		Properties props = new Properties();

		try (InputStream input = org.designpattern.creational.factory.crossplatformdialog.Application.class.getClassLoader().getResourceAsStream("application.properties"))
		{
			props.load(input);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return props;
	}

	private void runBusinessLogic()
	{
		paymentProcessor.processPayment(10.00);
	}

	public static void main(String[] args)
	{
		Application application = new Application();

		application.initialize();
		application.runBusinessLogic();
	}

}
