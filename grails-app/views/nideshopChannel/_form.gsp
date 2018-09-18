<%@ page import="nideshop.NideshopChannel" %>



<div class="fieldcontain ${hasErrors(bean: nideshopChannelInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopChannel.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="45" required="" value="${nideshopChannelInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopChannelInstance, field: 'iconUrl', 'error')} required">
	<label for="iconUrl">
		<g:message code="nideshopChannel.iconUrl.label" default="Icon Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="iconUrl" required="" value="${nideshopChannelInstance?.iconUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopChannelInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopChannel.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopChannelInstance.sortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopChannelInstance, field: 'url', 'error')} required">
	<label for="url">
		<g:message code="nideshopChannel.url.label" default="Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="url" required="" value="${nideshopChannelInstance?.url}"/>

</div>

