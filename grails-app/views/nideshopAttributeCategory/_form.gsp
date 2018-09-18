<%@ page import="nideshop.NideshopAttributeCategory" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAttributeCategoryInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopAttributeCategory.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopAttributeCategoryInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAttributeCategoryInstance, field: 'enabled', 'error')} required">
	<label for="enabled">
		<g:message code="nideshopAttributeCategory.enabled.label" default="Enabled" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="enabled" type="number" value="${nideshopAttributeCategoryInstance.enabled}" required=""/>

</div>

