<%@ page import="nideshop.NideshopTopic" %>



<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'content', 'error')} ">
	<label for="content">
		<g:message code="nideshopTopic.content.label" default="Content" />
		
	</label>
	<g:textArea name="content" cols="40" rows="5" maxlength="8000" value="${nideshopTopicInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'avatar', 'error')} required">
	<label for="avatar">
		<g:message code="nideshopTopic.avatar.label" default="Avatar" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="avatar" required="" value="${nideshopTopicInstance?.avatar}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'isShow', 'error')} required">
	<label for="isShow">
		<g:message code="nideshopTopic.isShow.label" default="Is Show" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isShow" type="number" value="${nideshopTopicInstance.isShow}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'itemPicUrl', 'error')} required">
	<label for="itemPicUrl">
		<g:message code="nideshopTopic.itemPicUrl.label" default="Item Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="itemPicUrl" required="" value="${nideshopTopicInstance?.itemPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'priceInfo', 'error')} required">
	<label for="priceInfo">
		<g:message code="nideshopTopic.priceInfo.label" default="Price Info" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="priceInfo" value="${fieldValue(bean: nideshopTopicInstance, field: 'priceInfo')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'readCount', 'error')} required">
	<label for="readCount">
		<g:message code="nideshopTopic.readCount.label" default="Read Count" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="readCount" required="" value="${nideshopTopicInstance?.readCount}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'scenePicUrl', 'error')} required">
	<label for="scenePicUrl">
		<g:message code="nideshopTopic.scenePicUrl.label" default="Scene Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="scenePicUrl" required="" value="${nideshopTopicInstance?.scenePicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopTopic.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopTopicInstance.sortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'subtitle', 'error')} required">
	<label for="subtitle">
		<g:message code="nideshopTopic.subtitle.label" default="Subtitle" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="subtitle" required="" value="${nideshopTopicInstance?.subtitle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="nideshopTopic.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${nideshopTopicInstance?.title}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'topicCategoryId', 'error')} required">
	<label for="topicCategoryId">
		<g:message code="nideshopTopic.topicCategoryId.label" default="Topic Category Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="topicCategoryId" name="topicCategoryId.id" from="${nideshop.NideshopTopicCategory.list()}" optionKey="id" required="" value="${nideshopTopicInstance?.topicCategoryId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'topicTagId', 'error')} required">
	<label for="topicTagId">
		<g:message code="nideshopTopic.topicTagId.label" default="Topic Tag Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="topicTagId" type="number" value="${nideshopTopicInstance.topicTagId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicInstance, field: 'topicTemplateId', 'error')} required">
	<label for="topicTemplateId">
		<g:message code="nideshopTopic.topicTemplateId.label" default="Topic Template Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="topicTemplateId" type="number" value="${nideshopTopicInstance.topicTemplateId}" required=""/>

</div>

