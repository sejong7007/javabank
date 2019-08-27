package com.bank.web.controllers;
import javax.swing.JOptionPane;

import com.bank.web.domains.AccountBean;
import com.bank.web.serviceimpls.AccountServiceImpl;

public class AccountController {

	public static void main(String[] args) {
		AccountBean account = new AccountBean();
		AccountServiceImpl service = new AccountServiceImpl();
		String[] arr = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.계좌개설 \n"
					+ "2.전체 계좌조회 \n"
					+ "3.계좌번호로 계좌조회 \n"
					+ "4.전체 계좌 수 조회 \n"
					+ "5.계좌 입금 \n"
					+ "6.계좌 출금 \n"
					+ "7.계좌 삭제 \n")) {
			case "0" : 
				return;
			case "1" :
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				service.createAccount(account.getMoney());
				break;
			case "2" : 
				JOptionPane.showMessageDialog(null, service.findAll());
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null, service.findByAccountNum(JOptionPane.showInputDialog("계좌번호")));
				break;
			case "4" : 
				JOptionPane.showMessageDialog(null, service.countAccounts());
				break;
			case "5" : 
				arr = JOptionPane.showInputDialog("계좌번호,입금액").split(",");
				account.setAccountNum(arr[0]);
				account.setMoney(Integer.parseInt(arr[1]));
				service.depositMoney(account);
				break;
			case "6" :
				arr = JOptionPane.showInputDialog("계좌번호,출금액").split(",");
				account.setAccountNum(arr[0]);
				account.setMoney(Integer.parseInt(arr[1]));
				service.withdrawMoney(account);
				break;
			case "7" : 
				service.deleteAccountNum(JOptionPane.showInputDialog("삭제할 계좌번호"));
				break;
			}
		}
		
	}
	
}
