package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the seg_claves_perfil database table.
 * 
 */
@Entity
@Table(name="seg_claves_perfil")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_PERFIL_PERID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_PERFIL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_PERFIL_PERID_GENERATOR")
	@Column(name="per_id")
	private Long perId;

	@Column(name="per_descripcion")
	private String perDescripcion;

	@Column(name="per_estado")
	private String perEstado;

	//bi-directional many-to-one association to OpcionesPerfil
	@OneToMany(mappedBy="segClavesPerfil")
	private Set<OpcionesPerfil> segClavesOpcionesPerfils;

	//bi-directional many-to-one association to UsuarioPerfil
	@OneToMany(mappedBy="segClavesPerfil")
	private Set<UsuarioPerfil> segClavesUsuarioPerfils;

    public Perfil() {
    }

	public Long getPerId() {
		return this.perId;
	}

	public void setPerId(Long perId) {
		this.perId = perId;
	}

	public String getPerDescripcion() {
		return this.perDescripcion;
	}

	public void setPerDescripcion(String perDescripcion) {
		this.perDescripcion = perDescripcion;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
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