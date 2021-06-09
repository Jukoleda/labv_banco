package com.bank.util;

import com.bank.model.CustomerModel;

public class SessionClass {
	
	private CustomerModel usuario;
	
	public SessionClass(CustomerModel usuario) {
		super();
		this.usuario = usuario;
	}
	
	public SessionClass() {
		super();
	}
	
	public CustomerModel getUsuario() {
		return usuario;
	}
	
	public void setUsuario(CustomerModel usuario) {
		this.usuario = usuario;
	}
		
}
