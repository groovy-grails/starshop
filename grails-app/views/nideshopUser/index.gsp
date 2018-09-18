
<%@ page import="nideshop.NideshopUser" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopUser.label', default: 'NideshopUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="username" title="${message(code: 'nideshopUser.username.label', default: 'Username')}" />
					
						<g:sortableColumn property="password" title="${message(code: 'nideshopUser.password.label', default: 'Password')}" />
					
						<g:sortableColumn property="lastLoginIp" title="${message(code: 'nideshopUser.lastLoginIp.label', default: 'Last Login Ip')}" />
					
						<g:sortableColumn property="nickname" title="${message(code: 'nideshopUser.nickname.label', default: 'Nickname')}" />
					
						<g:sortableColumn property="mobile" title="${message(code: 'nideshopUser.mobile.label', default: 'Mobile')}" />
					
						<g:sortableColumn property="registerIp" title="${message(code: 'nideshopUser.registerIp.label', default: 'Register Ip')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopUserInstanceList}" status="i" var="nideshopUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopUserInstance.id}">${fieldValue(bean: nideshopUserInstance, field: "username")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopUserInstance, field: "password")}</td>
					
						<td>${fieldValue(bean: nideshopUserInstance, field: "lastLoginIp")}</td>
					
						<td>${fieldValue(bean: nideshopUserInstance, field: "nickname")}</td>
					
						<td>${fieldValue(bean: nideshopUserInstance, field: "mobile")}</td>
					
						<td>${fieldValue(bean: nideshopUserInstance, field: "registerIp")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopUserInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
