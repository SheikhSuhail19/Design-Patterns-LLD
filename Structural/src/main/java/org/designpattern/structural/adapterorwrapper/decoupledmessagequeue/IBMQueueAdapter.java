package org.designpattern.structural.adapterorwrapper.decoupledmessagequeue;

public class IBMQueueAdapter implements MessageQueue
{
	private final IBMQueue ibmQueue;

	public IBMQueueAdapter(IBMQueue ibmQueue)
	{
		this.ibmQueue = ibmQueue;
	}

	@Override
	public void send(String message)
	{
		ibmQueue.putMessage(message);
	}

	@Override
	public String receive()
	{
		return ibmQueue.getMessage();
	}
}
