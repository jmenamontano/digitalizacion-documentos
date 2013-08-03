package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Nivel;

@Remote
public interface NivelDaoRemote extends GenericDao<Nivel, Long> {

}
