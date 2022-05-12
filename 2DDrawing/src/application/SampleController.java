package application;

import java.net.URL;
import java.util.ResourceBundle;

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

public class SampleController implements Initializable{
	
	@FXML
	Canvas canvas1;
	
	@FXML
	Label label1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		canvas1.setFocusTraversable(true);
		
		GraphicsContext gc = canvas1.getGraphicsContext2D();
		
		gc.setFill(Color.AZURE);
		gc.setStroke(Color.AQUAMARINE);
		gc.setLineWidth(5);
		gc.fillRect(0, 0, 500, 500);
		
		gc.strokeRect(20, 20, 200, 300);
		gc.strokeOval(50,20,250,200);
		
		gc.setFill(Color.BLACK);
		gc.fillArc(50, 0, 50, 400, 0, 180, ArcType.OPEN);
		
	}
	
	
	@FXML
	public void keyPressed(KeyEvent e) {
		if(e.getCode() == KeyCode.LEFT) {
			System.out.println("L");
		}else if(e.getCode() == KeyCode.RIGHT) {
			System.out.println("R");
		}
	}
	
	
	
}
