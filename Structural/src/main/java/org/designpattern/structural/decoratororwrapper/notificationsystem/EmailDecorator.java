package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class EmailDecorator extends UserNotifierDecorator
{
	public EmailDecorator(Notifier notifier)
	{
		super(notifier);
	}

	@Override
	public void send(String message)
	{
		sendSlackMessage(message);
		super.send(message);
	}

	private void sendSlackMessage(String message)
	{
		System.out.println("Sending Email to user");
	}
}
