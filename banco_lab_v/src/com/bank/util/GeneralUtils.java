package com.bank.util;

public class GeneralUtils {
	
	public static boolean isEmailFormat(String target) {
		return target.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
	}

}
