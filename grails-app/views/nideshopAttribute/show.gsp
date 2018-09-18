
<%@ page import="nideshop.NideshopAttribute" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAttribute.label', default: 'NideshopAttribute')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopAttribute" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopAttribute" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopAttribute">
			
				<g:if test="${nideshopAttributeInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopAttribute.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopAttributeInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAttributeInstance?.values}">
				<li class="fieldcontain">
					<span id="values-label" class="property-label"><g:message code="nideshopAttribute.values.label" default="Values" /></span>
					
						<span class="property-value" aria-labelledby="values-label"><g:fieldValue bean="${nideshopAttributeInstance}" field="values"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAttributeInstance?.attributeCategoryId}">
				<li class="fieldcontain">
					<span id="attributeCategoryId-label" class="property-label"><g:message code="nideshopAttribute.attributeCategoryId.label" default="Attribute Category Id" /></span>
					
						<span class="property-value" aria-labelledby="attributeCategoryId-label"><g:link controller="nideshopAttributeCategory" action="show" id="${nideshopAttributeInstance?.attributeCategoryId?.id}">${nideshopAttributeInstance?.attributeCategoryId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAttributeInstance?.inputType}">
				<li class="fieldcontain">
					<span id="inputType-label" class="property-label"><g:message code="nideshopAttribute.inputType.label" default="Input Type" /></span>
					
						<span class="property-value" aria-labelledby="inputType-label"><g:formatBoolean boolean="${nideshopAttributeInstance?.inputType}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAttributeInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopAttribute.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopAttributeInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopAttributeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopAttributeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
