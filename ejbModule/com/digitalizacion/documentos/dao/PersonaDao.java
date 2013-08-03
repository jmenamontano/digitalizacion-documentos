package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Persona;

@Local
public interface PersonaDao extends GenericDao<Persona, Long> {

}
