package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.OpcionesPerfilDao;
import com.digitalizacion.documentos.dao.OpcionesPerfilDaoRemote;
import com.digitalizacion.documentos.entity.OpcionesPerfil;

@Stateless
public class OpcionesPerfilDaoImpl extends GenericDaoImpl<OpcionesPerfil, Long> implements OpcionesPerfilDao,
		OpcionesPerfilDaoRemote {

	public OpcionesPerfilDaoImpl() {
		super(OpcionesPerfil.class);
	}

}
