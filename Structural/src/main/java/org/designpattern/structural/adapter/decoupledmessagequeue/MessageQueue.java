package org.designpattern.structural.adapter.decoupledmessagequeue;

public interface MessageQueue
{
	void send(String message);

	String receive();
}
