package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Seccion;

@Remote
public interface SeccionDaoRemote extends GenericDao<Seccion, Long> {

}
