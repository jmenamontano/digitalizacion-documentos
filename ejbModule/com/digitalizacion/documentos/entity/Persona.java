package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the dig_doc_persona database table.
 * 
 */
@Entity
@Table(name="dig_doc_persona")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_PERSONA_DIGDOCPERID_GENERATOR", sequenceName="SEQ_DIG_DOC_PERSONA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_PERSONA_DIGDOCPERID_GENERATOR")
	@Column(name="dig_doc_per_id")
	private Long digDocPerId;

	@Column(name="dig_doc_per_apellidos")
	private String digDocPerApellidos;

	@Column(name="dig_doc_per_cedula")
	private BigDecimal digDocPerCedula;

	@Column(name="dig_doc_per_celular")
	private BigDecimal digDocPerCelular;

	@Column(name="dig_doc_per_direccion")
	private String digDocPerDireccion;

    @Temporal( TemporalType.DATE)
	@Column(name="dig_doc_per_fecha_nacimiento")
	private Date digDocPerFechaNacimiento;

	@Column(name="dig_doc_per_mail")
	private String digDocPerMail;

	@Column(name="dig_doc_per_nombres")
	private String digDocPerNombres;

	@Column(name="dig_doc_per_telefono")
	private BigDecimal digDocPerTelefono;

	//bi-directional many-to-one association to Matricula
	@OneToMany(mappedBy="digDocPersona")
	private Set<Matricula> digDocMatriculas;

	//bi-directional many-to-one association to TipoPersona
    @ManyToOne
	@JoinColumn(name="dig_doc_tip_per_id")
	private TipoPersona digDocTipoPersona;

	//bi-directional many-to-one association to PersonaDocumento
	@OneToMany(mappedBy="digDocPersona")
	private Set<PersonaDocumento> digDocPersonaDocumentos;

    public Persona() {
    }

	public Long getDigDocPerId() {
		return this.digDocPerId;
	}

	public void setDigDocPerId(Long digDocPerId) {
		this.digDocPerId = digDocPerId;
	}

	public String getDigDocPerApellidos() {
		return this.digDocPerApellidos;
	}

	public void setDigDocPerApellidos(String digDocPerApellidos) {
		this.digDocPerApellidos = digDocPerApellidos;
	}

	public BigDecimal getDigDocPerCedula() {
		return this.digDocPerCedula;
	}

	public void setDigDocPerCedula(BigDecimal digDocPerCedula) {
		this.digDocPerCedula = digDocPerCedula;
	}

	public BigDecimal getDigDocPerCelular() {
		return this.digDocPerCelular;
	}

	public void setDigDocPerCelular(BigDecimal digDocPerCelular) {
		this.digDocPerCelular = digDocPerCelular;
	}

	public String getDigDocPerDireccion() {
		return this.digDocPerDireccion;
	}

	public void setDigDocPerDireccion(String digDocPerDireccion) {
		this.digDocPerDireccion = digDocPerDireccion;
	}

	public Date getDigDocPerFechaNacimiento() {
		return this.digDocPerFechaNacimiento;
	}

	public void setDigDocPerFechaNacimiento(Date digDocPerFechaNacimiento) {
		this.digDocPerFechaNacimiento = digDocPerFechaNacimiento;
	}

	public String getDigDocPerMail() {
		return this.digDocPerMail;
	}

	public void setDigDocPerMail(String digDocPerMail) {
		this.digDocPerMail = digDocPerMail;
	}

	public String getDigDocPerNombres() {
		return this.digDocPerNombres;
	}

	public void setDigDocPerNombres(String digDocPerNombres) {
		this.digDocPerNombres = digDocPerNombres;
	}

	public BigDecimal getDigDocPerTelefono() {
		return this.digDocPerTelefono;
	}

	public void setDigDocPerTelefono(BigDecimal digDocPerTelefono) {
		this.digDocPerTelefono = digDocPerTelefono;
	}

	public Set<Matricula> getDigDocMatriculas() {
		return this.digDocMatriculas;
	}

	public void setDigDocMatriculas(Set<Matricula> digDocMatriculas) {
		this.digDocMatriculas = digDocMatriculas;
	}
	
	public TipoPersona getDigDocTipoPersona() {
		return this.digDocTipoPersona;
	}

	public void setDigDocTipoPersona(TipoPersona digDocTipoPersona) {
		this.digDocTipoPersona = digDocTipoPersona;
	}
	
	public Set<PersonaDocumento> getDigDocPersonaDocumentos() {
		return this.digDocPersonaDocumentos;
	}

	public void setDigDocPersonaDocumentos(Set<PersonaDocumento> digDocPersonaDocumentos) {
		this.digDocPersonaDocumentos = digDocPersonaDocumentos;
	}
	
}