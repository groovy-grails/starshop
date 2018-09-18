<%@ page import="nideshop.NideshopCommentPicture" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCommentPictureInstance, field: 'commentId', 'error')} required">
	<label for="commentId">
		<g:message code="nideshopCommentPicture.commentId.label" default="Comment Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="commentId" name="commentId.id" from="${nideshop.NideshopComment.list()}" optionKey="id" required="" value="${nideshopCommentPictureInstance?.commentId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentPictureInstance, field: 'picUrl', 'error')} required">
	<label for="picUrl">
		<g:message code="nideshopCommentPicture.picUrl.label" default="Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="picUrl" required="" value="${nideshopCommentPictureInstance?.picUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCommentPictureInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopCommentPicture.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopCommentPictureInstance.sortOrder}" required=""/>

</div>

