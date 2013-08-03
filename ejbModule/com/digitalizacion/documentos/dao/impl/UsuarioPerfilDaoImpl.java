package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.UsuarioPerfilDao;
import com.digitalizacion.documentos.dao.UsuarioPerfilDaoRemote;
import com.digitalizacion.documentos.entity.UsuarioPerfil;

@Stateless
public class UsuarioPerfilDaoImpl extends GenericDaoImpl<UsuarioPerfil, Long> implements UsuarioPerfilDao,
		UsuarioPerfilDaoRemote {

	public UsuarioPerfilDaoImpl() {
		super(UsuarioPerfil.class);
	}

}
