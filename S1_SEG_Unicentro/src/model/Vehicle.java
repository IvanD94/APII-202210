package model;

public class Vehicle {

	private int document;
	private String plate;
	private String type;
	
	/**
	 * 
	 * @param document
	 * @param plate
	 * @param type
	 */
	public Vehicle(int document, String plate, String type) {
		this.setDocument(document);
		this.setPlate(plate);
		this.setType(type);
	}

	public int getDocument() {
		return document;
	}

	public void setDocument(int document) {
		this.document = document;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// TODO Gets and sets
	
}
