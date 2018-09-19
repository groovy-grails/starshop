
<%@ page import="nideshop.NideshopCategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCategory.label', default: 'NideshopCategory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopCategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopCategory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopCategory.name.label', default: 'Name')}" />
					
						<th><g:message code="nideshopCategory.parentId.label" default="Parent Id" /></th>
					
						<g:sortableColumn property="bannerUrl" title="${message(code: 'nideshopCategory.bannerUrl.label', default: 'Banner Url')}" />
					
						<g:sortableColumn property="frontDesc" title="${message(code: 'nideshopCategory.frontDesc.label', default: 'Front Desc')}" />
					
						<g:sortableColumn property="frontName" title="${message(code: 'nideshopCategory.frontName.label', default: 'Front Name')}" />
					
						<g:sortableColumn property="iconUrl" title="${message(code: 'nideshopCategory.iconUrl.label', default: 'Icon Url')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCategoryInstanceList}" status="i" var="nideshopCategoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCategoryInstance.id}">${fieldValue(bean: nideshopCategoryInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCategoryInstance, field: "parentId")}</td>
					
						<td>${fieldValue(bean: nideshopCategoryInstance, field: "bannerUrl")}</td>
					
						<td>${fieldValue(bean: nideshopCategoryInstance, field: "frontDesc")}</td>
					
						<td>${fieldValue(bean: nideshopCategoryInstance, field: "frontName")}</td>
					
						<td>${fieldValue(bean: nideshopCategoryInstance, field: "iconUrl")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCategoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
