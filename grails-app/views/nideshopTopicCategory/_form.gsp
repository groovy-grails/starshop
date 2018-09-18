<%@ page import="nideshop.NideshopTopicCategory" %>



<div class="fieldcontain ${hasErrors(bean: nideshopTopicCategoryInstance, field: 'picUrl', 'error')} required">
	<label for="picUrl">
		<g:message code="nideshopTopicCategory.picUrl.label" default="Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="picUrl" required="" value="${nideshopTopicCategoryInstance?.picUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopTopicCategoryInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="nideshopTopicCategory.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${nideshopTopicCategoryInstance?.title}"/>

</div>

