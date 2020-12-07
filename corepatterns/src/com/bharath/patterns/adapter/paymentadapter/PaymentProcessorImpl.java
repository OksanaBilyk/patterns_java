package com.bharath.patterns.adapter.paymentadapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println("Your payment is " + dollars + " dollar(s)");
	}
}
