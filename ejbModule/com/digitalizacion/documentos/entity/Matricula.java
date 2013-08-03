package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dig_doc_matricula database table.
 * 
 */
@Entity
@Table(name="dig_doc_matricula")
public class Matricula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIG_DOC_MATRICULA_DIGDOCMATID_GENERATOR", sequenceName="SEQ_DIG_DOC_MATRICULA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DIG_DOC_MATRICULA_DIGDOCMATID_GENERATOR")
	@Column(name="dig_doc_mat_id")
	private Long digDocMatId;

    @Temporal( TemporalType.DATE)
	@Column(name="dig_doc_fic_fecha_entrega_docs")
	private Date digDocFicFechaEntregaDocs;

	@Column(name="dig_doc_mat_anio_ingreso")
	private Integer digDocMatAnioIngreso;

    @Temporal( TemporalType.DATE)
	@Column(name="dig_doc_mat_fecha_retiro_docs")
	private Date digDocMatFechaRetiroDocs;

	@Column(name="dig_doc_mat_mes_ingreso")
	private Integer digDocMatMesIngreso;

	@Column(name="dig_doc_mat_numero")
	private Long digDocMatNumero;

	@Column(name="dig_doc_mat_tipo_ingreso")
	private String digDocMatTipoIngreso;

	@Column(name="dig_dog_mat_responsable_recepci")
	private String digDogMatResponsableRecepci;

	//bi-directional many-to-one association to Especialidad
    @ManyToOne
	@JoinColumn(name="dig_doc_esp_id")
	private Especialidad digDocEspecialidad;

	//bi-directional many-to-one association to Modalidad
    @ManyToOne
	@JoinColumn(name="dig_doc_mod_id")
	private Modalidad digDocModalidad;

	//bi-directional many-to-one association to Nivel
    @ManyToOne
	@JoinColumn(name="dig_doc_niv_id")
	private Nivel digDocNivel;

	//bi-directional many-to-one association to Seccion
    @ManyToOne
	@JoinColumn(name="dig_doc_sec_id")
	private Seccion digDocSeccion;

	//bi-directional many-to-one association to Persona
    @ManyToOne
	@JoinColumn(name="dig_doc_per_id")
	private Persona digDocPersona;

    public Matricula() {
    }

	public Long getDigDocMatId() {
		return this.digDocMatId;
	}

	public void setDigDocMatId(Long digDocMatId) {
		this.digDocMatId = digDocMatId;
	}

	public Date getDigDocFicFechaEntregaDocs() {
		return this.digDocFicFechaEntregaDocs;
	}

	public void setDigDocFicFechaEntregaDocs(Date digDocFicFechaEntregaDocs) {
		this.digDocFicFechaEntregaDocs = digDocFicFechaEntregaDocs;
	}

	public Integer getDigDocMatAnioIngreso() {
		return this.digDocMatAnioIngreso;
	}

	public void setDigDocMatAnioIngreso(Integer digDocMatAnioIngreso) {
		this.digDocMatAnioIngreso = digDocMatAnioIngreso;
	}

	public Date getDigDocMatFechaRetiroDocs() {
		return this.digDocMatFechaRetiroDocs;
	}

	public void setDigDocMatFechaRetiroDocs(Date digDocMatFechaRetiroDocs) {
		this.digDocMatFechaRetiroDocs = digDocMatFechaRetiroDocs;
	}

	public Integer getDigDocMatMesIngreso() {
		return this.digDocMatMesIngreso;
	}

	public void setDigDocMatMesIngreso(Integer digDocMatMesIngreso) {
		this.digDocMatMesIngreso = digDocMatMesIngreso;
	}

	public Long getDigDocMatNumero() {
		return this.digDocMatNumero;
	}

	public void setDigDocMatNumero(Long digDocMatNumero) {
		this.digDocMatNumero = digDocMatNumero;
	}

	public String getDigDocMatTipoIngreso() {
		return this.digDocMatTipoIngreso;
	}

	public void setDigDocMatTipoIngreso(String digDocMatTipoIngreso) {
		this.digDocMatTipoIngreso = digDocMatTipoIngreso;
	}

	public String getDigDogMatResponsableRecepci() {
		return this.digDogMatResponsableRecepci;
	}

	public void setDigDogMatResponsableRecepci(String digDogMatResponsableRecepci) {
		this.digDogMatResponsableRecepci = digDogMatResponsableRecepci;
	}

	public Especialidad getDigDocEspecialidad() {
		return this.digDocEspecialidad;
	}

	public void setDigDocEspecialidad(Especialidad digDocEspecialidad) {
		this.digDocEspecialidad = digDocEspecialidad;
	}
	
	public Modalidad getDigDocModalidad() {
		return this.digDocModalidad;
	}

	public void setDigDocModalidad(Modalidad digDocModalidad) {
		this.digDocModalidad = digDocModalidad;
	}
	
	public Nivel getDigDocNivel() {
		return this.digDocNivel;
	}

	public void setDigDocNivel(Nivel digDocNivel) {
		this.digDocNivel = digDocNivel;
	}
	
	public Seccion getDigDocSeccion() {
		return this.digDocSeccion;
	}

	public void setDigDocSeccion(Seccion digDocSeccion) {
		this.digDocSeccion = digDocSeccion;
	}
	
	public Persona getDigDocPersona() {
		return this.digDocPersona;
	}

	public void setDigDocPersona(Persona digDocPersona) {
		this.digDocPersona = digDocPersona;
	}
	
}