package controller;

import application.Main;
import javafx.fxml.FXML;

public class MainController {
	
	private Main main;

	@FXML
	public void close() {
		main.logOut();
	}
	
	@FXML
	public void openCalculator() {
		main.showCalculator();
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
}
