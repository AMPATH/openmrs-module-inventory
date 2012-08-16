<%@ include file="/WEB-INF/template/include.jsp"%>

<openmrs:require privilege="" otherwise="/login.htm"
                 redirect="/module/inventory/inventoryDetails.form" />

<openmrs:htmlInclude file="/dwr/interface/DWRInventoryService.js"/>

<%@ include file="/WEB-INF/template/header.jsp"%>
<h3><spring:message code="inventory.title"/></h3>