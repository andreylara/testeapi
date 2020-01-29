package com.testeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

	Payment findById(long id);
}
