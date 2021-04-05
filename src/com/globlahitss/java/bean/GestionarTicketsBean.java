package com.globlahitss.java.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

import com.globalhitss.java.entity.GtGestionarTicket;
import com.globlahitss.java.dao.GestionarTicketesDAO;
import com.globlahitss.java.util.UtilBean;

@ViewScoped
@ManagedBean(name = "gestionarTicketsBean", eager = true)
public class GestionarTicketsBean extends UtilBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GtGestionarTicket gestionarTicketsCustomEntity = new GtGestionarTicket();
	private GtGestionarTicket gestionarTicketsCustomEntityUpdate;
	private List<GtGestionarTicket> listaGestionarTicketsCustomEntity = new ArrayList<>();

	@EJB
	private GestionarTicketesDAO gestionarTicketesDAO;

	@PostConstruct
	public void init() {
		this.gestionarTicketsCustomEntity = new GtGestionarTicket();
		this.listaGestionarTicketsCustomEntity = this.gestionarTicketesDAO.getObtieneListaGestionarTickets();
	}

	/**
	 * metodo para cargar la lista de tickets registrado en BD
	 */
	public void listaCargaData() {
		this.listaGestionarTicketsCustomEntity = this.gestionarTicketesDAO.getObtieneListaGestionarTickets();
	}
	
	/**
	 * metodo para registrar un nuevo tickets
	 */
	public void newGestionarTickets() {

		this.gestionarTicketsCustomEntity.setFechaSolicitud(new Timestamp(System.currentTimeMillis()));
		this.gestionarTicketesDAO.saveGestionarTickets(this.gestionarTicketsCustomEntity);
		this.mensajeExitos("Tickets Agregado Correctamente");
		this.gestionarTicketsCustomEntity = new GtGestionarTicket();
		PrimeFaces.current().executeScript("PF('dlgTicketsNew').hide();");
		this.listaCargaData();
	}

	/**
	 * metodo para actualizar algun tickets selecionado 
	 */
	public void updateDatos() {
					
		this.gestionarTicketesDAO.updateGestionarTickets(gestionarTicketsCustomEntityUpdate);

		PrimeFaces.current().executeScript("PF('dlgUpdateTickets').hide();");
		this.mensajeExitos("Tickets Actualizado Correctamente");
	}
	
	
	/**
	 * metodo para elminar algun tickets selecionado 
	 */
	public void eliminarDatos(GtGestionarTicket listTickets) {
					
		this.gestionarTicketesDAO.deleteGestionarTickets(listTickets);
		this.mensajeExitos("Tickets Eliminado Correctamente");
		this.listaCargaData();
	}
	
	
	public GtGestionarTicket getGestionarTicketsCustomEntity() {
		return gestionarTicketsCustomEntity;
	}

	public void setGestionarTicketsCustomEntity(GtGestionarTicket gestionarTicketsCustomEntity) {
		this.gestionarTicketsCustomEntity = gestionarTicketsCustomEntity;
	}

	public List<GtGestionarTicket> getListaGestionarTicketsCustomEntity() {
		return listaGestionarTicketsCustomEntity;
	}

	public void setListaGestionarTicketsCustomEntity(List<GtGestionarTicket> listaGestionarTicketsCustomEntity) {
		this.listaGestionarTicketsCustomEntity = listaGestionarTicketsCustomEntity;
	}

	public GestionarTicketesDAO getGestionarTicketesDAO() {
		return gestionarTicketesDAO;
	}

	public void setGestionarTicketesDAO(GestionarTicketesDAO gestionarTicketesDAO) {
		this.gestionarTicketesDAO = gestionarTicketesDAO;
	}

	public GtGestionarTicket getGestionarTicketsCustomEntityUpdate() {
		return gestionarTicketsCustomEntityUpdate;
	}

	public void setGestionarTicketsCustomEntityUpdate(GtGestionarTicket gestionarTicketsCustomEntityUpdate) {
		this.gestionarTicketsCustomEntityUpdate = gestionarTicketsCustomEntityUpdate;
	}

	
}
