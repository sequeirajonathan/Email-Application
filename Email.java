package emailapp;
import java.util.*;
public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String companySuffix = "CGA.com";
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	static Random randGen = new Random();
	
	// Constructor to receive first and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("\nNew Worker: " + this.firstName);
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		System.out.println("\nDepartment: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("\nYour Password: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + department.toLowerCase() +
				"@" + companySuffix;
	System.out.println("Your Email is: " + email);
	}
	
	// Ask for department
		private String setDepartment() {
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		int depChoice = scnr.nextInt();
		
		if (depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "Development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return "N/A";}
	}
	
	// Generate a random password
		
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			
			for (int i = 0; i < length; i++) {
			int randomNum = randGen.nextInt(length);
			password[i] = passwordSet.charAt(randomNum);
			}
			
			return new String(password);
			
			
		}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public int gettMailboxCapacity() {
		return mailboxCapacity;
	}
	// Set the alternative email
	public void setAlternateEmail(String altEmail) {
		this.email = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	
	// Change password
	public void changePassword(String password ) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	// Displays Information
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"Comapany Email: " + email +
				"Mailbox Capacity: " + mailboxCapacity ;
	}
	

}
