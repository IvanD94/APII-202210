package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import model.Circle;

public class SampleController implements Initializable {

	@FXML
	Canvas canvas1;

	@FXML
	Label label1;

	private Main main;

	private GraphicsContext gc;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		canvas1.setFocusTraversable(true);
		gc = canvas1.getGraphicsContext2D();
	}

	@FXML
	public void keyPressed(KeyEvent e) {
		if (e.getCode() == KeyCode.LEFT) {
			System.out.println("L");
		} else if (e.getCode() == KeyCode.RIGHT) {
			System.out.println("R");
		}
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public void paint() {		
		Platform.runLater(()->{
			gc.setFill(Color.AZURE);
			gc.fillRect(0, 0, 500, 500);
			
			gc.setFill(Color.GREEN);
			Circle c = main.getBoard().getCircle();
			gc.fillOval(c.getX() - c.getR(), c.getY() - c.getR(), c.getR() * 2, c.getR() * 2);
		});
	}

	public void start() {
		Thread hilo = new Thread(() -> {
			while (true) {
				try {

					Thread.sleep(1000/50);
					main.getBoard().update();
					paint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		hilo.start();
	}

}
