package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dig_doc_persona_documento database table.
 * 
 */
@Entity
@Table(name="dig_doc_persona_documento")
public class PersonaDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_PERSONA_DOCUMENTO_DIGDOCPERDOCID_GENERATOR", sequenceName="SEQ_DIG_DOC_PERSONA_DOCUMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_PERSONA_DOCUMENTO_DIGDOCPERDOCID_GENERATOR")
	@Column(name="dig_doc_per_doc_id")
	private Long digDocPerDocId;

	@Column(name="dig_doc_est_imagen")
	private byte[] digDocEstImagen;

	//bi-directional many-to-one association to Documento
    @ManyToOne
	@JoinColumn(name="dig_doc_doc_id")
	private Documento digDocDocumento;

	//bi-directional many-to-one association to Persona
    @ManyToOne
	@JoinColumn(name="dig_doc_per_id")
	private Persona digDocPersona;

	//bi-directional many-to-one association to Ubicacion
    @ManyToOne
	@JoinColumn(name="dig_doc_ubi_id")
	private Ubicacion digDocUbicacion;

    public PersonaDocumento() {
    }

	public Long getDigDocPerDocId() {
		return this.digDocPerDocId;
	}

	public void setDigDocPerDocId(Long digDocPerDocId) {
		this.digDocPerDocId = digDocPerDocId;
	}

	public byte[] getDigDocEstImagen() {
		return this.digDocEstImagen;
	}

	public void setDigDocEstImagen(byte[] digDocEstImagen) {
		this.digDocEstImagen = digDocEstImagen;
	}

	public Documento getDigDocDocumento() {
		return this.digDocDocumento;
	}

	public void setDigDocDocumento(Documento digDocDocumento) {
		this.digDocDocumento = digDocDocumento;
	}
	
	public Persona getDigDocPersona() {
		return this.digDocPersona;
	}

	public void setDigDocPersona(Persona digDocPersona) {
		this.digDocPersona = digDocPersona;
	}
	
	public Ubicacion getDigDocUbicacion() {
		return this.digDocUbicacion;
	}

	public void setDigDocUbicacion(Ubicacion digDocUbicacion) {
		this.digDocUbicacion = digDocUbicacion;
	}
	
}