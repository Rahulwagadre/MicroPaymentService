package com.greatlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.PaymentEntity;
import com.greatlearning.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("doPayment")
	public PaymentEntity doPayment(@RequestBody PaymentEntity payment) {
		return paymentService.doPayment(payment);
	}
	
	@GetMapping("paynow")
	public String payNow() {
		return "your payment is succesfull";
	}
}
