
<%@ page import="nideshop.NideshopAdmin" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAdmin.label', default: 'NideshopAdmin')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopAdmin" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopAdmin" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopAdmin">
			
				<g:if test="${nideshopAdminInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="nideshopAdmin.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${nideshopAdminInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.lastLoginIp}">
				<li class="fieldcontain">
					<span id="lastLoginIp-label" class="property-label"><g:message code="nideshopAdmin.lastLoginIp.label" default="Last Login Ip" /></span>
					
						<span class="property-value" aria-labelledby="lastLoginIp-label"><g:fieldValue bean="${nideshopAdminInstance}" field="lastLoginIp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopAdmin.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopAdminInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.adminRoleId}">
				<li class="fieldcontain">
					<span id="adminRoleId-label" class="property-label"><g:message code="nideshopAdmin.adminRoleId.label" default="Admin Role Id" /></span>
					
						<span class="property-value" aria-labelledby="adminRoleId-label"><g:fieldValue bean="${nideshopAdminInstance}" field="adminRoleId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.avatar}">
				<li class="fieldcontain">
					<span id="avatar-label" class="property-label"><g:message code="nideshopAdmin.avatar.label" default="Avatar" /></span>
					
						<span class="property-value" aria-labelledby="avatar-label"><g:fieldValue bean="${nideshopAdminInstance}" field="avatar"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.lastLoginTime}">
				<li class="fieldcontain">
					<span id="lastLoginTime-label" class="property-label"><g:message code="nideshopAdmin.lastLoginTime.label" default="Last Login Time" /></span>
					
						<span class="property-value" aria-labelledby="lastLoginTime-label"><g:fieldValue bean="${nideshopAdminInstance}" field="lastLoginTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="nideshopAdmin.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${nideshopAdminInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.passwordSalt}">
				<li class="fieldcontain">
					<span id="passwordSalt-label" class="property-label"><g:message code="nideshopAdmin.passwordSalt.label" default="Password Salt" /></span>
					
						<span class="property-value" aria-labelledby="passwordSalt-label"><g:fieldValue bean="${nideshopAdminInstance}" field="passwordSalt"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAdminInstance?.updateTime}">
				<li class="fieldcontain">
					<span id="updateTime-label" class="property-label"><g:message code="nideshopAdmin.updateTime.label" default="Update Time" /></span>
					
						<span class="property-value" aria-labelledby="updateTime-label"><g:fieldValue bean="${nideshopAdminInstance}" field="updateTime"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopAdminInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopAdminInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
