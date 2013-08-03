package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.ModalidadDao;
import com.digitalizacion.documentos.dao.ModalidadDaoRemote;
import com.digitalizacion.documentos.entity.Modalidad;

@Stateless
public class ModalidadDaoImpl extends GenericDaoImpl<Modalidad, Long> implements ModalidadDao, ModalidadDaoRemote {

	public ModalidadDaoImpl() {
		super(Modalidad.class);
	}

}
