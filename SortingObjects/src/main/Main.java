package main;

import model.Contact;
import model.ContactList;

public class Main {
	
	private static ContactList contactList;
	
	public static void main(String[] args) {
		
		contactList = new ContactList();
		fillList();
		printList();
		contactList.sortByAge();
		printList();
		contactList.sortByLastName();
		printList();

		
	}
	
	public static void fillList() {
		contactList.addContact(new Contact("Julian", "Barreto", 23));
		contactList.addContact(new Contact("Daniel", "Valencia", 19));
		contactList.addContact(new Contact("David", "Villegas", 25));
		contactList.addContact(new Contact("David", "Villegas", 20));
		contactList.addContact(new Contact("Carlos", "Villegas", 20));
		contactList.addContact(new Contact("Ivan", "Chacon", 28));
		contactList.addContact(new Contact("Juan", "Medina", 19));
	}
	
	public static void printList() {
		System.out.println("----");
		for (int i = 0; i < contactList.getContacts().size(); i++) {
			System.out.println(contactList.getContacts().get(i));
		}
		System.out.println("----");
	}
	
	public static void compareStrings() {
		String var1 = "abc";
		String var2 = "bcd";
		
		String var5 = "b";
		String var6 = "aaaa";
		
		System.out.println(var5.compareTo(var6));
		
		System.out.println(var1.compareTo(var2));
		
		String var3 = "aaab";
		String var4 = "aaaa";
		
		System.out.println(var3.compareTo(var4));
		
		String var7 = "aa";
		String var8 = "aaaaaab@";
		
		System.out.println(var7.compareTo(var8));
		
		String var9 = "1";
		String var10 = "a";
		
		System.out.println(var9.compareTo(var10));
		
		String var11 = "@";
		String var12 = "a";
		
		System.out.println(var11.compareTo(var12));
		
		String var13 = "A";
		String var14 = "a";
		
		System.out.println(var13.compareTo(var14));
		
		String var15 = "AbC";
		String var16 = "aBb";
		
		System.out.println(var15.compareToIgnoreCase(var16));
		
	}

}
