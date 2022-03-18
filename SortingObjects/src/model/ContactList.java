package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	//Bubble modificado para usar un comparador personalizado
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
	
	//Bubble modificado para usar un comparador personalizado
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
	
	
	public void sortCollectionsNaturalOrder() {
		// Orderna de acuerdo al orden natural, definido en el compareTo de la clase
		// sort siempre ordena de menor a mayor
		Collections.sort(contacts);
	}

	public void sortByAgeAsc() {
		Collections.sort(contacts, 
				//Clase anonima comparator
				new Comparator<Contact>() {
					//Criterio personalizado
					@Override
					public int compare(Contact o1, Contact o2) {
						return o1.getAge() - o2.getAge();
					}
		});
	}
	
	public void sortCollectionsComparatorByNameAsc() {
		Collections.sort(contacts, 
				//Otra clase anonima
				new Comparator<Contact>() {
					//Otro criterio personalizado
					@Override
					public int compare(Contact o1, Contact o2) {
						return o1.getName().compareTo(o2.getName());
					}
		
		});
	}
	
	public void sortCollectionsComparatorByLastNameDes() {
		Collections.sort(contacts, new Comparator<Contact>() {
			// Para ordernar descendente, se debe implementar la comparacion para "confundir" al sort
			@Override
			public int compare(Contact o1, Contact o2) {
				return o2.getLastName().compareTo(o1.getLastName());
				//return -1 * o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
	}
	
	public void sortComparatorClass() {
		//Order con clase no anonima comparator
		Collections.sort(contacts, new ContacComparator());		
	}
	
}
