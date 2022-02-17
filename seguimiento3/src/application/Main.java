package application;
	
import java.io.IOException;

import controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Stage currentStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Login.fxml"));
			
			BorderPane root = (BorderPane)loader.load();
			
			LoginController controller = loader.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			currentStage = primaryStage;
		} catch(Exception e) {
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
			currentStage.close();
			stage.show();
			currentStage = stage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
