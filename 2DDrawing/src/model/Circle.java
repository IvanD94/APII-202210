package model;

public class Circle {

	private int x;
	private int y;
	private int r;
	
	private int deltaX;
	private int deltaY;
	
	public Circle(int x, int y, int r) {
		this.setX(x);
		this.setY(y);
		this.setR(r);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getDeltaX() {
		return deltaX;
	}
	
	public void setDeltaX(int deltaX) {
		this.deltaX = deltaX;
	}
	
	public int getDeltaY() {
		return deltaY;
	}
	
	public void setDeltaY(int deltaY) {
		this.deltaY = deltaY;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void move() {
		x += deltaX;
		y += deltaY;
	}
	
}
