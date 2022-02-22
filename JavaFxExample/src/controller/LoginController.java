package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.PasswordNotMatchException;
import model.UserNotFoundException;
import model.Users;

public class LoginController {
	
	private Main main;
	
	private Users users;
	
	@FXML
	TextField userField;
	
	@FXML
	PasswordField passwordField;
	
	@FXML
	public void login() {
		// Traer los datos de los campos
		String user = userField.getText();
		String password = passwordField.getText();
	
		try {
			users.validate(user, password); //Lanza
			main.showMainView();		
		} catch (UserNotFoundException | PasswordNotMatchException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Usuario no autorizado");
			if (e instanceof UserNotFoundException) {
				alert.setContentText("Debe ingresar un usuario valido");				
			}else {
				alert.setContentText("La contraseña es incorrecta");				
			}

			alert.showAndWait();
		}
				
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void setUsers(Users users) {
		this.users = users;
	}

}
