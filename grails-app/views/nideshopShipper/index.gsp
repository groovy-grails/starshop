
<%@ page import="nideshop.NideshopShipper" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopShipper.label', default: 'NideshopShipper')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopShipper" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopShipper" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopShipper.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="code" title="${message(code: 'nideshopShipper.code.label', default: 'Code')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopShipper.sortOrder.label', default: 'Sort Order')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopShipperInstanceList}" status="i" var="nideshopShipperInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopShipperInstance.id}">${fieldValue(bean: nideshopShipperInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopShipperInstance, field: "code")}</td>
					
						<td>${fieldValue(bean: nideshopShipperInstance, field: "sortOrder")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopShipperInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
