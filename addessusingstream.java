package com.address.book.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

class MenuBar {

	static Scanner sc = new Scanner(System.in);

	static List<Book> AddressBook = new LinkedList<Book>();

	public static void optionChoice() {
		boolean ans = true;
		while (ans != false) {
			System.out.println("Please Enter Your Choice");
			System.out.println("1 Add New Contact");
			System.out.println("2 Show");
			System.out.println("3 Edit The Contact ");
			System.out.println("4 Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				newContact();
				break;
			case 2:
				show();
				break;
			case 3:
				editContact();
				break;
			case 4:
				ans = false;
			}

		}
	}

	public static void newContact() {
		System.out.println("Enter The First Name");
		String fName = sc.next();
		System.out.println("Enter The Last Name");
		String lName = sc.next();
		System.out.println("Enter The Address");
		String address = sc.next();
		System.out.println("Enter The City");
		String city = sc.next();
		System.out.println("Enter The State");
		String state = sc.next();
		System.out.println("Enter The Zip Code");
		String zip = sc.next();
		System.out.println("Enter The Phone Number");
		String phoneNumber = sc.next();
		System.out.println("Enter The Email Address");
		String email = sc.next();
		Book obj = new Book(fName, lName, address, city, state, zip, phoneNumber, email);
		AddressBook.add(obj);

	}

	public static void show() {

		System.out.println(AddressBook);
	}

	public static void editContact() {

		System.out.println("Enter The First Name You Want To Edit");
		String fName = sc.next();
		for (int i = 0; i < AddressBook.size(); i++) {

			if (AddressBook.get(i).getfirstName().equalsIgnoreCase(fName)) {
				System.out.println(AddressBook.get(i));
				System.out.println("Entet The Details Again\n");
				System.out.println("Enter The Last Name");
				String lName = sc.next();
				System.out.println("Enter The Address");
				String address = sc.next();
				System.out.println("Enter The City");
				String city = sc.next();
				System.out.println("Enter The State");
				String state = sc.next();
				System.out.println("Enter The Zip Code");
				String zip = sc.next();
				System.out.println("Enter The Phone Number");
				String phoneNumber = sc.next();
				System.out.println("Enter The Email Address");
				String email = sc.next();
				Book obj = new Book(fName, lName, address, city, state, zip, phoneNumber, email);
				AddressBook.add(obj);
			}else {
				System.out.println("Contact Does Not Exist");
			}

		}
	}
}

class Book {

	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

	public String toString() {

		return "Book [FirstName: " + fName + " LastName: " + lName + " Address: " + address + " City: " + city
				+ " State: " + state + " ZipCode: " + " " + zip + " PhoneNumber: " + phoneNumber + " EmailId: " + email
				+ " ] ";
	}
