package com.bank.web.domains;

public class AccountBean {

	private int  money;
	private String accountNum, today ;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	
	@Override
	public String toString() {
		return "계좌정보 \n 계좌번호 : " + accountNum + "\n 개설일 : " + today + "\n  money : " + money ;
	}
	
	
	
}

