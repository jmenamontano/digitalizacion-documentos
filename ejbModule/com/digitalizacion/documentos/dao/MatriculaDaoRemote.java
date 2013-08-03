package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Matricula;

@Remote
public interface MatriculaDaoRemote extends GenericDao<Matricula, Long> {

}
