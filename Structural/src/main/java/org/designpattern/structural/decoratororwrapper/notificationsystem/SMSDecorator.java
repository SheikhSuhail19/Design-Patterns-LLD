package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class SMSDecorator extends UserNotifierDecorator
{
	public SMSDecorator(Notifier notifier)
	{
		super(notifier);
	}

	@Override
	public void send(String message)
	{
		sendSMS(message);
		super.send(message);
	}

	private void sendSMS(String message)
	{
		System.out.println("Sending SMS to user");
	}
}
