package com.bank.model;

public class TypeAccountModel {
	/*
	 IdTypeAccount` INT NOT NULL AUTO_INCREMENT,
  	`Description` VARCHAR(45) NOT NULL,
  	PRIMARY KEY (`IdTypeAccount`))
  */
	private int idTypeAccount;
	private String description;
	
	public TypeAccountModel() {
		this.idTypeAccount = 0;
		this.description = "";
	}
	
	public TypeAccountModel(int _idTypeAccount, String _description) {
		this.idTypeAccount = _idTypeAccount;
		this.description = _description;
	}

	public int getIdTypeAccount() {
		return idTypeAccount;
	}

	public void setIdTypeAccount(int idTypeAccount) {
		this.idTypeAccount = idTypeAccount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
