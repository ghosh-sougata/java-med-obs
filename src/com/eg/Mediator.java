package com.eg;

interface Mediator {

	void publish(String msg);

	void register(Subscriber subscriber);

	void unregister(Subscriber subscriber);

	void notifySubscribers();

}
