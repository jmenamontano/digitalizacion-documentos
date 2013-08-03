package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Documento;

@Remote
public interface DocumentoDaoRemote extends GenericDao<Documento, Long> {

}
