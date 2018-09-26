<%@ page import="nideshop.NideshopAttribute" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAttributeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopAttribute.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopAttributeInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAttributeInstance, field: 'values', 'error')} required">
	<label for="values">
		<g:message code="nideshopAttribute.values.label" default="Values" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="values" cols="40" rows="5" maxlength="8000" required="" value="${nideshopAttributeInstance?.values}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAttributeInstance, field: 'attributeCategoryId', 'error')} required">
	<label for="attributeCategoryId">
		<g:message code="nideshopAttribute.attributeCategoryId.label" default="Attribute Category Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="attributeCategoryId" name="attributeCategoryId.id" from="${nideshop.NideshopAttributeCategory.list()}" optionKey="id" required="" value="${nideshopAttributeInstance?.attributeCategoryId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAttributeInstance, field: 'inputType', 'error')} ">
	<label for="inputType">
		<g:message code="nideshopAttribute.inputType.label" default="Input Type" />
		
	</label>
	<g:checkBox name="inputType" value="${nideshopAttributeInstance?.inputType}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAttributeInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopAttribute.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopAttributeInstance.sortOrder}" required=""/>

</div>

