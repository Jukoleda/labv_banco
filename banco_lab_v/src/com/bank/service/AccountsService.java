package com.bank.service;

import com.bank.model.AccountModel;
import com.bank.model.TypeAccountModel;
import com.bank.util.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.bank.util.QueryGenerator;
import java.util.ArrayList;

public class AccountsService {
	/* 
	 `IdAccount` INT NOT NULL AUTO_INCREMENT,
  `TypeAccount` INT NOT NULL,
  `Description` VARCHAR(45) NOT NULL,
  */
		
	//QueryGenerator query;
	
	
	/*public Accounts() {
		
		ArrayList<String> fields = new ArrayList<String>();
		
		fields.add("IdAccount");
		fields.add("TypeAccount");
		fields.add("Description");
		
		this.query = new QueryGenerator("Accounts", fields);
		//System.out.println(this.query.Select().All().EndQuery());
		
	}*/
	
	public static ArrayList<AccountModel> getAll() throws ClassNotFoundException, SQLException{
	
		ArrayList<AccountModel> accounts = new ArrayList<AccountModel>();
		
		ResultSet rs = Connector.open().createStatement().executeQuery("use bank_med; select * from Accounts");
		
		while (rs.next()) {
			accounts.add(new AccountModel(rs.getInt(1), new TypeAccountModel(rs.getInt(2), ""), rs.getString(3)));
		}
		
		Connector.close();
		
		return accounts;
			
		
		
		
	}

}
