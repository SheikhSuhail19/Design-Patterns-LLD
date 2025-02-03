package org.designpattern.structural.adapter.decoupledmessagequeue;

// Kafka Adaptee class
public class KafkaQueue
{
	public void produce(String message)
	{
		System.out.println("Sending message to Kafka: " + message);
	}

	public String consume()
	{
		System.out.println("Consuming message from Kafka");
		return "Kafka message";
	}
}

