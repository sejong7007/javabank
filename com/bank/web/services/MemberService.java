package com.bank.web.services;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.MemberBean;

	public interface MemberService {
	
		public void Customerjoin(CustomerBean param);
		public void Employeejoin(EmployeeBean param);
		public CustomerBean[] findAllCustomers();
		public EmployeeBean[] findAllEmployees();
		public MemberBean[] findByName(String name);
		public MemberBean findById(String id); 
		boolean login(MemberBean param);
		int countCustomers(); 
		int countEmployees();
		boolean existId(String id);
		void updatePass(MemberBean param);
		void deleteMember(MemberBean param);
	}

	
