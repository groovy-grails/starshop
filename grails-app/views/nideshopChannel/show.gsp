
<%@ page import="nideshop.NideshopChannel" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopChannel.label', default: 'NideshopChannel')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopChannel" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopChannel" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopChannel">
			
				<g:if test="${nideshopChannelInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopChannel.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopChannelInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopChannelInstance?.iconUrl}">
				<li class="fieldcontain">
					<span id="iconUrl-label" class="property-label"><g:message code="nideshopChannel.iconUrl.label" default="Icon Url" /></span>
					
						<span class="property-value" aria-labelledby="iconUrl-label"><g:fieldValue bean="${nideshopChannelInstance}" field="iconUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopChannelInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopChannel.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopChannelInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopChannelInstance?.url}">
				<li class="fieldcontain">
					<span id="url-label" class="property-label"><g:message code="nideshopChannel.url.label" default="Url" /></span>
					
						<span class="property-value" aria-labelledby="url-label"><g:fieldValue bean="${nideshopChannelInstance}" field="url"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopChannelInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopChannelInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
