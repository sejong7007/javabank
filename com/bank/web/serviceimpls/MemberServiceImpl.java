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
		public void customerJoin(CustomerBean param) {
			customers[cuscount] = param;
			cuscount ++;
		}

		@Override
		public void employeeJoin(EmployeeBean param) {
			employees[empcount] = param;
			empcount ++;
			
		}
		@Override
		public CustomerBean[] findAllCustomers() {
			CustomerBean[] cust = new CustomerBean[cuscount];
			for(int i=0 ; i<cuscount ; i++) {
				cust[i] = customers[i];
			}
			return cust;
		}

		@Override
		public EmployeeBean[] findAllEmployees() {
			EmployeeBean[] empl = new EmployeeBean[empcount];
			for(int i=0 ; i<empcount ; i++) {
				empl[i] = employees[i];
			}
			return empl;
		}

		@Override
		public MemberBean[] findByName(String name) {
			customers = new CustomerBean[10];
			employees = new EmployeeBean[10];
			int count1=0 , count2=0 , count3=0;
			for(int i=0 ; i<cuscount ; i++) {
				if(name.equals(customers[i].getName())) {
					count1++;
					break;
				}
			}
			for(int i=0 ; i<cuscount ; i++) {
				if(name.equals(employees[i].getName())) {
					count2++;
					break;
				}
			}
			count3 = count1 + count2;
			MemberBean[] members = new MemberBean[count3];
			int j=0;
			for(int i=0 ; i<cuscount ; i++) {
				if(name.equals(customers[i].getName())) {
					members[j] = customers[i];
					j++;
					if(count1==j) {
						break;
					}
					break;
				}
			}
			int k = 0;
			for(int i=0 ; i<cuscount ; i++) {
				if(name.equals(employees[i].getName())) {
					members[j] = employees[i];
					k++;
					j++;
					if(count2==k) {
						break;
					}
					break;
				}
			}
			return members;
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
			return findById(param.getId()).getPw().equals(param.getPw());
		}

		@Override
		public int countCustomers() {
			return cuscount;
		}

		@Override
		public int countEmployees() {
			return empcount;
		}

		@Override
		public boolean existId(String id) {
			boolean flag = false;
			for(int i=0 ; i<cuscount ; i++) {
				if(id.equals(customers[i].getId())) {
					flag = true;
					break;
				}
			}
			for(int i=0 ; i<empcount ; i++) {
				if(id.equals(employees[i].getId())) {
					flag = true;
					break;
				}
			}
			return flag;
		}

		@Override
		public void updatePass(MemberBean param) {
			String id = param.getId();
			String[] pws = param.getPw().split(",");
			String oldpw = pws[0];
			String newps = pws[1];
			param.setPw(oldpw);
				if(login(param)) {
				
					for(int i=0 ; i<cuscount ; i++) {
						if(id.equals(customers[i].getId())) {
							customers[i].setPw(newps);;
							break;
						}
					}
					for(int i=0 ; i<empcount ; i++) {
						if(id.equals(employees[i].getId())) {
							employees[i].setPw(newps);;
							break;
						}
					}
				}
		}

		@Override
		public void deleteMember(MemberBean param) {
			if(login(param)) {
				for(int i=0 ; i<cuscount ; i++) {
					if(param.getId().equals(customers[i].getId())) {
						customers[i] = customers[cuscount-1];
						customers[cuscount-1] = null;
						cuscount--;
						break;
					}
				}
				for(int i=0 ; i<empcount ; i++) {
					if(param.getId().equals(employees[i].getId())) {
						employees[i] = employees[empcount-1];
						employees[empcount-1] = null;
						empcount--;
						break;
					}
				}
			}
		}
	}


	
	
	