
<%@ page import="nideshop.NideshopCollect" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCollect.label', default: 'NideshopCollect')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopCollect" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopCollect" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopCollect">
			
				<g:if test="${nideshopCollectInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopCollect.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopCollectInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCollectInstance?.isAttention}">
				<li class="fieldcontain">
					<span id="isAttention-label" class="property-label"><g:message code="nideshopCollect.isAttention.label" default="Is Attention" /></span>
					
						<span class="property-value" aria-labelledby="isAttention-label"><g:fieldValue bean="${nideshopCollectInstance}" field="isAttention"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCollectInstance?.typeId}">
				<li class="fieldcontain">
					<span id="typeId-label" class="property-label"><g:message code="nideshopCollect.typeId.label" default="Type Id" /></span>
					
						<span class="property-value" aria-labelledby="typeId-label"><g:fieldValue bean="${nideshopCollectInstance}" field="typeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCollectInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopCollect.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopCollectInstance?.userId?.id}">${nideshopCollectInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCollectInstance?.valueId}">
				<li class="fieldcontain">
					<span id="valueId-label" class="property-label"><g:message code="nideshopCollect.valueId.label" default="Value Id" /></span>
					
						<span class="property-value" aria-labelledby="valueId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopCollectInstance?.valueId?.id}">${nideshopCollectInstance?.valueId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCollectInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCollectInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
