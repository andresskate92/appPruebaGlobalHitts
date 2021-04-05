package com.globlahitss.java.dao;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import com.globalhitss.java.entity.GtGestionarTicket;
import com.globlahitss.java.customEntity.GestionarTicketsCustomEntity;
import com.globlahitss.java.util.BaseEntity;


@Stateless
@LocalBean
public class GestionarTicketesDAO extends BaseEntity{

	private StringBuilder sentenciaHQL;


	public List<GtGestionarTicket> getObtieneListaGestionarTickets() {
		
		sentenciaHQL = new StringBuilder();
		sentenciaHQL.append("from GtGestionarTicket a");
		
		TypedQuery<GtGestionarTicket> query = this.entityManager.createQuery(sentenciaHQL.toString(), GtGestionarTicket.class);
		
		if (!query.getResultList().isEmpty()) {
			return (List<GtGestionarTicket>) query.getResultList();
		}
		
		return null;
	}
	
	
	public void saveGestionarTickets(GtGestionarTicket gestionarTicket) {
		this.entityManager.persist(gestionarTicket);
	}
	
	public void updateGestionarTickets(GtGestionarTicket gestionarTicket) {
		this.entityManager.merge(gestionarTicket);
	}
	
	public void deleteGestionarTickets(GtGestionarTicket gestionarTicket) {
		this.entityManager.remove(this.entityManager.contains(gestionarTicket) ? gestionarTicket : this.entityManager.merge(gestionarTicket));
	}
	
}
