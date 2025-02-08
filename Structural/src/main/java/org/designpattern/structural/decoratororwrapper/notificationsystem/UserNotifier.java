package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class UserNotifier implements Notifier
{
	@Override
	public void send(String message)
	{
		System.out.println("Sending notification to user: " + message);
	}
}
