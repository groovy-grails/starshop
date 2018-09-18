
<%@ page import="nideshop.NideshopAd" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAd.label', default: 'NideshopAd')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopAd" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopAd" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopAd">
			
				<g:if test="${nideshopAdInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopAd.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopAdInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.imageUrl}">
				<li class="fieldcontain">
					<span id="imageUrl-label" class="property-label"><g:message code="nideshopAd.imageUrl.label" default="Image Url" /></span>
					
						<span class="property-value" aria-labelledby="imageUrl-label"><g:fieldValue bean="${nideshopAdInstance}" field="imageUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.adPositionId}">
				<li class="fieldcontain">
					<span id="adPositionId-label" class="property-label"><g:message code="nideshopAd.adPositionId.label" default="Ad Position Id" /></span>
					
						<span class="property-value" aria-labelledby="adPositionId-label"><g:link controller="nideshopAdPosition" action="show" id="${nideshopAdInstance?.adPositionId?.id}">${nideshopAdInstance?.adPositionId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="nideshopAd.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${nideshopAdInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.enabled}">
				<li class="fieldcontain">
					<span id="enabled-label" class="property-label"><g:message code="nideshopAd.enabled.label" default="Enabled" /></span>
					
						<span class="property-value" aria-labelledby="enabled-label"><g:fieldValue bean="${nideshopAdInstance}" field="enabled"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.endTime}">
				<li class="fieldcontain">
					<span id="endTime-label" class="property-label"><g:message code="nideshopAd.endTime.label" default="End Time" /></span>
					
						<span class="property-value" aria-labelledby="endTime-label"><g:fieldValue bean="${nideshopAdInstance}" field="endTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.link}">
				<li class="fieldcontain">
					<span id="link-label" class="property-label"><g:message code="nideshopAd.link.label" default="Link" /></span>
					
						<span class="property-value" aria-labelledby="link-label"><g:fieldValue bean="${nideshopAdInstance}" field="link"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdInstance?.mediaType}">
				<li class="fieldcontain">
					<span id="mediaType-label" class="property-label"><g:message code="nideshopAd.mediaType.label" default="Media Type" /></span>
					
						<span class="property-value" aria-labelledby="mediaType-label"><g:fieldValue bean="${nideshopAdInstance}" field="mediaType"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopAdInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopAdInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
