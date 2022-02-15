package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class controller {
	public controller() {
		
	}
	
	@FXML
	private TextArea historyOutput;
	
	@FXML
	private Button calculateButton;
	
	@FXML
	private TextField operationInput;
	
	@FXML
	private Button dig0;
	
	@FXML
	private Button dig1;
	
	@FXML
	private Button dig2;
	
	@FXML
	private Button dig3;
	
	@FXML
	private Button dig4;
	
	@FXML
	private Button dig5;
	
	@FXML
	private Button dig6;
	
	@FXML
	private Button dig7;
	
	@FXML
	private Button dig8;
	
	@FXML
	private Button dig9;
	
	@FXML
	private TextField resultOutput;
	
	@FXML
	private void digit0(){
		operationInput.setText(operationInput.getText()+ "0");
	}
	
	@FXML
	private void digit1(){
		operationInput.setText(operationInput.getText()+ "1");
	}
	
	@FXML
	private void digit2(){
		operationInput.setText(operationInput.getText()+ "2");
	}
	
	@FXML
	private void digit3(){
		operationInput.setText(operationInput.getText()+ "3");
	}

	@FXML
	private void digit4(){
		operationInput.setText(operationInput.getText()+ "4");
	}
	
	@FXML
	private void digit5(){
		operationInput.setText(operationInput.getText()+ "5");
	}
	
	@FXML
	private void digit6(){
		operationInput.setText(operationInput.getText()+ "6");
	}
	
	@FXML
	private void digit7(){
		operationInput.setText(operationInput.getText()+ "7");
	}
	
	@FXML
	private void digit8(){
		operationInput.setText(operationInput.getText()+ "8");
	}
	
	@FXML
	private void digit9(){
		operationInput.setText(operationInput.getText()+ "9");
	}
	
	@FXML
	private void addition() {
		operationInput.setText(operationInput.getText()+ "+");
	}
	
	@FXML
	private void substraction() {
		operationInput.setText(operationInput.getText()+ "-");
	}
	
	@FXML
	private void multiplication() {
		operationInput.setText(operationInput.getText()+ "*");
	}
	
	@FXML
	private void calculate() {
		char[] operation = operationInput.getText().toCharArray();
		int numOperations = 0;
		int operatorIndex = -1;
		
		for (int i=0; i<operation.length; i++) {
			if (operation[i] == '+' || operation[i] == '*' || operation[i] == '-') {
				operatorIndex = i;
				numOperations++;
			}
		}
		
		if (numOperations>1) {
			resultOutput.setText("SYNTAX ERROR");
		} else {
			String number = "";
			for (int i=0; i<operatorIndex; i++) {
				number += operation[i];
			}
			int num1 = Integer.parseInt(number);
			
			number = "";
			for (int i=operatorIndex+1; i<operation.length; i++) {
				number += operation[i];
			}
			
			int num2 = Integer.parseInt(number);
			
			int result = 0;
			if (operation[operatorIndex] == '+') {
				result = num1+num2;
			} else if (operation[operatorIndex] == '-') {
				result = num1-num2;
			} else {
				result = num1*num2;
			}
			
			resultOutput.setText("" + result);
			historyOutput.setText(historyOutput.getText() + operationInput.getText() + " = " + result + "\n");
			operationInput.setText("");
		}
	}
}
