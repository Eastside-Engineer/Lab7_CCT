package lab7;

import java.util.Scanner;

public class ThisIsALot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String name = scnr.nextLine();
		valid(name);
		System.out.println("Enter your first name: ");
		scnr.nextLine();

		System.out.println("Enter your email: ");
		String email = scnr.nextLine();
		emailValid(email);
		System.out.println("Enter your email: ");
		scnr.nextLine();

		System.out.println("Enter your number: ");
		String number = scnr.nextLine();
		numberValid(number);
		System.out.println("Enter your number: ");
		scnr.nextLine();

		System.out.println("Enter the date: ");
		String date = scnr.nextLine();
		dateValid(date);
		System.out.println("Enter the date: ");
		scnr.nextLine();

		scnr.close();

	}

	private static void valid(String input) {
		if (input.length() > 30) {
			System.out.println("Sorry, Name not valid.");
		} else if (!input.matches("[A-Z][a-zA-Z]*")) {
			System.out.println("Sorry, Name not valid.");
		} else {
			System.out.println("Name is Valid!");
		}
	}

	private static void emailValid(String input) {
		if (!input.matches("[a-zA-Z$_0-9]{5,30}@[a-zA-Z]{5,10}.[a-zA-Z]{2,3}")) {
			System.out.println("Sorry, Email not valid.");
		} else {
			System.out.println("Email is Valid!");
		}
	}

	private static void numberValid(String input) {
		if (!input.matches("\\d{3}-\\d{3}-\\d{4}")) {
			System.out.println("Sorry, number not valid.");
		} else {
			System.out.println("Number is Valid!");
		}
	}

	private static void dateValid(String input) {
		if (!input.matches("\\d{2}/\\d{2}[1,12]/\\d{4}")) {
			System.out.println("Sorry, Date not valid. Try Again: ");
		} else {
			System.out.println("Date is Valid!");
		}
	}
}
