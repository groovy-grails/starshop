
<%@ page import="nideshop.NideshopOrderExpress" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrderExpress.label', default: 'NideshopOrderExpress')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopOrderExpress" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopOrderExpress" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="shipperName" title="${message(code: 'nideshopOrderExpress.shipperName.label', default: 'Shipper Name')}" />
					
						<g:sortableColumn property="shipperCode" title="${message(code: 'nideshopOrderExpress.shipperCode.label', default: 'Shipper Code')}" />
					
						<g:sortableColumn property="logisticCode" title="${message(code: 'nideshopOrderExpress.logisticCode.label', default: 'Logistic Code')}" />
					
						<g:sortableColumn property="traces" title="${message(code: 'nideshopOrderExpress.traces.label', default: 'Traces')}" />
					
						<g:sortableColumn property="requestCount" title="${message(code: 'nideshopOrderExpress.requestCount.label', default: 'Request Count')}" />
					
						<g:sortableColumn property="requestTime" title="${message(code: 'nideshopOrderExpress.requestTime.label', default: 'Request Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopOrderExpressInstanceList}" status="i" var="nideshopOrderExpressInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopOrderExpressInstance.id}">${fieldValue(bean: nideshopOrderExpressInstance, field: "shipperName")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopOrderExpressInstance, field: "shipperCode")}</td>
					
						<td>${fieldValue(bean: nideshopOrderExpressInstance, field: "logisticCode")}</td>
					
						<td>${fieldValue(bean: nideshopOrderExpressInstance, field: "traces")}</td>
					
						<td>${fieldValue(bean: nideshopOrderExpressInstance, field: "requestCount")}</td>
					
						<td>${fieldValue(bean: nideshopOrderExpressInstance, field: "requestTime")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopOrderExpressInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
