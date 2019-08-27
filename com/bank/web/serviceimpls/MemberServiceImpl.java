package com.bank.web.serviceimpls;
import com.bank.web.domains.*;
import com.bank.web.services.MemberService;

	public class MemberServiceImpl implements MemberService {

		private CustomerBean[] customers;
		private EmployeeBean[] employees;
		private int cuscount, empcount;
		
		public MemberServiceImpl() {
			customers = new CustomerBean[10];
			employees = new EmployeeBean[10];
			cuscount = 0;		
			empcount = 0;		
		}
		
		@Override
		public void Customerjoin(CustomerBean param) {
			customers[cuscount] = param;
			cuscount ++;
		}

		@Override
		public void Employeejoin(EmployeeBean param) {
			employees[empcount] = param;
			empcount ++;
			
		}
		@Override
		public CustomerBean[] findAllCustomers() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public EmployeeBean[] findAllEmployees() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MemberBean[] findByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MemberBean findById(String id) {
			MemberBean c = new MemberBean();
			for(int i=0 ; i<cuscount ; i++) {
				if(id.equals(customers[i].getId())) {
					c = customers[i];
					break;
				}
			}
			for(int i=0 ; i<empcount ; i++) {
				if(id.equals(employees[i].getId())) {
					c = employees[i];
					break;
				}
			}
			return c;
		}

		@Override
		public boolean login(MemberBean param) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int countCustomers() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int countEmployees() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean existId(String id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void updatePass(MemberBean param) {
			
			/*
			String id = param.getId();
			String[] pws = param.getPw().split(",");
			String oldpw = pws[0];
			String newps = pws[1];
			for(int i=0 ; i<count ; i++) {
				if()
			}
			*/
			
		}

		@Override
		public void deleteMember(MemberBean param) {
			// TODO Auto-generated method stub
			
		}


	
	
	}

