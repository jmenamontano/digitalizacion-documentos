package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.MatriculaDao;
import com.digitalizacion.documentos.dao.MatriculaDaoRemote;
import com.digitalizacion.documentos.entity.Matricula;

@Stateless
public class MatriculaDaoImpl extends GenericDaoImpl<Matricula, Long> implements MatriculaDao, MatriculaDaoRemote {

	public MatriculaDaoImpl() {
		super(Matricula.class);
	}

}
