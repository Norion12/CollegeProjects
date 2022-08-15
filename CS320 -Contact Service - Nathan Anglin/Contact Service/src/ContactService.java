//Nathan Anglin
//CS-320
//Module 3 Milestone
//ContactService.java

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	public boolean addContact(String contactID, String firstName, String lastName, String number, String address) {
		//Check for ID match, if found return false
		for(Contact tempContact : contactList) {
			String tempString = tempContact.getContactID();
			System.out.println(tempString);
			if(tempString.equals(contactID)) {
				return false;
			}
		}
		//If no conflict found create a new contact and add to list
		Contact tempContact = new Contact();
		if(tempContact.setContactID(contactID) == false) {
			return false;
		}
		if(tempContact.setFirstName(firstName) == false) {
			return false;
		}
		if(tempContact.setLastName(lastName) == false) {
			return false;
		}
		if(tempContact.setNumber(number) == false) {
			return false;
		}
		if(tempContact.setAddress(address) == false) {
			return false;
		}
		if(contactList.add(tempContact)) {
			return true;
		}
		return false;

	}
	
	public boolean deleteContact(String contactID) {
		//Check for ID match, if found delete that contact
		for(Contact tempContact : contactList) {
			String tempString = tempContact.getContactID();
			if(tempString.equals(contactID)) {
				contactList.remove(tempContact);
				return true;
			}
		}	
		//Otherwise return failed
		return false;
			
	}
	
	public boolean updateContact(String contactID, String firstName, String lastName, String number, String address) {
		//Check for ID match, if found update all fields
		for(Contact tempContact : contactList) {
			if(tempContact.getContactID() == contactID) {
				if(tempContact.setFirstName(firstName) == false) {
					return false;
				}
				if(tempContact.setLastName(lastName) == false) {
					return false;
				}
				if(tempContact.setNumber(number) == false) {
					return false;
				}
				if(tempContact.setAddress(address) == false) {
					return false;
				}
				return true;
			}
		}	
		
		return false;
	}
	
	
}
