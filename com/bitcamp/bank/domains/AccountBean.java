package com.bitcamp.bank.domains;

public class AccountBean {

	private int  money;
	private String accountNum, today, ssn;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	
	
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return this.today;
	}
	
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return this.money;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호 : %s \n"
				+ "거래일 : %s \n"
				+ "입금액 : %d \n", accountNum, today, money);
	}
	
}


/*
회원: 아이디, 비번, 이름, 주민번호
id, pass, name, ssn
*/