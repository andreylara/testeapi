package com.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.models.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>{

	Manufacturer findById(long id);
}
