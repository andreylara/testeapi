package com.testeapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeapi.models.Payment;
import com.testeapi.repository.PaymentRepository;

@RestController
@RequestMapping(value="/api")
public class PaymentResource {

	@Autowired
	PaymentRepository paymentRepository;
	
	@GetMapping("/payments")
	public List<Payment> listPayment(){
		return paymentRepository.findAll();
	}
	
	@GetMapping("/payment/{id}")
	public Payment listUniquePayment(@PathVariable (value="id") long id){
		return paymentRepository.findById(id);
	}
	
	@PostMapping("/payment")
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentRepository.save(payment);
	}
	
	@DeleteMapping("/payments")
	public void deletePayment(@RequestBody Payment payment) {
		paymentRepository.delete(payment);
	}
	
	@PutMapping("/payments")
	public Payment updatePayment(@RequestBody Payment payment) {
		return paymentRepository.save(payment);
	}
}
