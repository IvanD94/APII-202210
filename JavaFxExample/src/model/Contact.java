package model;

public class Contact {
	
	private String name;
	private String adress;
	private String phone;
	
	
	public Contact(String name, String adress, String phone) {
		this.setName(name);
		this.setAdress(adress);
		this.setPhone(phone);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		
		return name + " " + adress + " " + phone;
	}
	
}
