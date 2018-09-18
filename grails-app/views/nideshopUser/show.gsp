
<%@ page import="nideshop.NideshopUser" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopUser.label', default: 'NideshopUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopUser">
			
				<g:if test="${nideshopUserInstance?.username}">
				<li class="fieldcontain">
					<span id="username-label" class="property-label"><g:message code="nideshopUser.username.label" default="Username" /></span>
					
						<span class="property-value" aria-labelledby="username-label"><g:fieldValue bean="${nideshopUserInstance}" field="username"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="nideshopUser.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${nideshopUserInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.lastLoginIp}">
				<li class="fieldcontain">
					<span id="lastLoginIp-label" class="property-label"><g:message code="nideshopUser.lastLoginIp.label" default="Last Login Ip" /></span>
					
						<span class="property-value" aria-labelledby="lastLoginIp-label"><g:fieldValue bean="${nideshopUserInstance}" field="lastLoginIp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.nickname}">
				<li class="fieldcontain">
					<span id="nickname-label" class="property-label"><g:message code="nideshopUser.nickname.label" default="Nickname" /></span>
					
						<span class="property-value" aria-labelledby="nickname-label"><g:fieldValue bean="${nideshopUserInstance}" field="nickname"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.mobile}">
				<li class="fieldcontain">
					<span id="mobile-label" class="property-label"><g:message code="nideshopUser.mobile.label" default="Mobile" /></span>
					
						<span class="property-value" aria-labelledby="mobile-label"><g:fieldValue bean="${nideshopUserInstance}" field="mobile"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.registerIp}">
				<li class="fieldcontain">
					<span id="registerIp-label" class="property-label"><g:message code="nideshopUser.registerIp.label" default="Register Ip" /></span>
					
						<span class="property-value" aria-labelledby="registerIp-label"><g:fieldValue bean="${nideshopUserInstance}" field="registerIp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.weixinOpenid}">
				<li class="fieldcontain">
					<span id="weixinOpenid-label" class="property-label"><g:message code="nideshopUser.weixinOpenid.label" default="Weixin Openid" /></span>
					
						<span class="property-value" aria-labelledby="weixinOpenid-label"><g:fieldValue bean="${nideshopUserInstance}" field="weixinOpenid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.avatar}">
				<li class="fieldcontain">
					<span id="avatar-label" class="property-label"><g:message code="nideshopUser.avatar.label" default="Avatar" /></span>
					
						<span class="property-value" aria-labelledby="avatar-label"><g:fieldValue bean="${nideshopUserInstance}" field="avatar"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.birthday}">
				<li class="fieldcontain">
					<span id="birthday-label" class="property-label"><g:message code="nideshopUser.birthday.label" default="Birthday" /></span>
					
						<span class="property-value" aria-labelledby="birthday-label"><g:fieldValue bean="${nideshopUserInstance}" field="birthday"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="nideshopUser.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${nideshopUserInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.lastLoginTime}">
				<li class="fieldcontain">
					<span id="lastLoginTime-label" class="property-label"><g:message code="nideshopUser.lastLoginTime.label" default="Last Login Time" /></span>
					
						<span class="property-value" aria-labelledby="lastLoginTime-label"><g:fieldValue bean="${nideshopUserInstance}" field="lastLoginTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.registerTime}">
				<li class="fieldcontain">
					<span id="registerTime-label" class="property-label"><g:message code="nideshopUser.registerTime.label" default="Register Time" /></span>
					
						<span class="property-value" aria-labelledby="registerTime-label"><g:fieldValue bean="${nideshopUserInstance}" field="registerTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserInstance?.userLevelId}">
				<li class="fieldcontain">
					<span id="userLevelId-label" class="property-label"><g:message code="nideshopUser.userLevelId.label" default="User Level Id" /></span>
					
						<span class="property-value" aria-labelledby="userLevelId-label"><g:link controller="nideshopUserLevel" action="show" id="${nideshopUserInstance?.userLevelId?.id}">${nideshopUserInstance?.userLevelId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopUserInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopUserInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
