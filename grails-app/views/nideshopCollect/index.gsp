
<%@ page import="nideshop.NideshopCollect" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCollect.label', default: 'NideshopCollect')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopCollect" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopCollect" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addTime" title="${message(code: 'nideshopCollect.addTime.label', default: 'Add Time')}" />
					
						<g:sortableColumn property="isAttention" title="${message(code: 'nideshopCollect.isAttention.label', default: 'Is Attention')}" />
					
						<g:sortableColumn property="typeId" title="${message(code: 'nideshopCollect.typeId.label', default: 'Type Id')}" />
					
						<th><g:message code="nideshopCollect.userId.label" default="User Id" /></th>
					
						<th><g:message code="nideshopCollect.valueId.label" default="Value Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCollectInstanceList}" status="i" var="nideshopCollectInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCollectInstance.id}">${fieldValue(bean: nideshopCollectInstance, field: "addTime")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCollectInstance, field: "isAttention")}</td>
					
						<td>${fieldValue(bean: nideshopCollectInstance, field: "typeId")}</td>
					
						<td>${fieldValue(bean: nideshopCollectInstance, field: "userId")}</td>
					
						<td>${fieldValue(bean: nideshopCollectInstance, field: "valueId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCollectInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
