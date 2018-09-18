
<%@ page import="nideshop.NideshopAdPosition" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAdPosition.label', default: 'NideshopAdPosition')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopAdPosition" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopAdPosition" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopAdPosition">
			
				<g:if test="${nideshopAdPositionInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopAdPosition.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopAdPositionInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdPositionInstance?.desc}">
				<li class="fieldcontain">
					<span id="desc-label" class="property-label"><g:message code="nideshopAdPosition.desc.label" default="Desc" /></span>
					
						<span class="property-value" aria-labelledby="desc-label"><g:fieldValue bean="${nideshopAdPositionInstance}" field="desc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdPositionInstance?.height}">
				<li class="fieldcontain">
					<span id="height-label" class="property-label"><g:message code="nideshopAdPosition.height.label" default="Height" /></span>
					
						<span class="property-value" aria-labelledby="height-label"><g:fieldValue bean="${nideshopAdPositionInstance}" field="height"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdPositionInstance?.width}">
				<li class="fieldcontain">
					<span id="width-label" class="property-label"><g:message code="nideshopAdPosition.width.label" default="Width" /></span>
					
						<span class="property-value" aria-labelledby="width-label"><g:fieldValue bean="${nideshopAdPositionInstance}" field="width"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopAdPositionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopAdPositionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
