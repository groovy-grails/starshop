
<%@ page import="nideshop.NideshopComment" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopComment.label', default: 'NideshopComment')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopComment" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopComment" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="content" title="${message(code: 'nideshopComment.content.label', default: 'Content')}" />
					
						<g:sortableColumn property="newContent" title="${message(code: 'nideshopComment.newContent.label', default: 'New Content')}" />
					
						<g:sortableColumn property="addTime" title="${message(code: 'nideshopComment.addTime.label', default: 'Add Time')}" />
					
						<g:sortableColumn property="status" title="${message(code: 'nideshopComment.status.label', default: 'Status')}" />
					
						<g:sortableColumn property="typeId" title="${message(code: 'nideshopComment.typeId.label', default: 'Type Id')}" />
					
						<th><g:message code="nideshopComment.userId.label" default="User Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCommentInstanceList}" status="i" var="nideshopCommentInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCommentInstance.id}">${fieldValue(bean: nideshopCommentInstance, field: "content")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCommentInstance, field: "newContent")}</td>
					
						<td>${fieldValue(bean: nideshopCommentInstance, field: "addTime")}</td>
					
						<td>${fieldValue(bean: nideshopCommentInstance, field: "status")}</td>
					
						<td>${fieldValue(bean: nideshopCommentInstance, field: "typeId")}</td>
					
						<td>${fieldValue(bean: nideshopCommentInstance, field: "userId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCommentInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
