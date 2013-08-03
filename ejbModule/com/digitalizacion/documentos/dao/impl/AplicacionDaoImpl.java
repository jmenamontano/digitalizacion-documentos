package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.AplicacionDao;
import com.digitalizacion.documentos.dao.AplicacionDaoRemote;
import com.digitalizacion.documentos.entity.Aplicacion;

@Stateless
public class AplicacionDaoImpl extends GenericDaoImpl<Aplicacion, Long> implements AplicacionDao,AplicacionDaoRemote {
	
	public AplicacionDaoImpl() {
		super(Aplicacion.class);
	}

}
