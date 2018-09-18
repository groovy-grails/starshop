<%@ page import="nideshop.NideshopUserLevel" %>



<div class="fieldcontain ${hasErrors(bean: nideshopUserLevelInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopUserLevel.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="30" required="" value="${nideshopUserLevelInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserLevelInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="nideshopUserLevel.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${nideshopUserLevelInstance?.description}"/>

</div>

