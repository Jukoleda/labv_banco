package com.bank.util;

import java.util.ArrayList;

public final class QueryGenerator {
	
	private String tableName = null;
	private ArrayList<String> fields = null;
	private String query = "";
	
	public QueryGenerator(String _tableName, ArrayList<String> _fields) {
		if(!_tableName.isEmpty())
			this.tableName = _tableName;
		if(!_fields.isEmpty())
			this.fields = _fields;
	}
	
	
	public QueryGenerator Select() {
		this.query = "select";
		return this;
	}
	
	public QueryGenerator All() {
		this.query += " * ";
		return this;
	}
	
	public String EndQuery() {
		
		if(this.query.contains("from"))	
			return this.query;
		
		return "use med_bank; " + this.query + " from " + tableName;
		
	}
	
	public QueryGenerator Where(String field, String value) {
		
		if(this.fields.contains(field)) {
			if(!this.query.contains("from"))
				this.query += " from " + tableName;
			this.query += " where " + field + " = " + value;
		}
		
		return this;
	}
}
