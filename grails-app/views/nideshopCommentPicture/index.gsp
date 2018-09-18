
<%@ page import="nideshop.NideshopCommentPicture" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCommentPicture.label', default: 'NideshopCommentPicture')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopCommentPicture" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopCommentPicture" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="nideshopCommentPicture.commentId.label" default="Comment Id" /></th>
					
						<g:sortableColumn property="picUrl" title="${message(code: 'nideshopCommentPicture.picUrl.label', default: 'Pic Url')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopCommentPicture.sortOrder.label', default: 'Sort Order')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCommentPictureInstanceList}" status="i" var="nideshopCommentPictureInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCommentPictureInstance.id}">${fieldValue(bean: nideshopCommentPictureInstance, field: "commentId")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCommentPictureInstance, field: "picUrl")}</td>
					
						<td>${fieldValue(bean: nideshopCommentPictureInstance, field: "sortOrder")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCommentPictureInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
