package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Aplicacion;

@Remote
public interface AplicacionDaoRemote extends GenericDao<Aplicacion, Long> {

}
