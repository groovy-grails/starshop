
<%@ page import="nideshop.NideshopKeywords" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopKeywords.label', default: 'NideshopKeywords')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopKeywords" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopKeywords" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="keyword" title="${message(code: 'nideshopKeywords.keyword.label', default: 'Keyword')}" />
					
						<g:sortableColumn property="isDefault" title="${message(code: 'nideshopKeywords.isDefault.label', default: 'Is Default')}" />
					
						<g:sortableColumn property="isHot" title="${message(code: 'nideshopKeywords.isHot.label', default: 'Is Hot')}" />
					
						<g:sortableColumn property="isShow" title="${message(code: 'nideshopKeywords.isShow.label', default: 'Is Show')}" />
					
						<g:sortableColumn property="schemeUrl" title="${message(code: 'nideshopKeywords.schemeUrl.label', default: 'Scheme Url')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopKeywords.sortOrder.label', default: 'Sort Order')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopKeywordsInstanceList}" status="i" var="nideshopKeywordsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopKeywordsInstance.id}">${fieldValue(bean: nideshopKeywordsInstance, field: "keyword")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopKeywordsInstance, field: "isDefault")}</td>
					
						<td>${fieldValue(bean: nideshopKeywordsInstance, field: "isHot")}</td>
					
						<td>${fieldValue(bean: nideshopKeywordsInstance, field: "isShow")}</td>
					
						<td>${fieldValue(bean: nideshopKeywordsInstance, field: "schemeUrl")}</td>
					
						<td>${fieldValue(bean: nideshopKeywordsInstance, field: "sortOrder")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopKeywordsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
