package model;

public class Contact {

	private String name;
	private String lastName;
	private int age;
	
	public Contact(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int compareByAge(Contact other) {
		int result = 0;
		if (this.age < other.getAge()) {
			result = -1;
		}else if (this.age > other.getAge()) {
			result = 1;
		}
		return result;
		
		// return this.age - other.getAge();
	}
	
	public int compareByLastName(Contact other) {
		int result = 0;
		result = this.lastName.compareTo(other.lastName);
		
		if (result == 0) {
			result = this.name.compareTo(other.name);
		}
		
		if (result == 0) {
			result = this.age - other.getAge();
		}
		return result;
	}
	
	
	@Override
	public String toString() {
		return name + " " + lastName + " " + age;
	}
	
}
