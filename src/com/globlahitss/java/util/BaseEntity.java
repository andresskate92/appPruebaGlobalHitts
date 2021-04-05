package com.globlahitss.java.util;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public class BaseEntity {

	private static final String AppGestionarTicket = "appGestionarTicket";

	@PersistenceContext(unitName = AppGestionarTicket, type = PersistenceContextType.TRANSACTION)
	protected EntityManager entityManager;
}
