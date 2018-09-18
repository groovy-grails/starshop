
<%@ page import="nideshop.NideshopOrderExpress" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrderExpress.label', default: 'NideshopOrderExpress')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopOrderExpress" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopOrderExpress" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopOrderExpress">
			
				<g:if test="${nideshopOrderExpressInstance?.shipperName}">
				<li class="fieldcontain">
					<span id="shipperName-label" class="property-label"><g:message code="nideshopOrderExpress.shipperName.label" default="Shipper Name" /></span>
					
						<span class="property-value" aria-labelledby="shipperName-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="shipperName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.shipperCode}">
				<li class="fieldcontain">
					<span id="shipperCode-label" class="property-label"><g:message code="nideshopOrderExpress.shipperCode.label" default="Shipper Code" /></span>
					
						<span class="property-value" aria-labelledby="shipperCode-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="shipperCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.logisticCode}">
				<li class="fieldcontain">
					<span id="logisticCode-label" class="property-label"><g:message code="nideshopOrderExpress.logisticCode.label" default="Logistic Code" /></span>
					
						<span class="property-value" aria-labelledby="logisticCode-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="logisticCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.traces}">
				<li class="fieldcontain">
					<span id="traces-label" class="property-label"><g:message code="nideshopOrderExpress.traces.label" default="Traces" /></span>
					
						<span class="property-value" aria-labelledby="traces-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="traces"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.requestCount}">
				<li class="fieldcontain">
					<span id="requestCount-label" class="property-label"><g:message code="nideshopOrderExpress.requestCount.label" default="Request Count" /></span>
					
						<span class="property-value" aria-labelledby="requestCount-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="requestCount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.requestTime}">
				<li class="fieldcontain">
					<span id="requestTime-label" class="property-label"><g:message code="nideshopOrderExpress.requestTime.label" default="Request Time" /></span>
					
						<span class="property-value" aria-labelledby="requestTime-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="requestTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopOrderExpress.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.isFinish}">
				<li class="fieldcontain">
					<span id="isFinish-label" class="property-label"><g:message code="nideshopOrderExpress.isFinish.label" default="Is Finish" /></span>
					
						<span class="property-value" aria-labelledby="isFinish-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="isFinish"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.orderId}">
				<li class="fieldcontain">
					<span id="orderId-label" class="property-label"><g:message code="nideshopOrderExpress.orderId.label" default="Order Id" /></span>
					
						<span class="property-value" aria-labelledby="orderId-label"><g:link controller="nideshopOrder" action="show" id="${nideshopOrderExpressInstance?.orderId?.id}">${nideshopOrderExpressInstance?.orderId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.shipperId}">
				<li class="fieldcontain">
					<span id="shipperId-label" class="property-label"><g:message code="nideshopOrderExpress.shipperId.label" default="Shipper Id" /></span>
					
						<span class="property-value" aria-labelledby="shipperId-label"><g:link controller="nideshopShipper" action="show" id="${nideshopOrderExpressInstance?.shipperId?.id}">${nideshopOrderExpressInstance?.shipperId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderExpressInstance?.updateTime}">
				<li class="fieldcontain">
					<span id="updateTime-label" class="property-label"><g:message code="nideshopOrderExpress.updateTime.label" default="Update Time" /></span>
					
						<span class="property-value" aria-labelledby="updateTime-label"><g:fieldValue bean="${nideshopOrderExpressInstance}" field="updateTime"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopOrderExpressInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopOrderExpressInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
