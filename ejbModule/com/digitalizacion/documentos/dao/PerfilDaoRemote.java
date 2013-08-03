package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Perfil;

@Remote
public interface PerfilDaoRemote extends GenericDao<Perfil, Long> {

}
