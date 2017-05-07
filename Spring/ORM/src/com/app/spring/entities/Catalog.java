package com.app.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalog {

	@Id
	private int itemCode;
	private String itemName;

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
