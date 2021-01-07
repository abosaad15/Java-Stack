package emailapp;

import java.util.Scanner;

public class Email {
	
	// Fields
	
	private String email;
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailBoxCapacity = 10;
	private String altEmail;
	private int passLength = 10;
	private String companyName = "xcompany";
	
	// Constructor for firstName and lastName
	
	Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = passwordGenerator(passLength);
		this.email = combine();
		
	}
	
	
	// Ask for the department
	private String setDepartment() {
		
		System.out.println("Enter department:\n\n 1- Sales\n 2- Accounting\n 3- Development\n 0- none\n");
		System.out.print("Your choice: ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
		if (choice == 1) { return "sales."; }
		else if (choice == 2) { return "accounting."; } 
		else if (choice == 3) { return "development."; }
		else { return  ""; }
		
	}
	
	// Generate random password
	private String passwordGenerator(int length) {
		
		String charPool = "ABCDEFG456789HTMLhtmlpsqlxyzPSQLXYZ~!@#$%&*^abcdefg123";
		
		char [] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * charPool.length());
			password[i] = charPool.charAt(rand);
		}
		
		return new String(password);
	}
	
	
	// Combine the Email elements
	private String combine() {
		String email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + 
						"@" + this.department.toLowerCase() + this.companyName.toLowerCase() + ".com";
		
		/*
		 * 
		 * 	if you have a database, you can check if this email already exits, if so, 
		 * 	call altEmail to set a different email
		 * 
		 * */
		
		return email;
	}
	
	
	
	// Change password
	private void changePassword() {
		System.out.println("");
	}
	
	
	// Set mailBox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	
	// Set alternative Email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	
	// Get mailbox capacity 
	public int getMailBoxCapacity() {
		return this.mailBoxCapacity;
	}
	
	
	// Get email
	public String getEmail() {
		return this.email;
	}
	
	
	// Get password
	public String getPassword() {
//		return this.password;
		return "hello";
	}
	
	
	// print email info
	public String printInfo() {
		return "Name: " + this.firstName +" "+ this.lastName +
				"\n" + "Email : " + this.email + "\n" + "Mailbox capacity: " +
				this.mailBoxCapacity;
	}
}
