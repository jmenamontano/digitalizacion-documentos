package com.digitalizacion.documentos.dao;
 
import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Modalidad;

@Remote
public interface ModalidadDaoRemote extends GenericDao<Modalidad, Long>{

}
