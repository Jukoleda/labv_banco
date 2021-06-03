package com.bank.model;

public class CustomerModel {
	  /*
	  `IdCustomer` INT NOT NULL AUTO_INCREMENT,
	  `FirstName` VARCHAR(45) NULL,
	  `LastName` VARCHAR(45) NULL,
	  `TypeId` INT NOT NULL,
	  `IdNumber` VARCHAR(20) NOT NULL,
	  `Email` VARCHAR(45) NULL,
	  `Pass` VARCHAR(45) NULL,
	  `IsAdmin` BOOLEAN DEFAULT 0,
	  PRIMARY KEY (`IdCustomer`))
	  */
	
	private int idCustomer;
	private String firstName;
	private String lastName;
	private TypeIdModel typeId;
	private String idNumber;
	private String email;
	private String pass;
	private boolean idAdmin;
	
	
	public CustomerModel() {
		super();
	}
		
	public CustomerModel(int idCustomer, String firstName, String lastName, TypeIdModel typeId, String idNumber,
			String email, String pass, boolean idAdmin) {
		super();
		this.idCustomer = idCustomer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.typeId = typeId;
		this.idNumber = idNumber;
		this.email = email;
		this.pass = pass;
		this.idAdmin = idAdmin;
	}
	
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public TypeIdModel getTypeId() {
		return typeId;
	}
	public void setTypeId(TypeIdModel typeId) {
		this.typeId = typeId;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(boolean idAdmin) {
		this.idAdmin = idAdmin;
	}
	
	
	
}
