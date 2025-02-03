package org.designpattern.structural.adapterorwrapper.decoupledmessagequeue;

public interface MessageQueue
{
	void send(String message);

	String receive();
}
