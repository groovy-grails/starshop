
<%@ page import="nideshop.NideshopChannel" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopChannel.label', default: 'NideshopChannel')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopChannel" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopChannel" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopChannel.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="iconUrl" title="${message(code: 'nideshopChannel.iconUrl.label', default: 'Icon Url')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopChannel.sortOrder.label', default: 'Sort Order')}" />
					
						<g:sortableColumn property="url" title="${message(code: 'nideshopChannel.url.label', default: 'Url')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopChannelInstanceList}" status="i" var="nideshopChannelInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopChannelInstance.id}">${fieldValue(bean: nideshopChannelInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopChannelInstance, field: "iconUrl")}</td>
					
						<td>${fieldValue(bean: nideshopChannelInstance, field: "sortOrder")}</td>
					
						<td>${fieldValue(bean: nideshopChannelInstance, field: "url")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopChannelInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
