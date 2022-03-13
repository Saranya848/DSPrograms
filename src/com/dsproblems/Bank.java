package com.dsproblems;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		BankServer bs = new BankServer(5);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(
					"\n 1. Add customer to queue\n 2. Remove customer from queue\n 3. Display queue\n 4. Exit");
			System.out.println(" Please enter your choice: ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.print(" Please enter the name of the customer: ");
				String name = scan.next();
				System.out.print(" Please enter the amount to be debited(-ve if withdrawal): ");
				int amount = scan.nextInt();
				bs.enqueue(amount, name);
				break;
			case 2:
				bs.dequeue();
				break;
			case 3:
				bs.display();
				break;
			case 4:
				scan.close();
				return;
			default:
				System.out.println(" Please enter a valid choice!");
			}
		}
	}
}
