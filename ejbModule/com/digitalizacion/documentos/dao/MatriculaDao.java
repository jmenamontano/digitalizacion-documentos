package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Matricula;

@Local
public interface MatriculaDao extends GenericDao<Matricula, Long> {

}
