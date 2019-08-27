package com.bank.web.domains;

public class CustomerBean extends MemberBean {

	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getCredit() {
		return this.credit;
	}
	@Override
	public String toString() {
		return "[고객정보]"
				+ "\n 고객 아이디 : " + super.getId()
				+ "\n 고객 비밀번호 : " + super.getPw()
				+ "\n 고객 이름 : " + super.getName()
				+ "\n 신용도 : " + credit;
	}
	
	
	
}

/*
@Override
public String toString() {
	return String.format("고객 ID : %s"
			+ "고객 비밀번호 : %s"
			+ "고객 이름 : %s"
			+ "고객 신용도 : %s", super.getId(),super.getPw(),super.getName(),credit);
}
*/