package com.digitalizacion.documentos.dao;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.PersonaDocumento;

@Local
public interface PersonaDocumentoDao extends GenericDao<PersonaDocumento, Long> {

}
