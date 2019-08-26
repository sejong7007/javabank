package com.bitcamp.bank.domains;

public class MemberBean {

	private String id, pw, name, ssn;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	
	@Override
	public String toString() {
		return String.format("아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "이름 : %s \n"
				+ "주민번호 : %s \n", id, pw, name, ssn);
	}
	
}
