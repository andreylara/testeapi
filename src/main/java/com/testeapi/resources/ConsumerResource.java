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

import com.testeapi.models.Consumer;
import com.testeapi.repository.ConsumerRepository;

@RestController
@RequestMapping(value="/api")
public class ConsumerResource {

	@Autowired
	ConsumerRepository consumerRepository;
	
	@GetMapping("/consumers")
	public List<Consumer> listConsumers(){
		return consumerRepository.findAll();
	}
	
	@GetMapping("/consumer/{id}")
	public Consumer listUniqueConsumer(@PathVariable (value="id") long id){
		return consumerRepository.findById(id);
	}
	
	@PostMapping("/consumer")
	public Consumer saveConsumer(@RequestBody Consumer consumer) {
		return consumerRepository.save(consumer);
	}
	
	@DeleteMapping("/consumer")
	public void deleteConsumer(@RequestBody Consumer consumer) {
		consumerRepository.delete(consumer);
	}
	
	@PutMapping("/consumer")
	public Consumer updateConsumer(@RequestBody Consumer consumer) {
		return consumerRepository.save(consumer);
	}
}
