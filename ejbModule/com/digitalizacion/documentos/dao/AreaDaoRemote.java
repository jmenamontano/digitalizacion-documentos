package com.digitalizacion.documentos.dao;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Area;

@Remote
public interface AreaDaoRemote extends GenericDao<Area, Long> {

}
