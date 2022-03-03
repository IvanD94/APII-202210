package model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 2L;

	private int id;
	private String user;
	private String mail;
	
	public User(int id, String user) {
		this.setId(id);
		this.setUser(user);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
