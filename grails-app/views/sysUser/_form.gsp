<%@ page import="nideshop.SysUser" %>



<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="sysUser.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${sysUserInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="sysUser.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${sysUserInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'accountExpired', 'error')} ">
	<label for="accountExpired">
		<g:message code="sysUser.accountExpired.label" default="Account Expired" />
		
	</label>
	<g:checkBox name="accountExpired" value="${sysUserInstance?.accountExpired}" />

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'accountLocked', 'error')} ">
	<label for="accountLocked">
		<g:message code="sysUser.accountLocked.label" default="Account Locked" />
		
	</label>
	<g:checkBox name="accountLocked" value="${sysUserInstance?.accountLocked}" />

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'enabled', 'error')} ">
	<label for="enabled">
		<g:message code="sysUser.enabled.label" default="Enabled" />
		
	</label>
	<g:checkBox name="enabled" value="${sysUserInstance?.enabled}" />

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserInstance, field: 'passwordExpired', 'error')} ">
	<label for="passwordExpired">
		<g:message code="sysUser.passwordExpired.label" default="Password Expired" />
		
	</label>
	<g:checkBox name="passwordExpired" value="${sysUserInstance?.passwordExpired}" />

</div>

