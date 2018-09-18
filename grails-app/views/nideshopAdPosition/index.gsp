
<%@ page import="nideshop.NideshopAdPosition" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAdPosition.label', default: 'NideshopAdPosition')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopAdPosition" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopAdPosition" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopAdPosition.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="desc" title="${message(code: 'nideshopAdPosition.desc.label', default: 'Desc')}" />
					
						<g:sortableColumn property="height" title="${message(code: 'nideshopAdPosition.height.label', default: 'Height')}" />
					
						<g:sortableColumn property="width" title="${message(code: 'nideshopAdPosition.width.label', default: 'Width')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopAdPositionInstanceList}" status="i" var="nideshopAdPositionInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopAdPositionInstance.id}">${fieldValue(bean: nideshopAdPositionInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopAdPositionInstance, field: "desc")}</td>
					
						<td>${fieldValue(bean: nideshopAdPositionInstance, field: "height")}</td>
					
						<td>${fieldValue(bean: nideshopAdPositionInstance, field: "width")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopAdPositionInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
