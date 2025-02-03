package org.designpattern.structural.adapterorwrapper.decoupledmessagequeue;

// ActiveMQ Adaptee class
public class ActiveMQQueue
{
	public void sendTextMessage(String message)
	{
		System.out.println("Sending message to ActiveMQ: " + message);
	}

	public String receiveTextMessage()
	{
		System.out.println("Consuming message from ActiveMQ");
		return "ActiveMQ message";
	}
}
