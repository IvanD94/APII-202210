package controller;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contact;

public class ContactsViewController {

	@FXML
	TableView<Contact> contactsTable;
	
	@FXML
	TableColumn<Contact, String> nameColumn;
	
	@FXML
	TableColumn<Contact, String> adressColumn;
	
	@FXML
	TableColumn<Contact, String> phoneColumn;
	
	public void initialize() {
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		adressColumn.setCellValueFactory(new PropertyValueFactory<>("adress"));
		phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));

		ArrayList<Contact> contactsModel = new ArrayList<>();
		contactsModel.add(new Contact("Ivan", "gg", "234243"));
		contactsModel.add(new Contact("sss", "sdgfsdf", "2342"));
		
		ObservableList<Contact> contacts = FXCollections.observableArrayList(contactsModel);
		
		contactsTable.setItems(contacts);
		
	}
	
	@FXML
	public void doSomething() {
		
		Contact contact = contactsTable.getSelectionModel().getSelectedItem();
		System.out.println(contact);
	}
	
}
