package com.digitalizacion.documentos.util;

import org.apache.log4j.Logger;

/**
 * Clase utilitaria para implemenmtacion de GenericDao
 * 
 * @author Juanma
 * 
 */
public class NamedQueryParameter extends QueryParameter {

	private static final Logger log = Logger.getLogger(NamedQueryParameter.class);

	private final String parameterName;

	public NamedQueryParameter(String parameterName, Object value, TemporalType type) {
		super(value, type);
		log.info("Parametro: " + parameterName + "=" + value);
		this.parameterName = parameterName;
	}

	public NamedQueryParameter(String parameterName, Object value) {
		super(value);
		log.info("Parametro: " + parameterName + "=" + value);
		this.parameterName = parameterName;
	}

	public String getParameterName() {
		return parameterName;
	}

}