package com.bank.web.services;
import com.bank.web.domains.AccountBean;

/*
 * void createAccount(int money);   돈을 넣으면 계좌번호, 날짜를 받아서 새로운 account가 만들어진다. 
 * public String createAccountNum();
 * 계좌번호생성(1234-5678);
 * AcccountBean[] findAll();
 * AccountBean findByAccountNum(String accuontNum)
 * int countAccounts();
 * boolean existAccountNum(String accountNum);
 * String findDate(); 오늘날짜, 현재시간(분까지) 반화
 * void depositMoney(AccountBean param);
 * void withdrawMoney(AccountBean param);
 * void deleteAccountNum(String accountNum);
 * */

public interface AccountService {
	
	public void createAccount(int money);
	public String createAccountNum();	// 계좌번호 생성(1234-5678)
	public AccountBean[] findAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccounts();
	public boolean existAccountNum(String accountNum);
	public String findDate(); // 오늘날짜, 현재시간(분까지) 반환
	public void depositMoney(AccountBean param);
	public void withdrawMoney(AccountBean param);
	public void deleteAccountNum(String accountNum);

}

