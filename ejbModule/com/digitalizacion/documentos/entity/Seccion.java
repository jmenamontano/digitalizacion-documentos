package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_seccion database table.
 * 
 */
@Entity
@Table(name="dig_doc_seccion")
public class Seccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_SECCION_DIGDOCSECID_GENERATOR", sequenceName="SEQ_DIG_DOC_SECCION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_SECCION_DIGDOCSECID_GENERATOR")
	@Column(name="dig_doc_sec_id")
	private Long digDocSecId;

	@Column(name="dig_doc_sec_descripcion")
	private String digDocSecDescripcion;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="digDocSeccion")
	private Set<Matricula> digDocMatriculas;

    public Seccion() {
    }

	public Long getDigDocSecId() {
		return this.digDocSecId;
	}

	public void setDigDocSecId(Long digDocSecId) {
		this.digDocSecId = digDocSecId;
	}

	public String getDigDocSecDescripcion() {
		return this.digDocSecDescripcion;
	}

	public void setDigDocSecDescripcion(String digDocSecDescripcion) {
		this.digDocSecDescripcion = digDocSecDescripcion;
	}

	public Set<Matricula> getDigDocMatriculas() {
		return this.digDocMatriculas;
	}

	public void setDigDocMatriculas(Set<Matricula> digDocMatriculas) {
		this.digDocMatriculas = digDocMatriculas;
	}
	
}