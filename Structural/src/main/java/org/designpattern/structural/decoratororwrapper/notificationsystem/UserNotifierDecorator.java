package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class UserNotifierDecorator implements Notifier
{
	private final Notifier wrappee;

	public UserNotifierDecorator(Notifier wrappee)
	{
		this.wrappee = wrappee;
	}

	@Override
	public void send(String message)
	{
		wrappee.send(message);
	}
}
