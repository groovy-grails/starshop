<%@ page import="nideshop.NideshopRegion" %>



<div class="fieldcontain ${hasErrors(bean: nideshopRegionInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopRegion.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="120" required="" value="${nideshopRegionInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopRegionInstance, field: 'parentId', 'error')} ">
	<label for="parentId">
		<g:message code="nideshopRegion.parentId.label" default="Parent Id" />
		
	</label>
	<g:select id="parentId" name="parentId.id" from="${nideshop.NideshopRegion.list()}" optionKey="id" value="${nideshopRegionInstance?.parentId?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopRegionInstance, field: 'agencyId', 'error')} required">
	<label for="agencyId">
		<g:message code="nideshopRegion.agencyId.label" default="Agency Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="agencyId" type="number" value="${nideshopRegionInstance.agencyId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopRegionInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="nideshopRegion.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="type" type="number" value="${nideshopRegionInstance.type}" required=""/>

</div>

