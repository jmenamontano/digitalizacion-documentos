package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.UsuarioDao;
import com.digitalizacion.documentos.dao.UsuarioDaoRemote;
import com.digitalizacion.documentos.entity.Usuario;

@Stateless
public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Long> implements UsuarioDao, UsuarioDaoRemote {

	public UsuarioDaoImpl() {
		super(Usuario.class);
	}

}
