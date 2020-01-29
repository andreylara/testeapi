package com.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.models.Request;

public interface RequestRepository extends JpaRepository<Request, Long>{

	Request findById(long id);
}
