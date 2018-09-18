
<%@ page import="nideshop.NideshopOrder" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrder.label', default: 'NideshopOrder')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopOrder" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopOrder" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="orderSn" title="${message(code: 'nideshopOrder.orderSn.label', default: 'Order Sn')}" />
					
						<g:sortableColumn property="consignee" title="${message(code: 'nideshopOrder.consignee.label', default: 'Consignee')}" />
					
						<g:sortableColumn property="mobile" title="${message(code: 'nideshopOrder.mobile.label', default: 'Mobile')}" />
					
						<g:sortableColumn property="payName" title="${message(code: 'nideshopOrder.payName.label', default: 'Pay Name')}" />
					
						<g:sortableColumn property="callbackStatus" title="${message(code: 'nideshopOrder.callbackStatus.label', default: 'Callback Status')}" />
					
						<g:sortableColumn property="actualPrice" title="${message(code: 'nideshopOrder.actualPrice.label', default: 'Actual Price')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopOrderInstanceList}" status="i" var="nideshopOrderInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopOrderInstance.id}">${fieldValue(bean: nideshopOrderInstance, field: "orderSn")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopOrderInstance, field: "consignee")}</td>
					
						<td>${fieldValue(bean: nideshopOrderInstance, field: "mobile")}</td>
					
						<td>${fieldValue(bean: nideshopOrderInstance, field: "payName")}</td>
					
						<td>${fieldValue(bean: nideshopOrderInstance, field: "callbackStatus")}</td>
					
						<td>${fieldValue(bean: nideshopOrderInstance, field: "actualPrice")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopOrderInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
