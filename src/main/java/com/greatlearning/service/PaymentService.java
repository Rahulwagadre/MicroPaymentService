package com.greatlearning.service;
import com.greatlearning.entity.PaymentEntity;


public interface PaymentService {	
	public PaymentEntity findPaymentHistoryByOrderId(int orderId);
	public String paymentProcessing();
	public PaymentEntity doPayment(PaymentEntity payment);
}
