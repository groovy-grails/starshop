
<%@ page import="nideshop.NideshopComment" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopComment.label', default: 'NideshopComment')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopComment" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopComment" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopComment">
			
				<g:if test="${nideshopCommentInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="nideshopComment.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${nideshopCommentInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.newContent}">
				<li class="fieldcontain">
					<span id="newContent-label" class="property-label"><g:message code="nideshopComment.newContent.label" default="New Content" /></span>
					
						<span class="property-value" aria-labelledby="newContent-label"><g:fieldValue bean="${nideshopCommentInstance}" field="newContent"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopComment.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopCommentInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="nideshopComment.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${nideshopCommentInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.typeId}">
				<li class="fieldcontain">
					<span id="typeId-label" class="property-label"><g:message code="nideshopComment.typeId.label" default="Type Id" /></span>
					
						<span class="property-value" aria-labelledby="typeId-label"><g:fieldValue bean="${nideshopCommentInstance}" field="typeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopComment.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopCommentInstance?.userId?.id}">${nideshopCommentInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCommentInstance?.valueId}">
				<li class="fieldcontain">
					<span id="valueId-label" class="property-label"><g:message code="nideshopComment.valueId.label" default="Value Id" /></span>
					
						<span class="property-value" aria-labelledby="valueId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopCommentInstance?.valueId?.id}">${nideshopCommentInstance?.valueId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCommentInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCommentInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
