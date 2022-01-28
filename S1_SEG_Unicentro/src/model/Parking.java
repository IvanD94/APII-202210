package model;

import java.util.Calendar;
import java.util.Date;

import exception.DocumentException;

public class Parking {
	
	public final static int MAX_CARS = 100;
	public final static int MAX_MOTOS = 200;
	
	private Vehicle[] carsList;
	private Vehicle[] motosList;
	
	public Parking () {
		carsList = new Vehicle[MAX_CARS];
		motosList = new Vehicle[MAX_MOTOS];
	}
	
	public String addVehicle(String type, String plate, int document) throws DocumentException{
		String message = "";
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		boolean valid = true;
		valid = valid && validateDocument(document, dayOfWeek);
		// TODO Incluir otras validaciones
		// TODO Agregar vehiculo
		return message;
	}
	
	public boolean validateDocument(int document, int dayOfWeek) throws DocumentException {
		int lastDigit = document % 10;
		if (	((lastDigit == 0 || lastDigit == 1) && dayOfWeek == 2)
			||  ((lastDigit == 2 || lastDigit == 3) && dayOfWeek == 3)
			||  ((lastDigit == 4 || lastDigit == 5) && dayOfWeek == 4)
			||  ((lastDigit == 6 || lastDigit == 7) && dayOfWeek == 5)
			||  ((lastDigit == 8 || lastDigit == 9) && dayOfWeek == 6)
		){
			throw new DocumentException();
		}
		return true;
	}

}
