package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_modalidad database table.
 * 
 */
@Entity
@Table(name="dig_doc_modalidad")
public class Modalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_MODALIDAD_DIGDOCMODID_GENERATOR", sequenceName="SEQ_DIG_DOC_MODALIDAD")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_MODALIDAD_DIGDOCMODID_GENERATOR")
	@Column(name="dig_doc_mod_id")
	private Long digDocModId;

	@Column(name="dig_doc_mod_descripcion")
	private String digDocModDescripcion;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="digDocModalidad")
	private Set<Matricula> digDocMatriculas;

    public Modalidad() {
    }

	public Long getDigDocModId() {
		return this.digDocModId;
	}

	public void setDigDocModId(Long digDocModId) {
		this.digDocModId = digDocModId;
	}

	public String getDigDocModDescripcion() {
		return this.digDocModDescripcion;
	}

	public void setDigDocModDescripcion(String digDocModDescripcion) {
		this.digDocModDescripcion = digDocModDescripcion;
	}

	public Set<Matricula> getDigDocMatriculas() {
		return this.digDocMatriculas;
	}

	public void setDigDocMatriculas(Set<Matricula> digDocMatriculas) {
		this.digDocMatriculas = digDocMatriculas;
	}
	
}