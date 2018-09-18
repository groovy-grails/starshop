<%@ page import="nideshop.NideshopShipper" %>



<div class="fieldcontain ${hasErrors(bean: nideshopShipperInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopShipper.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="20" required="" value="${nideshopShipperInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopShipperInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="nideshopShipper.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" maxlength="10" required="" value="${nideshopShipperInstance?.code}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopShipperInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopShipper.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopShipperInstance.sortOrder}" required=""/>

</div>

