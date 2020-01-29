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

import com.testeapi.models.Manufacturer;
import com.testeapi.repository.ManufacturerRepository;

@RestController
@RequestMapping(value="/api")
public class ManufacturerResource {

	@Autowired
	ManufacturerRepository manufacturerRepository;
	
	@GetMapping("/manufacturers")
	public List<Manufacturer> listManufacturers(){
		return manufacturerRepository.findAll();
	}
	
	@GetMapping("/manufacturer/{id}")
	public Manufacturer listUniqueManufacturer(@PathVariable (value="id") long id){
		return manufacturerRepository.findById(id);
	}
	
	@PostMapping("/manufacturer")
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}
	
	@DeleteMapping("/manufacturer")
	public void deleteManufacturer(@RequestBody Manufacturer manufacturer) {
		manufacturerRepository.delete(manufacturer);
	}
	
	@PutMapping("/manufacturer")
	public Manufacturer updateManufacturer(@RequestBody Manufacturer manufacturer) {
		return manufacturerRepository.save(manufacturer);
	}
}