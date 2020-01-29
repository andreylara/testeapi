package com.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.models.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer, Long>{

	Consumer findById(long id);
}
