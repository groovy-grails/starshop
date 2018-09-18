
<%@ page import="nideshop.SysUserSysRole" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'sysUserSysRole.label', default: 'SysUserSysRole')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-sysUserSysRole" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-sysUserSysRole" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list sysUserSysRole">
			
				<g:if test="${sysUserSysRoleInstance?.sysRole}">
				<li class="fieldcontain">
					<span id="sysRole-label" class="property-label"><g:message code="sysUserSysRole.sysRole.label" default="Sys Role" /></span>
					
						<span class="property-value" aria-labelledby="sysRole-label"><g:link controller="sysRole" action="show" id="${sysUserSysRoleInstance?.sysRole?.id}">${sysUserSysRoleInstance?.sysRole?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${sysUserSysRoleInstance?.sysUser}">
				<li class="fieldcontain">
					<span id="sysUser-label" class="property-label"><g:message code="sysUserSysRole.sysUser.label" default="Sys User" /></span>
					
						<span class="property-value" aria-labelledby="sysUser-label"><g:link controller="sysUser" action="show" id="${sysUserSysRoleInstance?.sysUser?.id}">${sysUserSysRoleInstance?.sysUser?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:sysUserSysRoleInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${sysUserSysRoleInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
