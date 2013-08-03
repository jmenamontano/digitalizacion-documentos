package com.digitalizacion.documentos.util;

/**
 * Clase utilitaria para implementacion de GenericDao
 * 
 * @author Juanma
 * 
 */
public class QueryParameter {

	public static enum TemporalType {
		NONE, DATE, TIME, TIMESTAMP
	};

	private final Object value; // this class should be a generic type

	private final TemporalType type; // optional

	public QueryParameter(final Object value, final TemporalType type) {
		super();

		this.value = value;
		this.type = type;

	}

	public QueryParameter(final Object value) {
		super();

		this.value = value;
		this.type = TemporalType.NONE;
	}

	public TemporalType getType() {
		return type;
	}

	public Object getValue() {
		return value;
	}
}
