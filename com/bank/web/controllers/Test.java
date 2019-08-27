package com.bank.web.controllers;

import com.bank.web.serviceimpls.AccountServiceImpl;

public class Test {

	public static void main(String[] args) {

		AccountServiceImpl s = new AccountServiceImpl();
		String result = s.createAccountNum();
		System.out.println(result);
		
	}

}
