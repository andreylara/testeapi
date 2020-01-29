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

import com.testeapi.models.Request;
import com.testeapi.repository.RequestRepository;

@RestController
@RequestMapping(value="/api")
public class RequestResource {

	@Autowired
	RequestRepository requestRepository;
	
	@GetMapping("/requests")
	public List<Request> listRequest(){
		return requestRepository.findAll();
	}
	
	@GetMapping("/request/{id}")
	public Request listUniqueRequest(@PathVariable (value="id") long id){
		return requestRepository.findById(id);
	}
	
	@PostMapping("/request")
	public Request saveRequest(@RequestBody Request request) {
		return requestRepository.save(request);
	}
	
	@DeleteMapping("/request")
	public void deleteRequest(@RequestBody Request request) {
		requestRepository.delete(request);
	}
	
	@PutMapping("/request")
	public Request updateRequest(@RequestBody Request request) {
		return requestRepository.save(request);
	}
}