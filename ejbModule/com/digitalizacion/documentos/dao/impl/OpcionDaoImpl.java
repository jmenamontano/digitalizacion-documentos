package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.OpcionDao;
import com.digitalizacion.documentos.dao.OpcionDaoRemote;
import com.digitalizacion.documentos.entity.Opcion;

@Stateless
public class OpcionDaoImpl extends GenericDaoImpl<Opcion, Long> implements OpcionDao, OpcionDaoRemote {

	public OpcionDaoImpl() {
		super(Opcion.class);
	}

}
