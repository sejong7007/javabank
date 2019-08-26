package com.bitcamp.bank.services;
import com.bitcamp.bank.domains.MemberBean;
/*
 *  void join(CustomerBean param);
	CustomerBean[] findAllCustomers();
	AdminBean[] findAllAdmins();
	MemberBean[] findByName(String name); // 고객, 사원 공용메소드
	MemberBean findById(String id); // 고객, 사원 공용메소드
	boolean login(MemberBean param); // 고객, 사원 공용메소드
	int countCustomers(); // 고객수
	int countAdmins(); // 직원수
	boolean existId(String id);
	void updatePass(MemberBean param);
	void deleteMember(MemberBean param);
 * 
 * */

	public interface MemberService {
	
		//public void join(CustomerBean param);
		public String[] findAll();
		public String[] findByName();
		public boolean login(String id);
		public void updatePass(MemberBean param);
		public void deletMember(MemberBean parm);

	}

	
