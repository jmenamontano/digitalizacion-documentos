package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_area database table.
 * 
 */
@Entity
@Table(name="dig_doc_area")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_AREA_DIGDOCAREID_GENERATOR", sequenceName="SEQ_DIG_DOC_AREA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_AREA_DIGDOCAREID_GENERATOR")
	@Column(name="dig_doc_are_id")
	private Long digDocAreId;

	@Column(name="dig_doc_are_descripcion")
	private String digDocAreDescripcion;

	//bi-directional many-to-one association to Ubicacion
	@OneToMany(mappedBy="digDocArea")
	private Set<Ubicacion> digDogUbicacions;

    public Area() {
    }

	public Long getDigDocAreId() {
		return this.digDocAreId;
	}

	public void setDigDocAreId(Long digDocAreId) {
		this.digDocAreId = digDocAreId;
	}

	public String getDigDocAreDescripcion() {
		return this.digDocAreDescripcion;
	}

	public void setDigDocAreDescripcion(String digDocAreDescripcion) {
		this.digDocAreDescripcion = digDocAreDescripcion;
	}

	public Set<Ubicacion> getDigDogUbicacions() {
		return this.digDogUbicacions;
	}

	public void setDigDogUbicacions(Set<Ubicacion> digDogUbicacions) {
		this.digDogUbicacions = digDogUbicacions;
	}
	
}