package com.bank.handler;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.model.CustomerModel;
import com.bank.model.TypeIdModel;
import com.bank.service.CustomersService;
import com.bank.service.TypeIdService;
import com.bank.util.SessionClass;

public class CustomerHandler {
	
	public static ArrayList<CustomerModel> findAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<CustomerModel> customers = new ArrayList<CustomerModel>();
		customers = CustomersService.getAll();
		
		ArrayList<TypeIdModel> typesId = new ArrayList<TypeIdModel>();
		typesId = TypeIdService.getAll();
		
		for(CustomerModel customer : customers) {
			for(TypeIdModel typeId : typesId) {
				if(typeId.getIdTypeId() == customer.getTypeId().getIdTypeId()) {
					customer.setTypeId(typeId);
					break;
				}
			}
		}
		
		return customers;
	}
	
	public static CustomerModel find(SessionClass target) throws ClassNotFoundException, SQLException {
		ArrayList<CustomerModel> customers = findAll();
		for(CustomerModel customer : customers) {
			if(customer.getEmail().compareTo(target.getEmail()) == 0 && customer.getPass().compareTo(target.getPass()) == 0){
				return customer;
			}
		}
		return null;
	}
}
