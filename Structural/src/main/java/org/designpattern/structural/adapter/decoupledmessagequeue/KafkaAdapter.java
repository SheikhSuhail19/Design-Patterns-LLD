package org.designpattern.structural.adapter.decoupledmessagequeue;

public class KafkaAdapter implements MessageQueue
{
	private final KafkaQueue kafkaQueue;

	public KafkaAdapter(KafkaQueue kafkaQueue)
	{
		this.kafkaQueue = kafkaQueue;
	}

	@Override
	public void send(String message)
	{
		kafkaQueue.produce(message);
	}

	@Override
	public String receive()
	{
		return kafkaQueue.consume();
	}
}
