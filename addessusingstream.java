package com.address.book.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class MenuBar {

	static Scanner sc = new Scanner(System.in);

	static List<Book> AddressBook = new LinkedList<Book>();

	public void optionChoice() {
		boolean ans = true;
		while (ans != false) {
			System.out.println("Please Enter Your Choice");
			System.out.println("1 Add New Contact");
			System.out.println("2 Show");
			System.out.println("3 Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				newContact();
				break;
			case 2:
				show();
				break;
			case 3:
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

	Book(String fName, String lName, String address, String city, String state, String zip, String phoneNumber,
			String email) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public void setfirstName(String fName) {
		this.fName = fName;
	}

	public String getfirstName() {
		return fName;
	}

	public void setlastName(String lName) {
		this.lName = lName;
	}

	public String getlastName() {
		return lName;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getaddress() {
		return address;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getcity() {
		return city;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public String getstate() {
		return state;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public String getzip() {
		return zip;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void getemail(String email) {
		this.email = email;
	}

	public String getemail() {
		return email;
	}
}

public class AddressBookStr {

	public static void main(String args[]) {

		System.out.println("Welcome To Address Book Programmin");
		MenuBar obj = new MenuBar();
		obj.optionChoice();

	}

}
