package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Operation;

public class Controller2 {
	
	private Operation operation;
	
	@FXML
	Button dig0;
	@FXML
	Button dig1;
	@FXML
	Button dig2;
	@FXML
	Button dig3;
	@FXML
	Button dig4;
	@FXML
	Button dig5;
	@FXML
	Button dig6;
	@FXML
	Button dig7;
	@FXML
	Button dig8;
	@FXML
	Button dig9;
	
	@FXML
	TextArea historyOutput;
	@FXML
	TextField operationInput;
	@FXML
	TextField resultOutput;
	
	@FXML
	Button multiplication;
	@FXML
	Button addition;
	@FXML
	Button substraction;
	@FXML
	Button calculate;
	
	
	@FXML
	public void initialize() {
		operation = new Operation();
		dig0.setOnAction((ActionEvent e) -> {
			addDigit(0);
		});
		dig1.setOnAction((ActionEvent e) -> {
			addDigit(1);
		});
		dig2.setOnAction((ActionEvent e) -> {
			addDigit(2);
		});
		
	}
	
	private void addDigit(int digit) {
		operation.addDigt(digit);
	}

}
