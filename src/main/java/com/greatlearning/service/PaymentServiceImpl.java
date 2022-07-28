package com.greatlearning.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.PaymentEntity;
import com.greatlearning.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	
	public PaymentEntity doPayment(PaymentEntity payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransectionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"false";
	}
	
	public PaymentEntity findPaymentHistoryByOrderId(int orderId) {
		return paymentRepository.findByOrderId(orderId);
	}

}
