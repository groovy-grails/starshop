
<%@ page import="nideshop.NideshopSearchHistory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopSearchHistory.label', default: 'NideshopSearchHistory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopSearchHistory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopSearchHistory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="keyword" title="${message(code: 'nideshopSearchHistory.keyword.label', default: 'Keyword')}" />
					
						<g:sortableColumn property="from" title="${message(code: 'nideshopSearchHistory.from.label', default: 'From')}" />
					
						<g:sortableColumn property="userId" title="${message(code: 'nideshopSearchHistory.userId.label', default: 'User Id')}" />
					
						<g:sortableColumn property="addTime" title="${message(code: 'nideshopSearchHistory.addTime.label', default: 'Add Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopSearchHistoryInstanceList}" status="i" var="nideshopSearchHistoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopSearchHistoryInstance.id}">${fieldValue(bean: nideshopSearchHistoryInstance, field: "keyword")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopSearchHistoryInstance, field: "from")}</td>
					
						<td>${fieldValue(bean: nideshopSearchHistoryInstance, field: "userId")}</td>
					
						<td>${fieldValue(bean: nideshopSearchHistoryInstance, field: "addTime")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopSearchHistoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
