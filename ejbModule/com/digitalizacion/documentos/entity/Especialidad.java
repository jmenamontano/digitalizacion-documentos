package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_especialidad database table.
 * 
 */
@Entity
@Table(name="dig_doc_especialidad")
public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_ESPECIALIDAD_DIGDOCESPID_GENERATOR", sequenceName="SEQ_DIG_DOC_ESPECIALIDAD")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_ESPECIALIDAD_DIGDOCESPID_GENERATOR")
	@Column(name="dig_doc_esp_id")
	private Long digDocEspId;

	@Column(name="dig_doc_esp_descripcion")
	private String digDocEspDescripcion;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="digDocEspecialidad")
	private Set<Matricula> digDocMatriculas;

    public Especialidad() {
    }

	public Long getDigDocEspId() {
		return this.digDocEspId;
	}

	public void setDigDocEspId(Long digDocEspId) {
		this.digDocEspId = digDocEspId;
	}

	public String getDigDocEspDescripcion() {
		return this.digDocEspDescripcion;
	}

	public void setDigDocEspDescripcion(String digDocEspDescripcion) {
		this.digDocEspDescripcion = digDocEspDescripcion;
	}

	public Set<Matricula> getDigDocMatriculas() {
		return this.digDocMatriculas;
	}

	public void setDigDocMatriculas(Set<Matricula> digDocMatriculas) {
		this.digDocMatriculas = digDocMatriculas;
	}
	
}