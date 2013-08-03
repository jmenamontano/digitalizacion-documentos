package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Opcion;

@Remote
public interface OpcionDaoRemote extends GenericDao<Opcion, Long> {

}
