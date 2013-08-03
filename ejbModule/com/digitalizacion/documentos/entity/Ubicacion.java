package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_dog_ubicacion database table.
 * 
 */
@Entity
@Table(name="dig_doc_ubicacion")
public class Ubicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOG_UBICACION_DIGDOCUBIID_GENERATOR", sequenceName="SEQ_DIG_DOC_UBICACION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOG_UBICACION_DIGDOCUBIID_GENERATOR")
	@Column(name="dig_doc_ubi_id")
	private Long digDocUbiId;

	@Column(name="dig_doc_ubi_codigo")
	private String digDocUbiCodigo;

	@Column(name="dig_doc_ubi_descripcion")
	private String digDocUbiDescripcion;

	//bi-directional many-to-one association to PersonaDocumento
	@OneToMany(mappedBy="digDocUbicacion")
	private Set<PersonaDocumento> digDocPersonaDocumentos;

	//bi-directional many-to-one association to Area
    @ManyToOne
	@JoinColumn(name="dig_doc_are_id")
	private Area digDocArea;

    public Ubicacion() {
    }

	public Long getDigDocUbiId() {
		return this.digDocUbiId;
	}

	public void setDigDocUbiId(Long digDocUbiId) {
		this.digDocUbiId = digDocUbiId;
	}

	public String getDigDocUbiCodigo() {
		return this.digDocUbiCodigo;
	}

	public void setDigDocUbiCodigo(String digDocUbiCodigo) {
		this.digDocUbiCodigo = digDocUbiCodigo;
	}

	public String getDigDocUbiDescripcion() {
		return this.digDocUbiDescripcion;
	}

	public void setDigDocUbiDescripcion(String digDocUbiDescripcion) {
		this.digDocUbiDescripcion = digDocUbiDescripcion;
	}

	public Set<PersonaDocumento> getDigDocPersonaDocumentos() {
		return this.digDocPersonaDocumentos;
	}

	public void setDigDocPersonaDocumentos(Set<PersonaDocumento> digDocPersonaDocumentos) {
		this.digDocPersonaDocumentos = digDocPersonaDocumentos;
	}
	
	public Area getDigDocArea() {
		return this.digDocArea;
	}

	public void setDigDocArea(Area digDocArea) {
		this.digDocArea = digDocArea;
	}
	
}