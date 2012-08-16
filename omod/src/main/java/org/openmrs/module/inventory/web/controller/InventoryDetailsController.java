/**
 * 
 */
package org.openmrs.module.inventory.web.controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Nicholas Ingosi Magaja
 *
 */
@Controller
public class InventoryDetailsController {

	private static final Log log = LogFactory.getLog(InventoryDetailsController.class);
	
	@RequestMapping(method=RequestMethod.GET, value="module/inventory/inventoryDetails")
	public void preparePage(ModelMap map) {

	}
	
	@RequestMapping(method=RequestMethod.POST, value="module/inventory/inventoryDetails")
	public void processForm(ModelMap map){
	}
}