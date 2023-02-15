//Nathan Anglin
//CS-320
//Module 3 Milestone
//ContactTest.java

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {
	@Test
	public void testContactIDPass() {
		//Test with valid contact IDs
		Contact testContact = new Contact();
		assertEquals(true,testContact.setContactID("1234567890"));	
		Contact testContact2 = new Contact();
		assertEquals(true,testContact2.setContactID("1234"));	
	}
	@Test
	public void testContactIDFail() {
		//Test with invalid contact IDs
		Contact testContact = new Contact();
		assertEquals(false,testContact.setContactID("123456789012345"));
		//Check to make sure it cannot be updated
		assertEquals(true,testContact.setContactID("1234567890"));	
		assertEquals(false,testContact.setContactID("1234567891"));	
	}
	@Test
	public void testFirstNamePass() {
		//Test with valid first names
		Contact testContact = new Contact();
		assertEquals(true,testContact.setFirstName("Dave"));
		assertEquals(true,testContact.setFirstName("Charlimane"));		
	}
	@Test
	public void testFirstNameFail() {
		//Test with invalid first names
		Contact testContact = new Contact();
		assertEquals(false,testContact.setFirstName(""));
		assertEquals(false,testContact.setFirstName("Charlimane's dog Freddy"));		
	}
	@Test
	public void testLastNamePass() {
		//Test with valid last name
		Contact testContact = new Contact();
		assertEquals(true,testContact.setLastName("Dave"));
		assertEquals(true,testContact.setLastName("Charlimane"));		
	}
	@Test
	public void testLastNameFail() {
		//Test with invalid last name
		Contact testContact = new Contact();
		assertEquals(false,testContact.setLastName(""));
		assertEquals(false,testContact.setLastName("Charlimane's dog Freddy"));		
	}
	@Test
	public void testNumberPass() {
		//Test with valid phone numbers
		Contact testContact = new Contact();
		assertEquals(true,testContact.setNumber("5555551234"));
		assertEquals(true,testContact.setNumber("1234567890"));		
	}
	@Test
	public void testNumberFail() {
		//Test with invalid phone numbers
		Contact testContact = new Contact();
		assertEquals(false,testContact.setNumber(""));
		assertEquals(false,testContact.setNumber("123456789"));
		assertEquals(false,testContact.setNumber("1234567890123"));		
	}
	@Test
	public void testAddressPass() {
		//Test with valid address
		Contact testContact = new Contact();
		assertEquals(true,testContact.setAddress("A road"));
		assertEquals(true,testContact.setAddress("800 Cool Austin, Texas 98745"));		
	}
	@Test
	public void testAddressFail() {
		//Test with invalid address
		Contact testContact = new Contact();
		assertEquals(false,testContact.setFirstName(""));
		assertEquals(false,testContact.setFirstName("800 Feet past the dumpster beside the KFC along that one street over there"));		
	}

}
