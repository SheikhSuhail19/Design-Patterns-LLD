package org.designpattern.structural.adapterorwrapper.decoupledmessagequeue;

// IBM MQ Adaptee class
public class IBMQueue
{
	public void putMessage(String message)
	{
		System.out.println("Sending message to IBM MQ: " + message);
	}

	public String getMessage()
	{
		System.out.println("Consuming message from IBM MQ");
		return "IBM MQ message";
	}
}

