package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class SlackDecorator extends UserNotifierDecorator
{
	public SlackDecorator(Notifier notifier)
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
		System.out.println("Sending Slack message to user");
	}
}
