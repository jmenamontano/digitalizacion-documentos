package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.PerfilDao;
import com.digitalizacion.documentos.dao.PerfilDaoRemote;
import com.digitalizacion.documentos.entity.Perfil;

@Stateless
public class PerfilDaoImpl extends GenericDaoImpl<Perfil, Long> implements PerfilDao, PerfilDaoRemote {

	public PerfilDaoImpl() {
		super(Perfil.class);
	}

}
