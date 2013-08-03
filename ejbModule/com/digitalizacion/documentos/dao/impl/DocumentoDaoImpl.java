package com.digitalizacion.documentos.dao.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.DocumentoDao;
import com.digitalizacion.documentos.dao.DocumentoDaoRemote;
import com.digitalizacion.documentos.entity.Documento;

@Stateless
public class DocumentoDaoImpl extends GenericDaoImpl<Documento, Long> implements DocumentoDao,DocumentoDaoRemote{

	public DocumentoDaoImpl() {
		super(Documento.class);
	}

}
