package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Usuario;

@Remote
public interface UsuarioDaoRemote extends GenericDao<Usuario, Long> {

}
