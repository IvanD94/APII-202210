package model;

public class ListaLlenaException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int valor;
	
	public ListaLlenaException(int valor) {
		this.valor = valor;
	}
	
	public ListaLlenaException(int valor, Throwable cause) {
		super(cause);
		this.valor = valor;
	}
	
	@Override
	public String getMessage() {
		return "No se pudo agregar el valor: " + valor;
	}

}
