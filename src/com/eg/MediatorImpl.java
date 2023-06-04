package com.eg;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {
	
	private String message = null;
	private List<Subscriber> subscribers = new ArrayList<>();

	@Override
	public void publish(String msg) {
		this.message = msg;
		this.notifySubscribers();
	}

	@Override
	public void register(Subscriber subscriber) {
		if(!subscribers.contains(subscriber)) {
			subscribers.add(subscriber);
		}
	}

	@Override
	public void unregister(Subscriber subscriber) {
		if(subscribers.contains(subscriber)) {
			subscribers.remove(subscriber);
		}

	}

	@Override
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(message);
		}
	}

}
