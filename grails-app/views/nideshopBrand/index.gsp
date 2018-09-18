
<%@ page import="nideshop.NideshopBrand" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopBrand.label', default: 'NideshopBrand')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopBrand" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopBrand" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="appListPicUrl" title="${message(code: 'nideshopBrand.appListPicUrl.label', default: 'App List Pic Url')}" />
					
						<g:sortableColumn property="floorPrice" title="${message(code: 'nideshopBrand.floorPrice.label', default: 'Floor Price')}" />
					
						<g:sortableColumn property="isNew" title="${message(code: 'nideshopBrand.isNew.label', default: 'Is New')}" />
					
						<g:sortableColumn property="isShow" title="${message(code: 'nideshopBrand.isShow.label', default: 'Is Show')}" />
					
						<g:sortableColumn property="listPicUrl" title="${message(code: 'nideshopBrand.listPicUrl.label', default: 'List Pic Url')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopBrand.name.label', default: 'Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopBrandInstanceList}" status="i" var="nideshopBrandInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopBrandInstance.id}">${fieldValue(bean: nideshopBrandInstance, field: "appListPicUrl")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopBrandInstance, field: "floorPrice")}</td>
					
						<td><g:formatBoolean boolean="${nideshopBrandInstance.isNew}" /></td>
					
						<td><g:formatBoolean boolean="${nideshopBrandInstance.isShow}" /></td>
					
						<td>${fieldValue(bean: nideshopBrandInstance, field: "listPicUrl")}</td>
					
						<td>${fieldValue(bean: nideshopBrandInstance, field: "name")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopBrandInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
