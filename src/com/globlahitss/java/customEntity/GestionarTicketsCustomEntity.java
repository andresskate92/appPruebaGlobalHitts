package com.globlahitss.java.customEntity;

import java.util.Date;

public class GestionarTicketsCustomEntity {

	private int id;
	private String descripcionSolicitud;
	private String estado;
	private String prioridad;
	private String Solicitante;
	private Date fechaSolicitud;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcionSolicitud() {
		return descripcionSolicitud;
	}

	public void setDescripcionSolicitud(String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getSolicitante() {
		return Solicitante;
	}

	public void setSolicitante(String solicitante) {
		Solicitante = solicitante;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

}
