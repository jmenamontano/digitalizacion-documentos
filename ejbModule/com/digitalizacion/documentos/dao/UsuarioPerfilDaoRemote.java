package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.UsuarioPerfil;

@Remote
public interface UsuarioPerfilDaoRemote extends GenericDao<UsuarioPerfil, Long> {

}
