package com.bank.handler;

import java.sql.SQLException;
import java.util.ArrayList;
import com.bank.model.AccountModel;
import com.bank.model.TypeAccountModel;
import com.bank.service.AccountsService;
import com.bank.service.TypesAccountsService;

public class AccountHandler {
	
	public static ArrayList<AccountModel> findAll() throws ClassNotFoundException, SQLException{
		
		ArrayList<AccountModel> accounts = new ArrayList<AccountModel>();
		accounts = AccountsService.getAll();
		
		ArrayList<TypeAccountModel> typeAccounts = new ArrayList<TypeAccountModel>();
		typeAccounts = TypesAccountsService.getAll();
		
		for(AccountModel account : accounts) {
			for(TypeAccountModel typeAccount : typeAccounts) {
				if(typeAccount.getIdTypeAccount() == account.getTypeAccount().getIdTypeAccount()) {
					account.setTypeAccount(typeAccount);
					break;
				}
			}
		}
		
		return accounts;
	}

}
