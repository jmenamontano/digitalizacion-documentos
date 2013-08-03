package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Ubicacion;

@Remote
public interface UbicacionDaoRemote extends GenericDao<Ubicacion, Long> {

}
