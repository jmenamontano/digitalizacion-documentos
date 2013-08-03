package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.PersonaDocumentoDao;
import com.digitalizacion.documentos.dao.PersonaDocumentoDaoRemote;
import com.digitalizacion.documentos.entity.PersonaDocumento;

@Stateless
public class PersonaDocumentoDaoImpl extends GenericDaoImpl<PersonaDocumento, Long> implements
		PersonaDocumentoDao, PersonaDocumentoDaoRemote {

	public PersonaDocumentoDaoImpl() {
		super(PersonaDocumento.class);
	}

}
