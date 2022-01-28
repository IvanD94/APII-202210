package ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;

import exception.DocumentException;
import model.Parking;

public class Main {
	
	private static Parking parking = new Parking();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			System.out.println("...\n(1) Agregar nuevo vehiculo.\n(2) Salir.");
			int option = scan.nextInt();
			if (option == 1) {
				System.out.print("Ingresar documento: ");
				int document = scan.nextInt();
				// TODO leer los otros parametros
				try {
					parking.addVehicle("", "", document);
				} catch (DocumentException e) {
					System.out.println("El documento " + document + " no puede ingresar.");
				} // TODO Agregar manejo de las otras excepciones
				
			}else if (option == 2) {
				running = false;
			}
		}
		
	}

}
