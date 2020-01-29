package com.testeapi.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment implements Serializable{

	private static final long serialVersionID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String mode;	
	private BigDecimal amount;	
	private Integer installments;	
	private BigDecimal installmentValue;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public BigDecimal getInstallmentValue() {
		return installmentValue;
	}

	public void setInstallmentValue(BigDecimal installmentValue) {
		this.installmentValue = installmentValue;
	}	
}
