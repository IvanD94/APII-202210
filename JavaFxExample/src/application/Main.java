package application;
	
import java.io.IOException;

import controller.LoginController;
import controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Users;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Users users;
	
	private Stage currentStage;
	
	@Override
	public void start(Stage primaryStage) {
		
		users = new Users();
		users.addUser("admin", "1234"); //TODO delete
		
		try {
			showLogin();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("Closing");
		super.stop();
	}
	
	public void showLogin() {	
		try {
			BorderPane root;
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Login.fxml"));
			root = (BorderPane)loader.load();
			LoginController controller = loader.getController();
			controller.setMain(this);

			controller.setUsers(users);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			currentStage = stage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showCalculator() {
		try {
			Stage stage = new Stage(); // Ventana
			BorderPane root;
			root = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/gui.fxml"));
			Scene scene = new Scene(root); //Contenido de la ventana
			stage.setScene(scene);
			//currentStage.close();
			stage.show();
			//currentStage = stage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showCalculatorSameStage() {
		try {
			BorderPane root;
			BorderPane calculator = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/gui.fxml"));
			Stage stage = currentStage;
			//currentStage.setFullScreen(true);
			root = (BorderPane)stage.getScene().getRoot();
			root.setCenter(calculator);
			//currentStage.close();
			stage.show();
			//currentStage = stage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showHistorial() {
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/CalculatorRecord.fxml"));
			BorderPane root = loader.load();
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMainView() {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Main.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			MainController controller = loader.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(root); //Contenido de la ventana
			
			Stage stage = new Stage(); // Ventana
			stage.setScene(scene);
			currentStage.close();
			stage.show();
			currentStage = stage;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void logOut() {
		currentStage.close();
		showLogin();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public void showContacts() {
		try {
			BorderPane contacts = (BorderPane)FXMLLoader.load(getClass().getResource("../ui/ContactsView.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(contacts);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
