package com.bank.web.domains;

public class EmployeeBean extends MemberBean {

	private int sabun;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getSabun() {
		return this.sabun;
	}
	@Override
	public String toString() {
		return "[직원정보]"
			+ "\n 직원 아이디 : " + super.getId()
			+ "\n 직원 비밀번호 : " + super.getPw()
			+ "\n 직원 이름 : " + super.getName()
			+ "\n 직원 사번 : " + sabun ;
	}
	
}
