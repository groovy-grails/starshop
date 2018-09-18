
<%@ page import="nideshop.SysUser" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'sysUser.label', default: 'SysUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-sysUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-sysUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="username" title="${message(code: 'sysUser.username.label', default: 'Username')}" />
					
						<g:sortableColumn property="password" title="${message(code: 'sysUser.password.label', default: 'Password')}" />
					
						<g:sortableColumn property="accountExpired" title="${message(code: 'sysUser.accountExpired.label', default: 'Account Expired')}" />
					
						<g:sortableColumn property="accountLocked" title="${message(code: 'sysUser.accountLocked.label', default: 'Account Locked')}" />
					
						<g:sortableColumn property="enabled" title="${message(code: 'sysUser.enabled.label', default: 'Enabled')}" />
					
						<g:sortableColumn property="passwordExpired" title="${message(code: 'sysUser.passwordExpired.label', default: 'Password Expired')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${sysUserInstanceList}" status="i" var="sysUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${sysUserInstance.id}">${fieldValue(bean: sysUserInstance, field: "username")}</g:link></td>
					
						<td>${fieldValue(bean: sysUserInstance, field: "password")}</td>
					
						<td><g:formatBoolean boolean="${sysUserInstance.accountExpired}" /></td>
					
						<td><g:formatBoolean boolean="${sysUserInstance.accountLocked}" /></td>
					
						<td><g:formatBoolean boolean="${sysUserInstance.enabled}" /></td>
					
						<td><g:formatBoolean boolean="${sysUserInstance.passwordExpired}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${sysUserInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
