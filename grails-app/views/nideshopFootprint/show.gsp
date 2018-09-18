
<%@ page import="nideshop.NideshopFootprint" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopFootprint.label', default: 'NideshopFootprint')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopFootprint" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopFootprint" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopFootprint">
			
				<g:if test="${nideshopFootprintInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopFootprint.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopFootprintInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFootprintInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopFootprint.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopFootprintInstance?.goodsId?.id}">${nideshopFootprintInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFootprintInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopFootprint.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopFootprintInstance?.userId?.id}">${nideshopFootprintInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopFootprintInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopFootprintInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
