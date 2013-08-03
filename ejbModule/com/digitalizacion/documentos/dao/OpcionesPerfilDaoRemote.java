package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.OpcionesPerfil;

@Remote
public interface OpcionesPerfilDaoRemote extends GenericDao<OpcionesPerfil, Long> {

}
