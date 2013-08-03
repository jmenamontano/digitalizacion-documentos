package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.EspecialidadDao;
import com.digitalizacion.documentos.dao.EspecialidadDaoRemote;
import com.digitalizacion.documentos.entity.Especialidad;

@Stateless
public class EspecialidadDaoImpl extends GenericDaoImpl<Especialidad, Long> implements EspecialidadDao,
		EspecialidadDaoRemote {

	public EspecialidadDaoImpl() {
		super(Especialidad.class);
	}

}
