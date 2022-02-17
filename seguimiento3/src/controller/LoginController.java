package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	private Main main;
	
	@FXML
	TextField userField;
	
	@FXML
	PasswordField passwordField;
	
	@FXML
	public void login() {
		main.showCalculator();		
	}
	
	public void setMain(Main main) {
		this.main = main;
	}

}
