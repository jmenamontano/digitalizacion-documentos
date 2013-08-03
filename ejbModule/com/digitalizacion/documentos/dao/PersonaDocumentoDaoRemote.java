package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.PersonaDocumento;

@Remote
public interface PersonaDocumentoDaoRemote extends GenericDao<PersonaDocumento, Long> {

}
