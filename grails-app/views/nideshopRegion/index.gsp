
<%@ page import="nideshop.NideshopRegion" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopRegion.label', default: 'NideshopRegion')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopRegion" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopRegion" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopRegion.name.label', default: 'Name')}" />
					
						<th><g:message code="nideshopRegion.parentId.label" default="Parent Id" /></th>
					
						<g:sortableColumn property="agencyId" title="${message(code: 'nideshopRegion.agencyId.label', default: 'Agency Id')}" />
					
						<g:sortableColumn property="type" title="${message(code: 'nideshopRegion.type.label', default: 'Type')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopRegionInstanceList}" status="i" var="nideshopRegionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopRegionInstance.id}">${fieldValue(bean: nideshopRegionInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopRegionInstance, field: "parentId")}</td>
					
						<td>${fieldValue(bean: nideshopRegionInstance, field: "agencyId")}</td>
					
						<td>${fieldValue(bean: nideshopRegionInstance, field: "type")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopRegionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
