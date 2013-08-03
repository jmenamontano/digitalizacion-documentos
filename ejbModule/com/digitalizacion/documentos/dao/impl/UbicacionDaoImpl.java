package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.UbicacionDao;
import com.digitalizacion.documentos.dao.UbicacionDaoRemote;
import com.digitalizacion.documentos.entity.Ubicacion;

@Stateless
public class UbicacionDaoImpl extends GenericDaoImpl<Ubicacion, Long> implements UbicacionDao,UbicacionDaoRemote {
	
	public UbicacionDaoImpl() {
		super(Ubicacion.class);
	}

}
