package com.bank.model;

public class TypeIdModel {
	
	/*
	 `IdTypeIdentification` TINYINT NOT NULL AUTO_INCREMENT,
	 `Description` VARCHAR(45) NOT NULL,
	 PRIMARY KEY(`IdTypeIdentification`)) 
	 */

	private int idTypeId;
	private String description;
	
	public TypeIdModel() {
		super();
	}
	
	public TypeIdModel(int idTypeId, String description) {
		super();
		this.idTypeId = idTypeId;
		this.description = description;
	}

	public int getIdTypeId() {
		return idTypeId;
	}

	public void setIdTypeId(int idTypeId) {
		this.idTypeId = idTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
