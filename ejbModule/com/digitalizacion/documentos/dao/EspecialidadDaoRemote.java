package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Especialidad;

@Remote
public interface EspecialidadDaoRemote extends GenericDao<Especialidad, Long> {

}
