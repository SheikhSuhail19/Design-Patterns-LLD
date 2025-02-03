package org.designpattern.structural.adapter.decoupledmessagequeue;

public class ClientApplication
{
	public static void main(String[] args)
	{
		MessageQueue messageQueue = new ActiveMQAdapter(new ActiveMQQueue());
		messageQueue.send("ActiveMQ message");
		System.out.println("Received message: " + messageQueue.receive());
		System.out.println();

		messageQueue = new IBMQueueAdapter(new IBMQueue());
		messageQueue.send("IBM MQ message");
		System.out.println("Received message: " + messageQueue.receive());
		System.out.println();

		messageQueue = new KafkaAdapter(new KafkaQueue());
		messageQueue.send("Kafka message");
		System.out.println("Received message: " + messageQueue.receive());
	}
}
