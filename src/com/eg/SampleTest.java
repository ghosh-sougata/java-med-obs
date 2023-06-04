package com.eg;

public class SampleTest {

	public static void main(String[] args) {

		Mediator mediator = new MediatorImpl();

		//
		Subscriber subscriber1 = new TopicSubscriber("subscriber1");
		Subscriber subscriber2 = new TopicSubscriber("subscriber2");
		Subscriber subscriber3 = new TopicSubscriber("subscriber3");
		mediator.register(subscriber1);
		mediator.register(subscriber2);	
		mediator.register(subscriber3);

		System.out.println("Publishing messgaes....");
		for (int i = 0; i < 3; i++) {
			mediator.publish("hello world::" + i);
		}
		
		mediator.unregister(subscriber2);
		System.out.println("Publishing messgaes....");
		for (int i = 0; i < 3; i++) {
			mediator.publish("hello there::" + i);
		}
	}

}
