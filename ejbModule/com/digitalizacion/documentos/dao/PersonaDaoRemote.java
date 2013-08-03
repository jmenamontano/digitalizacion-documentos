package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Persona;

@Remote
public interface PersonaDaoRemote extends GenericDao<Persona, Long> {

}
