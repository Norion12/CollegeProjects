//Nathan Anglin
//CS-320
//Module 3 Milestone
//ContactServiceTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactServiceTest {

	@Test
	public void testAddPass() {
		ContactService tempCS = new ContactService();
		//All valid fields
		assertEquals(true, tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street"));
		assertEquals(true, tempCS.addContact("1200", "Bobby", "Smith", "0123456789", "80045 Cool Street"));
		assertEquals(true, tempCS.addContact("1100", "Nate", "Johnson", "5555551234", "1000 Chill Street"));
		assertEquals(true, tempCS.addContact("1501", "Charles", "Mley", "5555551234", "900 Coding Street"));
	}
	@Test
	public void testAddFail() {
		ContactService tempCS = new ContactService();
		//Contact ID too Long
		assertEquals(false, tempCS.addContact("1234567891011", "Bob", "Marley", "5555551234", "800 Cool Street"));
		//First Name too Long
		assertEquals(false, tempCS.addContact("123456", "Bobbby J Johnathan Clarck", "Marley", "5555551234", "800 Cool Street"));
		//Phone number not 10 digits
		assertEquals(false, tempCS.addContact("1234567", "Bob", "Marley", "55", "800 Cool Street"));
		//Address too long
		assertEquals(false, tempCS.addContact("1500", "Bob", "Marley", "5555551234", "800 Cool Street On the other side of the road next to a small tree"));
		//Add contact and check to make sure you can't create a new contact with the same ID
		tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street");
		assertEquals(false, tempCS.addContact("1500", "Charles", "Marley", "5555551234", "800 Cool Street"));

		
	}
	@Test
	public void testDeletePass() {
		ContactService tempCS = new ContactService();
		//Create contact to delete and check if delete is successful
		tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street");
		assertEquals(true, tempCS.deleteContact("1500"));
		//Make sure contact is now gone
		assertEquals(false, tempCS.updateContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street"));
	}
	@Test
	public void testDeleteFail() {
		ContactService tempCS = new ContactService();
		//Create contact and try to delete contacts that arn't in the list
		tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street");
		assertEquals(false, tempCS.deleteContact("15001"));
		assertEquals(false, tempCS.deleteContact("1500105050505050"));
	}
	
	@Test
	public void testUpdatePass() {
		ContactService tempCS = new ContactService();
		//Add a contact, update that contact 4 times with different info that falls within guidelines
		tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street");
		assertEquals(true, tempCS.updateContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street"));
		assertEquals(true, tempCS.updateContact("1500", "Bobby", "Smith", "0123456789", "80045 Cool Street"));
		assertEquals(true, tempCS.updateContact("1500", "Nate", "Johnson", "5555551234", "1000 Chill Street"));
		assertEquals(true, tempCS.updateContact("1500", "Charles", "Mley", "5555551234", "900 Coding Street"));
	}
	@Test
	public void testUpdateFail() {
		ContactService tempCS = new ContactService();
		//Add a contact, update with incorrect ID
		tempCS.addContact("1500", "Bob", "Marl", "5555551234", "800 Cool Street");
		assertEquals(false, tempCS.updateContact("123456789101112", "Bob", "Marley", "55", "800 Cool Street"));
		//Try to update with incorrect fields
		assertEquals(false, tempCS.updateContact("1500", "Bobb", "Marley", "5555551234999", "800 Cool Street"));
		assertEquals(false, tempCS.updateContact("1500", "Bob", "Marley", "5555551234", "800 Cool Street On the other side of the road next to a small tree"));

		
	}
	
}
