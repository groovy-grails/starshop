
<%@ page import="nideshop.NideshopTopicCategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopTopicCategory.label', default: 'NideshopTopicCategory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopTopicCategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopTopicCategory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="picUrl" title="${message(code: 'nideshopTopicCategory.picUrl.label', default: 'Pic Url')}" />
					
						<g:sortableColumn property="title" title="${message(code: 'nideshopTopicCategory.title.label', default: 'Title')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopTopicCategoryInstanceList}" status="i" var="nideshopTopicCategoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopTopicCategoryInstance.id}">${fieldValue(bean: nideshopTopicCategoryInstance, field: "picUrl")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopTopicCategoryInstance, field: "title")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopTopicCategoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
