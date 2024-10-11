package ch06.exam01.A04;

public class BankAccount {
	int money;
	int balance = 0;
	int deposit( int money) {
		balance += money;
		System.out.println(money +"원 입금 완료. 현재 잔액: "+ balance);
		return balance;
	}
	
	int withdraw(int money) {
		
		if (balance - money  > 0) {
			balance -=money;
			System.out.println(money +"원 출금 완료. 현재 잔액: "+ balance);
		
		}
		else {
			System.out.println("출금 불가");
		}
		return balance;
	}
}
