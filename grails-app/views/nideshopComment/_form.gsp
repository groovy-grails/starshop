<%@ page import="nideshop.NideshopComment" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="nideshopComment.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="content" cols="40" rows="5" maxlength="8000" required="" value="${nideshopCommentInstance?.content}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'newContent', 'error')} required">
	<label for="newContent">
		<g:message code="nideshopComment.newContent.label" default="New Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="newContent" cols="40" rows="5" maxlength="8000" required="" value="${nideshopCommentInstance?.newContent}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopComment.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopCommentInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="nideshopComment.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="status" type="number" value="${nideshopCommentInstance.status}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'typeId', 'error')} required">
	<label for="typeId">
		<g:message code="nideshopComment.typeId.label" default="Type Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="typeId" type="number" value="${nideshopCommentInstance.typeId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopComment.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopCommentInstance?.userId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentInstance, field: 'valueId', 'error')} required">
	<label for="valueId">
		<g:message code="nideshopComment.valueId.label" default="Value Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="valueId" name="valueId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopCommentInstance?.valueId?.id}" class="many-to-one"/>

</div>

