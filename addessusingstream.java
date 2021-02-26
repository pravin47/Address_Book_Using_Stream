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
			System.out.println("4 Delete The Contact");
			System.out.println("5 Search The Contact Using City");
			System.out.println("6 Search The Contact Using State");
			System.out.println("7 Number Of Contacts By Same City");
			System.out.println("8 Number Of Contacts By Same State");
			System.out.println("9 Exit");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				MenuBar m = new MenuBar();
				m.newContact();
				break;
			case 2:
				show();
				break;
			case 3:
				editContact();
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				searchByCity();
				break;
			case 6:
				searchByState();
				break;
			case 7:
				countByCity();
				break;
			case 8:
				countByState();
				break;
			case 9:
				ans = false;
				break;

			}

		}
	}

	public void newContact() {
		System.out.println("Enter The How Many Person You Want To Add");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			System.out.println("Enter The First Name");
			String fName = sc.next();
			if (checkDuplicate(fName)) {
				System.out.println("Person is already exist");
			} else {
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

		}

	}

	public boolean checkDuplicate(String fname) {
		int flag = 0;
		for (Book b : AddressBook) {
			if (b.getfirstName().equals(fname)) {
				flag = 1;
				break;
			}
		}
		return flag == 1;
	}

	public static void show() {

		System.out.println(AddressBook);
	}

	public static void countByCity() {
		System.out.println("Enter The City Name You Want To Count Contacts");
		String city = sc.next();
		int count = 0;
		for (Book b : AddressBook) {
			if (b.getcity().equals(city)) {
				count++;
				System.out.println("Number Of Person Is :" + count);
				break;
			} else {
				System.out.println("City Does Not Exist");
			}
		}

	}

	public static void countByState() {

		System.out.println("Enter The State Name You Want To Count Contacts");
		String state = sc.next();
		int count = 0;
		for (Book b : AddressBook) {
			if (b.getstate().equals(state)) {
				count++;
				System.out.println("Number Of Person Is :" + count);
				break;
			} else {
				System.out.println("State Does Not Exist");
			}
		}
	}

	public static void searchByCity() {
		System.out.println("Enter The City You Want To Search");
		String city = sc.next();
		for (Book b : AddressBook) {
			if (b.getcity().equals(city)) {

				System.out.println(b);
				break;
			} else {
				System.out.println("City Does Not Exist");
			}
		}
	}

	public static void searchByState() {

		System.out.println("Enter The State You Want To Search");
		String state = sc.next();
		for (Book b : AddressBook) {
			if (b.getstate().equals(state)) {

				System.out.println(b);
				break;
			} else {
				System.out.println("State Does Not Exist");
			}
		}

	}

	public static void deleteContact() {
		System.out.println("Enter The First Name You Want To Delete");
		String fName = sc.next();
		for (int i = 0; i < AddressBook.size(); i++) {

			if (AddressBook.get(i).getfirstName().equalsIgnoreCase(fName)) {
				AddressBook.remove(i);
				System.out.println("Contact Delete Succesfully");
			} else {
				System.out.println("Contact Does Not Exist");
			}
		}
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
			} else {
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
