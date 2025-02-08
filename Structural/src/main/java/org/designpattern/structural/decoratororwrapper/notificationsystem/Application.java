package org.designpattern.structural.decoratororwrapper.notificationsystem;

public class Application
{
	public static void main(String[] args)
	{
		Notifier notifier = new UserNotifier();
		notifier = new SMSDecorator(notifier);
		notifier = new FacebookDecorator(notifier);
		notifier = new SlackDecorator(notifier);
		notifier.send("Please pick up my call");
		System.out.println();

		Notifier notifier2 = new UserNotifier();
		notifier2 = new FacebookDecorator(notifier2);
		notifier2.send("Hey man, call me");
		System.out.println();

		Notifier notifier3 = new UserNotifier();
		notifier3 = new SMSDecorator(notifier3);
		notifier3 = new FacebookDecorator(notifier3);
		notifier3 = new SlackDecorator(notifier3);
		notifier3 = new EmailDecorator(notifier3);
		notifier3.send("Yoo wassup dude");
	}
}
