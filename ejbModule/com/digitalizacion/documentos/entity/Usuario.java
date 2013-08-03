package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the seg_claves_usuario database table.
 * 
 */
@Entity
@Table(name="seg_claves_usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_USUARIO_USUID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_USUARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_USUARIO_USUID_GENERATOR")
	@Column(name="usu_id")
	private Long usuId;

	@Column(name="usu_apellidos")
	private String usuApellidos;

	@Column(name="usu_clave")
	private String usuClave;

	@Column(name="usu_estado")
	private String usuEstado;

    @Temporal( TemporalType.DATE)
	@Column(name="usu_fecha_activacion")
	private Date usuFechaActivacion;

    @Temporal( TemporalType.DATE)
	@Column(name="usu_fecha_desactivacion")
	private Date usuFechaDesactivacion;

	@Column(name="usu_mail")
	private String usuMail;

	@Column(name="usu_nombres")
	private String usuNombres;

	@Column(name="usu_numero_contacto")
	private BigDecimal usuNumeroContacto;

	@Column(name="usu_usuario")
	private String usuUsuario;

	//bi-directional many-to-one association to UsuarioPerfil
	@OneToMany(mappedBy="segClavesUsuario")
	private Set<UsuarioPerfil> segClavesUsuarioPerfils;

    public Usuario() {
    }

	public Long getUsuId() {
		return this.usuId;
	}

	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}

	public String getUsuApellidos() {
		return this.usuApellidos;
	}

	public void setUsuApellidos(String usuApellidos) {
		this.usuApellidos = usuApellidos;
	}

	public String getUsuClave() {
		return this.usuClave;
	}

	public void setUsuClave(String usuClave) {
		this.usuClave = usuClave;
	}

	public String getUsuEstado() {
		return this.usuEstado;
	}

	public void setUsuEstado(String usuEstado) {
		this.usuEstado = usuEstado;
	}

	public Date getUsuFechaActivacion() {
		return this.usuFechaActivacion;
	}

	public void setUsuFechaActivacion(Date usuFechaActivacion) {
		this.usuFechaActivacion = usuFechaActivacion;
	}

	public Date getUsuFechaDesactivacion() {
		return this.usuFechaDesactivacion;
	}

	public void setUsuFechaDesactivacion(Date usuFechaDesactivacion) {
		this.usuFechaDesactivacion = usuFechaDesactivacion;
	}

	public String getUsuMail() {
		return this.usuMail;
	}

	public void setUsuMail(String usuMail) {
		this.usuMail = usuMail;
	}

	public String getUsuNombres() {
		return this.usuNombres;
	}

	public void setUsuNombres(String usuNombres) {
		this.usuNombres = usuNombres;
	}

	public BigDecimal getUsuNumeroContacto() {
		return this.usuNumeroContacto;
	}

	public void setUsuNumeroContacto(BigDecimal usuNumeroContacto) {
		this.usuNumeroContacto = usuNumeroContacto;
	}

	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	public Set<UsuarioPerfil> getSegClavesUsuarioPerfils() {
		return this.segClavesUsuarioPerfils;
	}

	public void setSegClavesUsuarioPerfils(Set<UsuarioPerfil> segClavesUsuarioPerfils) {
		this.segClavesUsuarioPerfils = segClavesUsuarioPerfils;
	}
	
}