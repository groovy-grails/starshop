
<%@ page import="nideshop.NideshopCommentPicture" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCommentPicture.label', default: 'NideshopCommentPicture')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopCommentPicture" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopCommentPicture" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopCommentPicture">
			
				<g:if test="${nideshopCommentPictureInstance?.commentId}">
				<li class="fieldcontain">
					<span id="commentId-label" class="property-label"><g:message code="nideshopCommentPicture.commentId.label" default="Comment Id" /></span>
					
						<span class="property-value" aria-labelledby="commentId-label"><g:link controller="nideshopComment" action="show" id="${nideshopCommentPictureInstance?.commentId?.id}">${nideshopCommentPictureInstance?.commentId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentPictureInstance?.picUrl}">
				<li class="fieldcontain">
					<span id="picUrl-label" class="property-label"><g:message code="nideshopCommentPicture.picUrl.label" default="Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="picUrl-label"><g:fieldValue bean="${nideshopCommentPictureInstance}" field="picUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentPictureInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopCommentPicture.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopCommentPictureInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCommentPictureInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCommentPictureInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
