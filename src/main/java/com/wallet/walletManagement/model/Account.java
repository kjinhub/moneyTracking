package com.wallet.walletManagement.model;

import java.time.LocalDateTime;

public class Account {
	private Long id;
	private String name;
	private String type; // 현금 지출인지 카드 지출인지  
	private Double balance;
	private LocalDateTime createdAcc;
	private LocalDateTime updateAcc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreatedAcc() {
		return createdAcc;
	}
	public void setCreatedAcc(LocalDateTime createdAcc) {
		this.createdAcc = createdAcc;
	}
	public LocalDateTime getUpdateAcc() {
		return updateAcc;
	}
	public void setUpdateAcc(LocalDateTime updateAcc) {
		this.updateAcc = updateAcc;
	}
}
