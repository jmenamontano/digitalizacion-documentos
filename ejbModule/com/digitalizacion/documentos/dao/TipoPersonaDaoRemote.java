package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.TipoPersona;

@Remote
public interface TipoPersonaDaoRemote extends GenericDao<TipoPersona, Long> {

}
