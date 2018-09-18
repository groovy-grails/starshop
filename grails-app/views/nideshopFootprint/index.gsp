
<%@ page import="nideshop.NideshopFootprint" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopFootprint.label', default: 'NideshopFootprint')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopFootprint" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopFootprint" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addTime" title="${message(code: 'nideshopFootprint.addTime.label', default: 'Add Time')}" />
					
						<th><g:message code="nideshopFootprint.goodsId.label" default="Goods Id" /></th>
					
						<th><g:message code="nideshopFootprint.userId.label" default="User Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopFootprintInstanceList}" status="i" var="nideshopFootprintInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopFootprintInstance.id}">${fieldValue(bean: nideshopFootprintInstance, field: "addTime")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopFootprintInstance, field: "goodsId")}</td>
					
						<td>${fieldValue(bean: nideshopFootprintInstance, field: "userId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopFootprintInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
