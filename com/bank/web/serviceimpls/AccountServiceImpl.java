package com.bank.web.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.bank.web.domains.AccountBean;
import com.bank.web.services.AccountService;


public class AccountServiceImpl implements AccountService{

	private AccountBean[] account;
	private int count;
	
	public AccountServiceImpl() {
		account = new AccountBean[10];
		count = 0;
	}
	
	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountNum(createAccountNum());
		acc.setMoney(money);
		acc.setToday(findDate());
		account[count] = acc;
		count++;
	}

	@Override
	public String createAccountNum() {
		String result ="";
		Random ran = new Random();
		for(int i=0 ; i<9 ; i++) {
			result += (i==4)? "-" : ran.nextInt(10);
		}
		return result;
		
	}

	@Override
	public AccountBean[] findAll() {
		AccountBean[] acc = new AccountBean[count];
		for(int i=0 ; i<count ; i++) {
			acc[i] = account[i];
		}
		return acc;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean acc = new AccountBean();
		for(int i=0 ; i<count ; i++) {
			if(accountNum.equals(account[i].getAccountNum())) {
				acc = account[i];
			}
		}
		return acc;
	}

	@Override
	public int countAccounts() {
		return count;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean flag = false;
		for(int i=0 ; i<count ; i++) {
				if(accountNum.equals(account[i].getAccountNum())) {
					flag = true;
				}
		}
		return flag;
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		for(int i=0 ; i<count ; i++) {
			if(param.getAccountNum().equals(account[i].getAccountNum())) {
				account[i].setMoney(account[i].getMoney()+param.getMoney());
			}
		}
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		for(int i=0 ; i<count ; i++) {
			if(param.getMoney() <=account[i].getMoney()) {
			if(param.getAccountNum().equals(account[i].getAccountNum())) {
				account[i].setMoney(account[i].getMoney()-param.getMoney());
			}else {
				break;
				}
			}
		}
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		for(int i=0 ; i<count ; i++) {
			if(accountNum.equals(account[i].getAccountNum())) {
				account[i] = account[count-1];
				count--;
			}
		}
		
	}

}
