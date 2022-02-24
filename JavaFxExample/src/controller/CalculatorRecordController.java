package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CalculatorRecordController {

	@FXML
	ListView<String> lista;
	
	@FXML
	TextField textField;
	
	ObservableList<String> oLista;
	
	@FXML
	public void initialize() {
		oLista = FXCollections.observableArrayList();
		oLista.add("123");
		oLista.add("45345");
		oLista.add("dfsfd");
		
		lista.setItems(oLista);
	}
	
	@FXML
	public void addItem() {
		String newText = textField.getText();
		textField.setText("");
		oLista.add(newText);
	}
}
