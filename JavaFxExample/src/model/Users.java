package model;

import java.util.HashMap;
import java.util.Map;

public class Users {
	
	private Map<String, String> users;
	
	public Users() {
		users = new HashMap<String, String>();
	}

	public void validate(String user, String password) throws UserNotFoundException, PasswordNotMatchException {
		if (!users.containsKey(user)) {
			throw new UserNotFoundException();
		}
		if (!users.get(user).equals(password)){
			throw new PasswordNotMatchException();
		}
	}
	
	public boolean addUser(String user, String password) {
		if (!users.containsKey(user)) {
			users.put(user, password);
			return true;
		}
		return false;
	}
	
}
