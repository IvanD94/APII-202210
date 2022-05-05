package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import model.LoadFx;
import model.UsersList;

public class SampleController implements Initializable{
	
	@FXML
	Label label1;
	
	@FXML
	TextArea textArea1;
	
	@FXML
	Button loadBtn;
	
	private int value;
	
	public UsersList ul;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		label1.setText("Valor: " + value);
		ul = new UsersList();
	}
	
	@FXML
	public void add() {
		value++;
		label1.setText("Valor: " + value);	
	}

	@FXML
	public void substract() {
		value--;
		label1.setText("Valor: " + value);
	}
	
	@FXML
	public void load() {
		LoadFx thread = new LoadFx(this);
		loadBtn.setDisable(true);
		thread.start();
	}
	
	public void loadEnded() {
		loadBtn.setDisable(false);
		String text = "";
		for (int i = 0; i < ul.getUsers().size(); i++) {
			text += ul.getUsers().get(i).getUser() + "\n";
		}
		textArea1.setText(text);
	}
}
