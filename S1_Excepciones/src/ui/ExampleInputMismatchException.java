package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

//import java.io.exception

public class ExampleInputMismatchException {
	
	public static int cociente(int a, int b) throws InputMismatchException {
		return (a / b);
	}

	public static void main(String[] args) {
		
		int a, b;
		Scanner lector = new Scanner(System.in);
		boolean bucle;
		
		do {
			bucle = false;
			try {
				System.out.println("entre el denominador");
				a = lector.nextInt();
				System.out.println("entre el denominador");
				b = lector.nextInt();
				System.out.println(cociente(a, b));
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("Solo se permite digitar números enteros.");
				lector.nextLine();
				bucle = true;
			}
		} while (bucle == true);
		
		lector.close();
	}
	
}