package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Aplicacion;

@Local
public interface AplicacionDao extends GenericDao<Aplicacion, Long> {

}
