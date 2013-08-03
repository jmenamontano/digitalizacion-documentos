package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the dig_doc_documento database table.
 * 
 */
@Entity
@Table(name="dig_doc_documento")
public class Documento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_DOCUMENTO_DIGDOCDOCID_GENERATOR", sequenceName="SEQ_DIG_DOC_DOCUMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_DOCUMENTO_DIGDOCDOCID_GENERATOR")
	@Column(name="dig_doc_doc_id")
	private Long digDocDocId;

	@Column(name="dig_doc_doc_nombre")
	private String digDocDocNombre;

	@Column(name="dig_doc_doc_nombre_corto")
	private String digDocDocNombreCorto;

	//bi-directional many-to-one association to PersonaDocumento
	@OneToMany(mappedBy="digDocDocumento")
	private Set<PersonaDocumento> digDocPersonaDocumentos;

    public Documento() {
    }

	public Long getDigDocDocId() {
		return this.digDocDocId;
	}

	public void setDigDocDocId(Long digDocDocId) {
		this.digDocDocId = digDocDocId;
	}

	public String getDigDocDocNombre() {
		return this.digDocDocNombre;
	}

	public void setDigDocDocNombre(String digDocDocNombre) {
		this.digDocDocNombre = digDocDocNombre;
	}

	public String getDigDocDocNombreCorto() {
		return this.digDocDocNombreCorto;
	}

	public void setDigDocDocNombreCorto(String digDocDocNombreCorto) {
		this.digDocDocNombreCorto = digDocDocNombreCorto;
	}

	public Set<PersonaDocumento> getDigDocPersonaDocumentos() {
		return this.digDocPersonaDocumentos;
	}

	public void setDigDocPersonaDocumentos(Set<PersonaDocumento> digDocPersonaDocumentos) {
		this.digDocPersonaDocumentos = digDocPersonaDocumentos;
	}
	
}