package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.NivelDao;
import com.digitalizacion.documentos.dao.NivelDaoRemote;
import com.digitalizacion.documentos.entity.Nivel;

@Stateless
public class NivelDaoImpl extends GenericDaoImpl<Nivel, Long> implements NivelDao, NivelDaoRemote {

	public NivelDaoImpl() {
		super(Nivel.class);
	}

}
