package model;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
	
	private List<Contact> contacts;
	
	public ContactList() {
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact) {
		contacts.add(contact);
	}
	
	public List<Contact> getContacts(){
		return contacts;
	}
	
	public void sortByAge() {
		int n = contacts.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if (contacts.get(j).compareByAge(contacts.get(j-1)) > 0) {
	    			Contact temp = contacts.get(j);
	    			contacts.set(j, contacts.get(j-1));
	    	        contacts.set(j-1, temp);
	    			inversion = true;
	    		}
	    	}
	    }
	}
	
	public void sortByLastName() {
		int n = contacts.size();
		boolean inversion = true;
		
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n - i; j++) {
	    		if (contacts.get(j).compareByLastName(contacts.get(j-1)) < 0) {
	    			Contact temp = contacts.get(j);
	    			contacts.set(j, contacts.get(j-1));
	    	        contacts.set(j-1, temp);
	    			inversion = true;
	    		}
	    	}
	    }
	}
	
}
