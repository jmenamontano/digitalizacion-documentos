package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.TipoPersonaDao;
import com.digitalizacion.documentos.dao.TipoPersonaDaoRemote;
import com.digitalizacion.documentos.entity.TipoPersona;

@Stateless
public class TipoPersonaDaoImpl extends GenericDaoImpl<TipoPersona, Long> implements TipoPersonaDao,TipoPersonaDaoRemote {
	
	public TipoPersonaDaoImpl() {
		super(TipoPersona.class);
	}

}
