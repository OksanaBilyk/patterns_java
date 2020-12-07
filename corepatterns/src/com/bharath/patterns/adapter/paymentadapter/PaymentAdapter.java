package com.bharath.patterns.adapter.paymentadapter;

public class PaymentAdapter {

	private static final int RUPEE_TO_DOLLAR_INDEX = 74;

	void pay(int rupees) {
		int dollars = rupees / RUPEE_TO_DOLLAR_INDEX;

		PaymentProcessor processor = new PaymentProcessorImpl();
		processor.pay(dollars);
	}

}
