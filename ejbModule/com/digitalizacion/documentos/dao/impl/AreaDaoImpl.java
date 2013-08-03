package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.AreaDao;
import com.digitalizacion.documentos.dao.AreaDaoRemote;
import com.digitalizacion.documentos.entity.Area;

@Stateless
public class AreaDaoImpl extends GenericDaoImpl<Area, Long> implements AreaDao,AreaDaoRemote {
	
	public AreaDaoImpl() {
		super(Area.class);
	}

}
