package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_nivel database table.
 * 
 */
@Entity
@Table(name="dig_doc_nivel")
public class Nivel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_NIVEL_DIGDOCNIVID_GENERATOR", sequenceName="SEQ_DIG_DOC_NIVEL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_NIVEL_DIGDOCNIVID_GENERATOR")
	@Column(name="dig_doc_niv_id")
	private Long digDocNivId;

	@Column(name="dig_doc_niv_descripcion")
	private String digDocNivDescripcion;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="digDocNivel")
	private Set<Matricula> digDocMatriculas;

    public Nivel() {
    }

	public Long getDigDocNivId() {
		return this.digDocNivId;
	}

	public void setDigDocNivId(Long digDocNivId) {
		this.digDocNivId = digDocNivId;
	}

	public String getDigDocNivDescripcion() {
		return this.digDocNivDescripcion;
	}

	public void setDigDocNivDescripcion(String digDocNivDescripcion) {
		this.digDocNivDescripcion = digDocNivDescripcion;
	}

	public Set<Matricula> getDigDocMatriculas() {
		return this.digDocMatriculas;
	}

	public void setDigDocMatriculas(Set<Matricula> digDocMatriculas) {
		this.digDocMatriculas = digDocMatriculas;
	}
	
}