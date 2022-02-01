package model;

public class ExceptionsExamples {
	
	public void exceptionHierarchy(String tipo, int idx) {
		int vals [] = new int[10];
		String word = "12345";
		
		try {			
			if (tipo.equals("Array")) {
				int val = vals[idx];
			} else if(tipo.equals("String")) {
				char c = word.charAt(idx);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La excepci�n del tipo ArrayIndexOfOutBoundsException es capturado en el catch correspondiente");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("La excepci�n del tipo StringIndexOutOfBoundsException es capturada por el catch de IndexOutOfBoundsException ya que hereda de ella");
		}
		
	}
	
	public void exceptionObject() {
		int vals [] = new int[10];
		try {
			int val = vals[10];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\tEl mensaje de la excepci�n es: " + e.getMessage() + "\n");
			System.out.println("\tEl stack de llamadas es:");
			StackTraceElement [] stack = e.getStackTrace();
			for (StackTraceElement stackElement : stack) {
				System.out.println("\t\t" + stackElement.getClassName() + "." + stackElement.getMethodName() + "(" + stackElement.getFileName() + ":" + stackElement.getLineNumber() + ")");
			}
		}
		
		
	}
	
	public void fullTrySentence(int idx) {
		int vals [] = new int[10];
		
		try {
			System.out.println("\tC�digo dentro del bloque try antes del error");
			int val = vals[idx];
			System.out.println("\tC�digo dentro del bloque try despu�s del error");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\tBloque catch");			
		} finally {
			System.out.println("\tBloque finally");
		}
		
	}
	
	public void nestedException() {
		Lista lista = new Lista();
		try {
			
			for (int i = 0; i < 11; i++) {
					lista.addElement(i);
			}
		
		} catch (ListaLlenaException e) {
			System.out.println("Observar como aparece inicialmente la excepci�n personalizada creada y posteriormente la excepci�n base que la genero\n");
			e.printStackTrace(); // Este m�todo sirve para imprimer la pila de llamadas de la excepci�n
		}
	}

}
