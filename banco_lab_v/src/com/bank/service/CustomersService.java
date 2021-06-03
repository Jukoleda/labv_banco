package com.bank.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.model.CustomerModel;
import com.bank.model.TypeIdModel;
import com.bank.util.Connector;

public class CustomersService {
	
	public static ArrayList<CustomerModel> getAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<CustomerModel> accounts = new ArrayList<CustomerModel>();
		
		ResultSet rs = Connector.open().createStatement().executeQuery("use bank_med; select * from Customers");
		
		while (rs.next()) {
			accounts.add(new CustomerModel(rs.getInt(1), rs.getString(2), rs.getString(3), 
					new TypeIdModel(rs.getInt(4), ""), rs.getString(5), rs.getNString(6), rs.getString(7), rs.getBoolean(8)));
		}
		
		Connector.close();
		
		return accounts;
			
		
		
		
	}

}
