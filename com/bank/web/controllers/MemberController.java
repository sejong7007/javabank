package com.bank.web.controllers;
import javax.swing.JOptionPane;
import com.bank.web.domains.*;
import com.bank.web.serviceimpls.MemberServiceImpl;

public class MemberController {

	public static void main(String[] args) {

		CustomerBean customer = null;
		EmployeeBean employee = null;
		MemberBean member = null;
		MemberServiceImpl service = new MemberServiceImpl();
		String arr[] = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원 가입 \n"
					+ "2.직원 가입\n"
					+ "3.전체 회원 조회\n"
					+ "4.전체 직원 조회\n"
					+ "5.이름 조회\n"
					+ "6.아이디 조회\n"
					+ "7.전체 회원수\n"
					+ "8.전체 직원수\n"
					+ "9.비밀번호 수정\n"
					+ "10.삭제\n")) {
			case "0" : 
				return;
			case "1" :
				customer = new CustomerBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호,이름,신용도").split(",");
				customer.setId(arr[0]);
				customer.setPw(arr[1]);
				customer.setName(arr[2]);
				customer.setCredit(arr[3]);
				service.customerJoin(customer);
				break;
			case "2" : 
				employee = new EmployeeBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호,이름,사번").split(",");
				employee.setId(arr[0]);
				employee.setPw(arr[1]);
				employee.setName(arr[2]);
				employee.setSabun(Integer.parseInt(arr[3]));
				service.employeeJoin(employee);
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, service.findAllCustomers());
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, service.findAllEmployees());
				break;
			case "5" :
				service.findByName(JOptionPane.showInputDialog("이름"));
				break;
			case "6" :
				service.findById(JOptionPane.showInputDialog("아이디"));
				break;
			case "7" :
				JOptionPane.showMessageDialog(null, 
						String.format("전체 회원수 : %s명",service.countCustomers()));
				break;
			case "8" :
				JOptionPane.showMessageDialog(null, 
						String.format("전체 직원수 : %s명",service.countEmployees()));
				break;
			case "9" :
				member = new MemberBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호,신규비밀번호").split(",");
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				service.updatePass(member);
				break;
			case "10" : 
				member = new MemberBean();
				arr = JOptionPane.showInputDialog("아이디,비밀번호").split(",");
				member.setId(arr[0]);
				member.setPw(arr[1]);
				service.updatePass(member);
				break;
			}
		}
		
	}

}
