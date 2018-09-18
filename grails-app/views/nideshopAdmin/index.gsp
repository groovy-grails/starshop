
<%@ page import="nideshop.NideshopAdmin" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAdmin.label', default: 'NideshopAdmin')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopAdmin" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopAdmin" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="username" title="${message(code: 'nideshopAdmin.username.label', default: 'Username')}" />
					
						<g:sortableColumn property="lastLoginIp" title="${message(code: 'nideshopAdmin.lastLoginIp.label', default: 'Last Login Ip')}" />
					
						<g:sortableColumn property="addTime" title="${message(code: 'nideshopAdmin.addTime.label', default: 'Add Time')}" />
					
						<g:sortableColumn property="adminRoleId" title="${message(code: 'nideshopAdmin.adminRoleId.label', default: 'Admin Role Id')}" />
					
						<g:sortableColumn property="avatar" title="${message(code: 'nideshopAdmin.avatar.label', default: 'Avatar')}" />
					
						<g:sortableColumn property="lastLoginTime" title="${message(code: 'nideshopAdmin.lastLoginTime.label', default: 'Last Login Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopAdminInstanceList}" status="i" var="nideshopAdminInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopAdminInstance.id}">${fieldValue(bean: nideshopAdminInstance, field: "username")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopAdminInstance, field: "lastLoginIp")}</td>
					
						<td>${fieldValue(bean: nideshopAdminInstance, field: "addTime")}</td>
					
						<td>${fieldValue(bean: nideshopAdminInstance, field: "adminRoleId")}</td>
					
						<td>${fieldValue(bean: nideshopAdminInstance, field: "avatar")}</td>
					
						<td>${fieldValue(bean: nideshopAdminInstance, field: "lastLoginTime")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopAdminInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
