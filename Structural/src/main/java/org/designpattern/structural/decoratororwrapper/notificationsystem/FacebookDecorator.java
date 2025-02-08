package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class FacebookDecorator extends UserNotifierDecorator
{
	public FacebookDecorator(Notifier notifier)
	{
		super(notifier);
	}

	@Override
	public void send(String message)
	{
		sendFbMessage(message);
		super.send(message);
	}

	private void sendFbMessage(String message)
	{
		System.out.println("Sending FB message to user");
	}
}
