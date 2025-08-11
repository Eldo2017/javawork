package _09_access;

import _10_bank.T01_api_bank;

public class T02_Access2 {

	public static void main(String[] args) {
		T01_Access1 ac = new T01_Access1();
		
		// ac.x = 7; // 접근 못한다
		ac.setX(7);
		
		// int x = ac.x; // 접근 못한다
		System.out.println(ac.getX());
		
		
		// 타 패키지의 api 사용
		T01_api_bank bank = new T01_api_bank();
		
		bank.deposit(5000);
		
		System.out.println("현재 잔고 : " + bank.getBalance() + "원");
		
		bank.deposit(35000);
		
		System.out.println("현재 잔고 : " + bank.getBalance() + "원");
	}
}
