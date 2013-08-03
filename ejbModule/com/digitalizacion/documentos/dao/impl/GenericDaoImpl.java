package com.digitalizacion.documentos.dao.impl;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;

import com.digitalizacion.documentos.dao.GenericDao;
import com.digitalizacion.documentos.exception.EntidadNoExisteException;
import com.digitalizacion.documentos.util.NamedQueryParameter;
import com.digitalizacion.documentos.util.QueryParameter.TemporalType;

/**
 * Implementacion para DAO Generico utilizando Generics de Java 5.0.
 * 
 * @author Juanma
 * 
 * @param <T>
 * @param <PK>
 */
public abstract class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

	@PersistenceContext(unitName = "digitalizacion-documentos")
	private EntityManager entityManager;
	private final Class<T> type;

	/**
	 * Constructor
	 * 
	 * @param type
	 *            la clase de la entidad a utilizar
	 */
	public GenericDaoImpl(Class<T> type) {
		this.type = type;
	}

	
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName) {
		try {
			Query q = entityManager.createNamedQuery(queryName);
			List<T> result = q.getResultList();
			return result;
		} catch (Exception e) {
			System.out.println("error");
			return null;
		}
	}

	public List<T> findByNamedQueryNamedParameter(String queryName, String name, Object value) {
		return findByNamedQueryNamedParameter(queryName, new NamedQueryParameter(name, value));
	}

	@SuppressWarnings("unchecked")
	public List<T> findByNamedQueryNamedParameter(String queryName, NamedQueryParameter... args) {
		final Query q = getAndCreateQueryNamedParameters(queryName, args);

		final List<T> result = q.getResultList();
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ec.gov.sri.controltributario.dao.GenericDAO#guardar(java.lang.Object)
	 */
	public T guardaroActualizar(T o) throws IllegalStateException, IllegalArgumentException,
			TransactionRequiredException {
		try {
			return entityManager.merge(o);
		} catch (IllegalStateException e) {
			throw new IllegalStateException(e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e);
		} catch (TransactionRequiredException e) {
			throw new TransactionRequiredException();
		}
	}

	public void guardar(T o) throws EntityExistsException, IllegalStateException, IllegalStateException,
			TransactionRequiredException {
		try {
			entityManager.persist(o);
		} catch (EntityExistsException e) {
			throw new EntityExistsException(e);
		} catch (IllegalStateException e) {
			throw new IllegalStateException(e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e);
		} catch (TransactionRequiredException e) {
			throw new TransactionRequiredException();
		}
	}

	public void flush() {
		entityManager.flush();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.gov.sri.controltributario.dao.GenericDAO#buscarPorCodigo(java.io.
	 * Serializable)
	 */
	public T buscarPorCodigo(PK id) throws EntidadNoExisteException {
		try {
			T o = (T) entityManager.find(type, id);
			if (o == null) {
				throw new EntidadNoExisteException("No existe ".concat(type.getSimpleName()).concat(
						" con codigo: " + id));
			}
			return o;
		} catch (IllegalStateException e) {
			throw new EntidadNoExisteException(e);
		} catch (IllegalArgumentException e) {
			throw new EntidadNoExisteException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ec.gov.sri.controltributario.dao.GenericDAO#eliminar(java.lang.Object)
	 */
	public void eliminar(T entidad) throws IllegalStateException, IllegalArgumentException,
			TransactionRequiredException {
		try {
			T entidadEliminar = entityManager.merge(entidad);
			entityManager.remove(entidadEliminar);
		} catch (IllegalStateException e) {
			throw new IllegalStateException(e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e);
		} catch (TransactionRequiredException e) {
			throw new TransactionRequiredException();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ec.gov.sri.controltributario.dao.GenericDAO#obtenerTodos(java.lang.Integer
	 * , java.lang.Integer, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<T> obtenerTodos(String propiedadOrden, Integer primerResultado, Integer resultadosMaximos)
			throws IllegalStateException, IllegalArgumentException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT o FROM ");
		sql.append(type.getSimpleName());
		sql.append(" o");

		if (propiedadOrden != null) {
			sql.append(" ORDER BY o.");
			sql.append(propiedadOrden);
		}

		Query q = null;
		try {
			q = entityManager.createQuery(sql.toString());
		} catch (IllegalStateException e) {
			throw new IllegalStateException(e);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e);
		}

		if (primerResultado != null) {
			q.setFirstResult(primerResultado);
		}
		if (resultadosMaximos != null) {
			q.setMaxResults(resultadosMaximos);
		}
		return q.getResultList();
	}

	/**
	 * METODOS INTERNOS UTILIZADOS PARA POBLAR LOS QUERYS DINAMICAMENTE
	 */
	private Query getAndCreateQueryNamedParameters(String queryName, NamedQueryParameter... args) {
		try {
			final Query q = entityManager.createNamedQuery(queryName);
			populateQueryNamedParameter(q, args);
			return q;
		} catch (Exception e) {
			return null;
		}

	}

	private void populateQueryNamedParameter(Query q, NamedQueryParameter... args) {
		if (args != null) {

			for (NamedQueryParameter qp : args) {

				if (qp.getType() == null || qp.getType() == TemporalType.NONE) {
					q.setParameter(qp.getParameterName(), qp.getValue());
				} else {
					switch (qp.getType()) {
					case DATE:
						if (qp.getValue() instanceof Date) {
							q.setParameter(qp.getParameterName(), (Date) qp.getValue(),
									javax.persistence.TemporalType.DATE);
						} else if (qp.getValue() instanceof Calendar) {
							q.setParameter(qp.getParameterName(), (Calendar) qp.getValue(),
									javax.persistence.TemporalType.DATE);
						} else {
							q.setParameter(qp.getParameterName(), qp.getValue());
						}
						break;
					case TIME:
						if (qp.getValue() instanceof Date) {
							q.setParameter(qp.getParameterName(), (Date) qp.getValue(),
									javax.persistence.TemporalType.TIME);
						} else if (qp.getValue() instanceof Calendar) {
							q.setParameter(qp.getParameterName(), (Calendar) qp.getValue(),
									javax.persistence.TemporalType.TIME);
						} else {
							q.setParameter(qp.getParameterName(), qp.getValue());
						}
						break;
					case TIMESTAMP:
						if (qp.getValue() instanceof Date) {
							q.setParameter(qp.getParameterName(), (Date) qp.getValue(),
									javax.persistence.TemporalType.TIMESTAMP);
						} else if (qp.getValue() instanceof Calendar) {
							q.setParameter(qp.getParameterName(), (Calendar) qp.getValue(),
									javax.persistence.TemporalType.TIMESTAMP);
						} else {
							q.setParameter(qp.getParameterName(), qp.getValue());
						}
						break;
					}
				}
			}
		}
	}

}
