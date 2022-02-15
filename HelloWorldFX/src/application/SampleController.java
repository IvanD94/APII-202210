package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML
	Label label1;
	
	@FXML
	TextField textField1;
	
	@FXML
	public void doSomething() {
		label1.setText(textField1.getText());
		textField1.setText("");
	}
	
	
	@FXML
	public void initialize() {
		
	}
	
	
	
}
