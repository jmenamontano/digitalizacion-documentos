package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_tipo_persona database table.
 * 
 */
@Entity
@Table(name="dig_doc_tipo_persona")
public class TipoPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_TIPO_PERSONA_DIGDOCTIPPERID_GENERATOR", sequenceName="SEQ_DIG_DOC_TIPO_PERSONA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_TIPO_PERSONA_DIGDOCTIPPERID_GENERATOR")
	@Column(name="dig_doc_tip_per_id")
	private Long digDocTipPerId;

	@Column(name="dig_dog_tip_per_descripcion")
	private String digDogTipPerDescripcion;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="digDocTipoPersona")
	private Set<Persona> digDocPersonas;

    public TipoPersona() {
    }

	public Long getDigDocTipPerId() {
		return this.digDocTipPerId;
	}

	public void setDigDocTipPerId(Long digDocTipPerId) {
		this.digDocTipPerId = digDocTipPerId;
	}

	public String getDigDogTipPerDescripcion() {
		return this.digDogTipPerDescripcion;
	}

	public void setDigDogTipPerDescripcion(String digDogTipPerDescripcion) {
		this.digDogTipPerDescripcion = digDogTipPerDescripcion;
	}

	public Set<Persona> getDigDocPersonas() {
		return this.digDocPersonas;
	}

	public void setDigDocPersonas(Set<Persona> digDocPersonas) {
		this.digDocPersonas = digDocPersonas;
	}
	
}