package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UsersList {
	
	private List<User> users;
	
	public UsersList() {
		users = new ArrayList<User>();
	}
	
	public void loadUsers() throws IOException {
		File file = new File(".\\files\\users.csv");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader input = new BufferedReader(fr);
		
		input.readLine();
		
		while (input.ready()) {
			
			String line = input.readLine();
			String [] data = line.split(";");
			
			int id = Integer.parseInt(data[0]);
			String user = data[1];
			addUser(id, user);
		}
		
		input.close();
		fr.close();
	}
	
	public void addUser(int id, String user) {
		users.add(new User(id, user));
	}
	
	public List<User> getUsers(){
		return users;
	}

}
