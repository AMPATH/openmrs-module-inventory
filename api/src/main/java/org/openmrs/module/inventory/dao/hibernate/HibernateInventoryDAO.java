/**
 * 
 */
package org.openmrs.module.inventory.dao.hibernate;


import org.hibernate.SessionFactory;
import org.openmrs.module.inventory.dao.InventoryDAO;



/**
 * @author Nichola Ingosi Magaja
 *
 */
public class HibernateInventoryDAO implements InventoryDAO {
	
	private SessionFactory sessionFactory;
	
	
    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
    	return sessionFactory;
    }

	
    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
    	this.sessionFactory = sessionFactory;
    }




}
