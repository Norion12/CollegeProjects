//Nathan Anglin
//CS-320
//Module 3 Milestone
//Contact.java

public class Contact{
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;

//Default Constructor
	
	public Contact() {
		this.contactID = null;
		this.firstName = null;
		this.lastName = null;
		this.number = null;
		this.address = null;
	}
	
//Accessors

	public String getContactID(){
		return contactID;
	}

	public String getfirstName(){
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

//Mutators
	
	public boolean setContactID(String inputName) {
		int length = inputName.length();
		//Check to make sure that contactID is between 0 and 10 characters and is only written to a new contact
		if (length < 11 && length > 0 && this.contactID == null) {
			this.contactID = inputName;
			return true;
		}
		else {
			return false;
		}
	}

	public boolean setFirstName(String inputName) {
		int length = inputName.length();
		//Check to make sure that contactID is between 0 and 10 characters
		if (length < 11 && length > 0) {
			this.firstName = inputName;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setLastName(String inputName) {
		int length = inputName.length();
		//Check to make sure that contactID is between 0 and 10 characters
		if (length < 11 && length > 0 && inputName != null) {
			this.lastName = inputName;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setNumber(String inputString) {
		int length = inputString.length();
		//Check to make sure that contactID is exactly 10 characters
		if (length == 10) {
			this.number = inputString;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean setAddress(String inputString) {
		int length = inputString.length();
		//Check to make sure that contactID is between 0 and 10 characters
		if(length < 31 && length > 0) {
			this.address = inputString;
			return true;
		}
		else {
			return false;
		}
	}
}