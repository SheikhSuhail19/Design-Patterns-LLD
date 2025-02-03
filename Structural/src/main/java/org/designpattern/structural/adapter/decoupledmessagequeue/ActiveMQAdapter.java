package org.designpattern.structural.adapter.decoupledmessagequeue;

public class ActiveMQAdapter implements MessageQueue
{
	private final ActiveMQQueue activeMQQueue;

	public ActiveMQAdapter(ActiveMQQueue activeMQQueue)
	{
		this.activeMQQueue = activeMQQueue;
	}

	@Override
	public void send(String message)
	{
		activeMQQueue.sendTextMessage(message);
	}

	@Override
	public String receive()
	{
		return activeMQQueue.receiveTextMessage();
	}
}
