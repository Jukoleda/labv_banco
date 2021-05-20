package com.bank.model;

import com.bank.model.TypeAccountModel;

public class AccountModel {
	
	/* `IdAccount` INT NOT NULL AUTO_INCREMENT,
	  `TypeAccount` INT NOT NULL,
	  `Description` VARCHAR(45) NOT NULL,*/
	private int idAccount;
	private TypeAccountModel typeAccount;
	private String description;
	

	public AccountModel() {
		this.typeAccount = new TypeAccountModel();
		this.idAccount = 0;
		this.description = "";		
	}

	public AccountModel(int idAccount, TypeAccountModel typeAccount, String description) {
		this.idAccount = idAccount;
		this.typeAccount = typeAccount;
		this.description = description;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public TypeAccountModel getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(TypeAccountModel typeAccount) {
		this.typeAccount = typeAccount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
