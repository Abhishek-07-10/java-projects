package com.atmProject.Atm;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		// ATM_STORE atm = new ATM_STORE();
		ATM_OPERTATION oper = new ATM_OPERTATION();
		int accountNo = 1234;
		int pin = 1234;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number and pin: ");
		int acc = sc.nextInt();
		int p = sc.nextInt();
		if(acc == accountNo && pin == p){
			while(true){
				System.out.println("1. Withdraw money\n2. Deposit money\n3. View balance\n4. Mini-Statement\n5. Exit");
				int query = sc.nextInt();
				if(query == 1){
					System.out.println("Enter the amount to withdraw: ");
					double amt = sc.nextDouble();
					
					oper.withdrawMoney(amt);

				}else if(query == 2){
					System.out.println("Enter the amount to deposit: ");
					double amt = sc.nextDouble();
					oper.depositMoney(amt);

				}else if(query == 3){
					oper.viewBalance();

				}else if(query == 4){
					oper.miniStatement();

				}else if(query == 5){
					System.out.println("Thanks!!!");
					System.exit(0);
				}else{
					System.out.println("Enter the correct query");
				}
			}
		}
		else{
			System.out.println("Enter correct credentials !!!!");
		}
		sc.close();
	}

}
