package com.globalhitss.java.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the gt_gestionar_ticket database table.
 * 
 */
@Entity
@Table(name="gt_gestionar_ticket")
@NamedQuery(name="GtGestionarTicket.findAll", query="SELECT g FROM GtGestionarTicket g")
public class GtGestionarTicket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GT_GESTIONAR_TICKET_IDGESTIONARTICKET_GENERATOR", sequenceName="SEQ_GESTIONAR_TICKET", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GT_GESTIONAR_TICKET_IDGESTIONARTICKET_GENERATOR")
	@Column(name="id_gestionar_ticket")
	private Integer idGestionarTicket;

	@Column(name="descripcion_solicitud")
	private String descripcionSolicitud;

	private String estado;

	@Column(name="fecha_solicitud")
	private Timestamp fechaSolicitud;

	private String prioridad;

	private String solicitante;

	public GtGestionarTicket() {
	}

	public Integer getIdGestionarTicket() {
		return this.idGestionarTicket;
	}

	public void setIdGestionarTicket(Integer idGestionarTicket) {
		this.idGestionarTicket = idGestionarTicket;
	}

	public String getDescripcionSolicitud() {
		return this.descripcionSolicitud;
	}

	public void setDescripcionSolicitud(String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

}