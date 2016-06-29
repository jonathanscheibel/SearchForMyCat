package br.com.searchformycat.exceptions;

public class AnimalInexistenteException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codError;
		
	public AnimalInexistenteException(String message, int codError){
		super(message);
		setCodError(codError);
	}

	public int getCodError() {
		return codError;
	}

	public void setCodError(int codError) {
		this.codError = codError;
	}

}
