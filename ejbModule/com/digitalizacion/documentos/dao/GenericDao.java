package com.digitalizacion.documentos.dao;

import java.io.Serializable;
import java.util.List;

import com.digitalizacion.documentos.exception.EntidadNoExisteException;
import com.digitalizacion.documentos.util.NamedQueryParameter;

/**
 * Interface para DAO Generico utilizando Generics de Java 5.0.
 * 
 * @author Juanma
 * 
 * @param <T>
 * @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {

	/**
	 * Finder Genérico.
	 * @param queryName
	 * @return
	 */
	public List<T> findByNamedQuery(String queryName);

	/**
	 * Finder que recibe un solo parámetro.
	 * @param queryName
	 * @param name
	 * @param value
	 * @return
	 */
	public List<T> findByNamedQueryNamedParameter(String queryName, String name, Object value);

	/**
	 * Finder que recibe una lista de parámetros.
	 * @param queryName
	 * @param args
	 * @return
	 */
	public List<T> findByNamedQueryNamedParameter(String queryName, NamedQueryParameter... args);

	/**
	 * Genérico para persistir la entidad.
	 * @param o
	 */
	public void guardar(T o);

	/**
	 * Genérico para buscar de acuerdo a la clave principal.
	 * @param codigo
	 * @return
	 * @throws EntidadNoExisteException
	 */
	public T buscarPorCodigo(PK codigo) throws EntidadNoExisteException;

	/**
	 * Genérico utilizado para la eliminación de datos de la entidad.
	 * @param o
	 */
	public void eliminar(T o);

	/**
	 * Finder utilizado par obtener los registros ordenados.
	 * @param propiedadOrden
	 * @param primerResultado
	 * @param resultadosMaximos
	 * @return
	 */
	public List<T> obtenerTodos(String propiedadOrden, Integer primerResultado, Integer resultadosMaximos);

}
