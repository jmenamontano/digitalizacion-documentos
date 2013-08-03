package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Usuario;

@Local
public interface UsuarioDao extends GenericDao<Usuario, Long> {

}
