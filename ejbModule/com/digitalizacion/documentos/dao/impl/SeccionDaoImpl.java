package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.SeccionDao;
import com.digitalizacion.documentos.dao.SeccionDaoRemote;
import com.digitalizacion.documentos.entity.Seccion;

@Stateless
public class SeccionDaoImpl extends GenericDaoImpl<Seccion, Long> implements SeccionDao, SeccionDaoRemote {

	public SeccionDaoImpl() {
		super(Seccion.class);
	}

}
