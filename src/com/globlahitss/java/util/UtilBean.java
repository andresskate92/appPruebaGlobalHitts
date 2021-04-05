package com.globlahitss.java.util;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.PrimeFacesContext;

import com.globlahitss.java.customEntity.GestionarTicketsEstado;
import com.globlahitss.java.customEntity.GestionarTicketsPrioridad;

public class UtilBean {

	/**
	 * visualiza mensaje por pantalla de exito
	 * @param mensaje
	 */
	public void mensajeExitos(String mensaje) {
		PrimeFacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exitoso", mensaje));
	}
	
	
	/**
	 * metodo generico para devolver los estado de los tickets durante el proceso
	 * @return
	 */
	public List<GestionarTicketsEstado> listaEstadoTickets(){
		
		List<GestionarTicketsEstado> listEstado = new ArrayList<>();
		GestionarTicketsEstado estado1 = new GestionarTicketsEstado();
		estado1.setCodEstado("A");
		estado1.setDescripcionEstado("ACTIVO");
		listEstado.add(estado1);
		
		GestionarTicketsEstado estado2 = new GestionarTicketsEstado();
		estado2.setCodEstado("P");
		estado2.setDescripcionEstado("PROCESANDO");
		listEstado.add(estado2);
		
		GestionarTicketsEstado estado3 = new GestionarTicketsEstado();
		estado3.setCodEstado("C");
		estado3.setDescripcionEstado("CERRADO");
		listEstado.add(estado3);
		
		GestionarTicketsEstado estado4 = new GestionarTicketsEstado();
		estado4.setCodEstado("I");
		estado4.setDescripcionEstado("INACTIVO");
		listEstado.add(estado4);
		
		return listEstado;
	}
	
	/**
	 * metodo generico para obtener la lista de los estado por prioridad de los tickets
	 * @return
	 */
	public List<GestionarTicketsPrioridad> listaPrioridadTickets(){
		
		List<GestionarTicketsPrioridad> listEstadoPrioridad = new ArrayList<>();
		
		GestionarTicketsPrioridad customEntity = new GestionarTicketsPrioridad();
		customEntity.setCodPrioridad("A");
		customEntity.setDescripcionPrioridad("ALTA");
		listEstadoPrioridad.add(customEntity);
		
		
		GestionarTicketsPrioridad customEntity1 = new GestionarTicketsPrioridad();
		customEntity1.setCodPrioridad("M");
		customEntity1.setDescripcionPrioridad("MEDIA");
		listEstadoPrioridad.add(customEntity1);
		
		GestionarTicketsPrioridad customEntity2 = new GestionarTicketsPrioridad();
		customEntity2.setCodPrioridad("B");
		customEntity2.setDescripcionPrioridad("BAJA");
		listEstadoPrioridad.add(customEntity2);
			
		return listEstadoPrioridad;
	}
}
