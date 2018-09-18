<%@ page import="nideshop.NideshopSpecification" %>



<div class="fieldcontain ${hasErrors(bean: nideshopSpecificationInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopSpecification.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopSpecificationInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopSpecificationInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopSpecification.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopSpecificationInstance.sortOrder}" required=""/>

</div>

