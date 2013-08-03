package com.digitalizacion.documentos.exception;

/**
 * Excepcion utilizada para cuando un Query no devuelve resultados.
 * 
 * @author Juanma
 * 
 */

public class EntidadNoExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8124634084060872366L;

	/**
	 * 
	 */
	public EntidadNoExisteException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EntidadNoExisteException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public EntidadNoExisteException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public EntidadNoExisteException(Throwable cause) {
		super(cause);
	}

}
