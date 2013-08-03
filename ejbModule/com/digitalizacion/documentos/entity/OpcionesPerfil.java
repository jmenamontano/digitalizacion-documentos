package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the seg_claves_opciones_perfil database table.
 * 
 */
@Entity
@Table(name="seg_claves_opciones_perfil")
public class OpcionesPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_OPCIONES_PERFIL_OPCPERID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_OPCIONES_PERFIL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_OPCIONES_PERFIL_OPCPERID_GENERATOR")
	@Column(name="opc_per_id")
	private Long opcPerId;

	//bi-directional many-to-one association to Aplicacion
    @ManyToOne
	@JoinColumn(name="apli_id")
	private Aplicacion segClavesAplicacion;

	//bi-directional many-to-one association to Opcion
    @ManyToOne
	@JoinColumn(name="opc_id")
	private Opcion segClavesOpcione;

	//bi-directional many-to-one association to Perfil
    @ManyToOne
	@JoinColumn(name="per_id")
	private Perfil segClavesPerfil;

    public OpcionesPerfil() {
    }

	public Long getOpcPerId() {
		return this.opcPerId;
	}

	public void setOpcPerId(Long opcPerId) {
		this.opcPerId = opcPerId;
	}

	public Aplicacion getSegClavesAplicacion() {
		return this.segClavesAplicacion;
	}

	public void setSegClavesAplicacion(Aplicacion segClavesAplicacion) {
		this.segClavesAplicacion = segClavesAplicacion;
	}
	
	public Opcion getSegClavesOpcione() {
		return this.segClavesOpcione;
	}

	public void setSegClavesOpcione(Opcion segClavesOpcione) {
		this.segClavesOpcione = segClavesOpcione;
	}
	
	public Perfil getSegClavesPerfil() {
		return this.segClavesPerfil;
	}

	public void setSegClavesPerfil(Perfil segClavesPerfil) {
		this.segClavesPerfil = segClavesPerfil;
	}
	
}