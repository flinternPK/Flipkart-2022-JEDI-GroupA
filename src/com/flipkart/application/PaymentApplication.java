package com.flipkart.application;
import com.flipkart.service.PaymentServiceImplementation;
import com.flipkart.service.PaymentServiceInterface;
public class PaymentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentServiceInterface paymentRef = new PaymentServiceImplementation();
		paymentRef.calculatPayment(null);
	}

}
