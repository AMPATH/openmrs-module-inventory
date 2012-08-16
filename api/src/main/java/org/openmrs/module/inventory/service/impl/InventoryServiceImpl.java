/**
 * 
 */
package org.openmrs.module.inventory.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.inventory.dao.InventoryDAO;
import org.openmrs.module.inventory.service.InventoryService;


/**
 *  @author Ampath Developers
 *
 */
public class InventoryServiceImpl extends BaseOpenmrsService implements InventoryService {
	
	protected static final Log log = LogFactory.getLog(InventoryServiceImpl.class);
	
	private InventoryDAO inventoryDAO;
	

	/**
	 * @param inventoryDAO the inventoryDAO to set
	 */
	public void setInventoryDAO(InventoryDAO inventoryDAO) {
		this.inventoryDAO = inventoryDAO;
	}

}

