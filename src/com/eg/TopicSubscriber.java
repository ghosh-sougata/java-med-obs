package com.eg;

public class TopicSubscriber implements Subscriber {

	private String name;

	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("[" + name + "]message=" + message);

	}
}
