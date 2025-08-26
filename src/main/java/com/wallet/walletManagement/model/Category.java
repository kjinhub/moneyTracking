package com.wallet.walletManagement.model;

import java.time.LocalDateTime;

public class Category {
	private Long id;
	private String name;
	private String type;
	private LocalDateTime createAcc;
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
	public LocalDateTime getCreateAcc() {
		return createAcc;
	}
	public void setCreateAcc(LocalDateTime createAcc) {
		this.createAcc = createAcc;
	}
}
