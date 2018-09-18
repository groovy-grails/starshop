<%@ page import="nideshop.NideshopAdPosition" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAdPositionInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopAdPosition.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopAdPositionInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdPositionInstance, field: 'desc', 'error')} required">
	<label for="desc">
		<g:message code="nideshopAdPosition.desc.label" default="Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="desc" required="" value="${nideshopAdPositionInstance?.desc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdPositionInstance, field: 'height', 'error')} required">
	<label for="height">
		<g:message code="nideshopAdPosition.height.label" default="Height" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="height" type="number" value="${nideshopAdPositionInstance.height}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdPositionInstance, field: 'width', 'error')} required">
	<label for="width">
		<g:message code="nideshopAdPosition.width.label" default="Width" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="width" type="number" value="${nideshopAdPositionInstance.width}" required=""/>

</div>

