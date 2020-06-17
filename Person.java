

public class Person {
	String name;
	String profession;
	int phoneNumber;
	String emailAddress;
	String physicalAddress;
	
	// Constructor for person
	
	public Person(String name, String profession, int phoneNumber, String emailAddress, String physicalAddress) {
		this.name = name;
		this.profession = profession;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	
	public String toString() {
		String proper = "";
		proper += "\nName: " + this.name;
		proper += "\nProfession: " + this.profession;
		proper += "\nPhone Number: "+ + this.phoneNumber;
		proper += "\nEmail Address: " + this.emailAddress;
		proper += "\nPhysical Address: " + this.physicalAddress;
		return proper;
	}

	public void setPhoneNumber(int phoneNumber) {			// Three setters here for editing contractor's contact details
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	
}