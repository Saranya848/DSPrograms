package com.dsproblems;

import java.util.Scanner;

public class BankServer {

	public double bal = 5000;
	public double pwd;
	int money;

	/*
	 * created method to deposite money
	 */
	public void Deposite() {
		System.out.print("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if (pwd == 123) {

			System.out.print("\nEnter a Amount to Deposite :");
			Scanner x1 = new Scanner(System.in);
			money = x1.nextInt();

			bal += money;
			System.out.println("deposited money :" + money);
			System.out.println("Total Account Balance is  :" + bal);
			s.close();
			x1.close();
		} else {
			System.out.println("Incorrect password");
		}
	}

	/*
	 * created method to withdrawal money
	 */
	public void Withdrawl() {
		System.out.print("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if (pwd == 123) {
			System.out.print("\nEnter the Amount of Witdrawal :");
			Scanner x1 = new Scanner(System.in);
			money = x1.nextInt();

			bal -= money;
			System.out.println("Withdrawal money :" + money);
			System.out.println("Total Account Balance is :" + bal);
			x1.close();
		} else {
			System.out.println("Incorrect password");
		}
		s.close();
	}

	/*
	 * created method to check balance
	 */
	public void balance() {
		System.out.print("Enter password :");
		Scanner s = new Scanner(System.in);
		pwd = s.nextInt();

		if (pwd == 123) {
			System.out.println("Total Account Balance is :" + bal);
		} else {
			System.out.println("Incorrect password");
		}
		s.close();
	}
}
