package com.bank.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bank.model.TypeIdModel;
import com.bank.util.Connector;

public class TypeIdService {
	
	public static ArrayList<TypeIdModel> getAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<TypeIdModel> accounts = new ArrayList<TypeIdModel>();
		
		ResultSet rs = Connector.open().createStatement().executeQuery("use bank_med; select * from TypeIdentification");
		
		while (rs.next()) {
			accounts.add(new TypeIdModel(rs.getInt(1), rs.getString(2)));
		}
		
		Connector.close();
		
		return accounts;
			
		
		
		
	}


}
