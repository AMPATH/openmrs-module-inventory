/**
 * 
 */
package org.openmrs.module.inventory.ext;

import org.openmrs.module.web.extension.AdministrationSectionExt;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author Nicholas Ingosi Magaja
 *
 */
public class InventoryAdminExt extends AdministrationSectionExt {
	
	/** Defines the privilege required to the see the Administration section for the module */
	public String getRequiredPrivilege() {
		return "";
	}
	/* (non-Javadoc)
	 * @see org.openmrs.module.web.extension.AdministrationSectionExt#getLinks()
	 */
	@Override
	public Map<String, String> getLinks() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("module/inventory/inventoryDetails.form", "Inventory Details");

		return map;
	}
	
	/* (non-Javadoc)
	 * @see org.openmrs.module.web.extension.AdministrationSectionExt#getTitle()
	 */
	@Override
	public String getTitle() {
		return "Inventory Module";
	}
	
}
