package model;

public class Board {
	
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	
	private Circle circle;
	
	public Board() {
		setCircle(new Circle (250, 250, 25));
		
		circle.setDeltaX(2);
		circle.setDeltaY(1);
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void update() {
		
		if (circle.getDeltaX() > 0 && circle.getX() + circle.getDeltaX() + circle.getR() > WIDTH) {
			circle.setDeltaX(-1*circle.getDeltaX());
		}
		
		if (circle.getDeltaX() < 0 && circle.getX() + circle.getDeltaX() - circle.getR() < 0) {
			circle.setDeltaX(-1*circle.getDeltaX());
		}
		
		if (circle.getDeltaY() > 0 && circle.getY() + circle.getDeltaY() + circle.getR() > HEIGHT) {
			circle.setDeltaY(-1*circle.getDeltaY());
		}
		
		if (circle.getDeltaY() < 0 && circle.getY() + circle.getDeltaY() - circle.getR() < 0) {
			circle.setDeltaY(-1*circle.getDeltaY());
		}
		
		circle.move();
	}
	
}
