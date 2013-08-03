package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the seg_claves_usuario_perfil database table.
 * 
 */
@Entity
@Table(name="seg_claves_usuario_perfil")
public class UsuarioPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_USUARIO_PERFIL_USUPERID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_USUARIO_PERFIL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_USUARIO_PERFIL_USUPERID_GENERATOR")
	@Column(name="usu_per_id")
	private Long usuPerId;

	//bi-directional many-to-one association to Aplicacion
    @ManyToOne
	@JoinColumn(name="apli_id")
	private Aplicacion segClavesAplicacion;

	//bi-directional many-to-one association to Perfil
    @ManyToOne
	@JoinColumn(name="per_id")
	private Perfil segClavesPerfil;

	//bi-directional many-to-one association to Usuario
    @ManyToOne
	@JoinColumn(name="usu_id")
	private Usuario segClavesUsuario;

    public UsuarioPerfil() {
    }

	public Long getUsuPerId() {
		return this.usuPerId;
	}

	public void setUsuPerId(Long usuPerId) {
		this.usuPerId = usuPerId;
	}

	public Aplicacion getSegClavesAplicacion() {
		return this.segClavesAplicacion;
	}

	public void setSegClavesAplicacion(Aplicacion segClavesAplicacion) {
		this.segClavesAplicacion = segClavesAplicacion;
	}
	
	public Perfil getSegClavesPerfil() {
		return this.segClavesPerfil;
	}

	public void setSegClavesPerfil(Perfil segClavesPerfil) {
		this.segClavesPerfil = segClavesPerfil;
	}
	
	public Usuario getSegClavesUsuario() {
		return this.segClavesUsuario;
	}

	public void setSegClavesUsuario(Usuario segClavesUsuario) {
		this.segClavesUsuario = segClavesUsuario;
	}
	
}