
<%@ page import="nideshop.NideshopAttribute" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAttribute.label', default: 'NideshopAttribute')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopAttribute" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopAttribute" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopAttribute.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="values" title="${message(code: 'nideshopAttribute.values.label', default: 'Values')}" />
					
						<th><g:message code="nideshopAttribute.attributeCategoryId.label" default="Attribute Category Id" /></th>
					
						<g:sortableColumn property="inputType" title="${message(code: 'nideshopAttribute.inputType.label', default: 'Input Type')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopAttribute.sortOrder.label', default: 'Sort Order')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopAttributeInstanceList}" status="i" var="nideshopAttributeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopAttributeInstance.id}">${fieldValue(bean: nideshopAttributeInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopAttributeInstance, field: "values")}</td>
					
						<td>${fieldValue(bean: nideshopAttributeInstance, field: "attributeCategoryId")}</td>
					
						<td><g:formatBoolean boolean="${nideshopAttributeInstance.inputType}" /></td>
					
						<td>${fieldValue(bean: nideshopAttributeInstance, field: "sortOrder")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopAttributeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
