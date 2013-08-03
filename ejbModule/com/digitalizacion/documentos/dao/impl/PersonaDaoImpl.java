package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.PersonaDao;
import com.digitalizacion.documentos.dao.PersonaDaoRemote;
import com.digitalizacion.documentos.entity.Persona;

@Stateless
public class PersonaDaoImpl extends GenericDaoImpl<Persona, Long> implements PersonaDao, PersonaDaoRemote {

	public PersonaDaoImpl() {
		super(Persona.class);
	}

}
