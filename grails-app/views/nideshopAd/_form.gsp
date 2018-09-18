<%@ page import="nideshop.NideshopAd" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopAd.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopAdInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'imageUrl', 'error')} required">
	<label for="imageUrl">
		<g:message code="nideshopAd.imageUrl.label" default="Image Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="imageUrl" cols="40" rows="5" maxlength="255" required="" value="${nideshopAdInstance?.imageUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'adPositionId', 'error')} required">
	<label for="adPositionId">
		<g:message code="nideshopAd.adPositionId.label" default="Ad Position Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="adPositionId" name="adPositionId.id" from="${nideshop.NideshopAdPosition.list()}" optionKey="id" required="" value="${nideshopAdInstance?.adPositionId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="nideshopAd.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="content" required="" value="${nideshopAdInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'enabled', 'error')} required">
	<label for="enabled">
		<g:message code="nideshopAd.enabled.label" default="Enabled" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="enabled" type="number" value="${nideshopAdInstance.enabled}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'endTime', 'error')} required">
	<label for="endTime">
		<g:message code="nideshopAd.endTime.label" default="End Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="endTime" type="number" value="${nideshopAdInstance.endTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'link', 'error')} required">
	<label for="link">
		<g:message code="nideshopAd.link.label" default="Link" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="link" required="" value="${nideshopAdInstance?.link}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdInstance, field: 'mediaType', 'error')} required">
	<label for="mediaType">
		<g:message code="nideshopAd.mediaType.label" default="Media Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="mediaType" type="number" value="${nideshopAdInstance.mediaType}" required=""/>

</div>

