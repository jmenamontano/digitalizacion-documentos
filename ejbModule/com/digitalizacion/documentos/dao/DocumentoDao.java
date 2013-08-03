package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Documento;

@Local
public interface DocumentoDao extends GenericDao<Documento, Long> {

}
