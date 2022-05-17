package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Board;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Board board;
	
	@Override
	public void start(Stage primaryStage) {
		setBoard(new Board());
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane root = (BorderPane)loader.load();
			
			SampleController controller = loader.getController();
			controller.setMain(this);
			controller.paint();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			controller.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
