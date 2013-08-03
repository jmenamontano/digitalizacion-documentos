package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the seg_claves_aplicacion database table.
 * 
 */
@Entity
@Table(name="seg_claves_aplicacion")
public class Aplicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_APLICACION_APLIID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_APLICACION")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_APLICACION_APLIID_GENERATOR")
	@Column(name="apli_id")
	private Long apliId;

	@Column(name="apli_codigo")
	private String apliCodigo;

	@Column(name="apli_descripcion")
	private String apliDescripcion;

	//bi-directional many-to-one association to OpcionesPerfil
	@OneToMany(mappedBy="segClavesAplicacion")
	private Set<OpcionesPerfil> segClavesOpcionesPerfils;

	//bi-directional many-to-one association to UsuarioPerfil
	@OneToMany(mappedBy="segClavesAplicacion")
	private Set<UsuarioPerfil> segClavesUsuarioPerfils;

    public Aplicacion() {
    }

	public Long getApliId() {
		return this.apliId;
	}

	public void setApliId(Long apliId) {
		this.apliId = apliId;
	}

	public String getApliCodigo() {
		return this.apliCodigo;
	}

	public void setApliCodigo(String apliCodigo) {
		this.apliCodigo = apliCodigo;
	}

	public String getApliDescripcion() {
		return this.apliDescripcion;
	}

	public void setApliDescripcion(String apliDescripcion) {
		this.apliDescripcion = apliDescripcion;
	}

	public Set<OpcionesPerfil> getSegClavesOpcionesPerfils() {
		return this.segClavesOpcionesPerfils;
	}

	public void setSegClavesOpcionesPerfils(Set<OpcionesPerfil> segClavesOpcionesPerfils) {
		this.segClavesOpcionesPerfils = segClavesOpcionesPerfils;
	}
	
	public Set<UsuarioPerfil> getSegClavesUsuarioPerfils() {
		return this.segClavesUsuarioPerfils;
	}

	public void setSegClavesUsuarioPerfils(Set<UsuarioPerfil> segClavesUsuarioPerfils) {
		this.segClavesUsuarioPerfils = segClavesUsuarioPerfils;
	}
	
}