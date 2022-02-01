package ui;

import model.ExceptionsExamples;

public class Main {
	
	private static ExceptionsExamples examples = new ExceptionsExamples();
	
	public static void main(String[] args)  {
		System.out.println("---\nJerarquía de excepciones\n---\n");
		examples.exceptionHierarchy("Array", 10);
		System.out.println("\n");
		examples.exceptionHierarchy("String", 10);
		System.out.println("\n---\n");
		
		
		System.out.println("---\nBloque finally\n---");
		System.out.println("\nCuando no se genera un error:");
		examples.fullTrySentence(3);
		System.out.println("\nCuando se genera un error:");
		examples.fullTrySentence(10);
		System.out.println("\n---\n");
		
		
		System.out.println("---\nExcepciones Anidadas\n---");
		examples.nestedException();
		System.out.println("\n---\n");
		
		
		System.out.println("---\nManejo del objeto Exception\n---");
		examples.exceptionObject();;
		System.out.println("\n---\n");
		
		System.out.println("Termino");
	}
}
