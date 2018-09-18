<%@ page import="nideshop.NideshopAdmin" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="nideshopAdmin.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" maxlength="10" required="" value="${nideshopAdminInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'lastLoginIp', 'error')} required">
	<label for="lastLoginIp">
		<g:message code="nideshopAdmin.lastLoginIp.label" default="Last Login Ip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastLoginIp" maxlength="60" required="" value="${nideshopAdminInstance?.lastLoginIp}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopAdmin.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopAdminInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'adminRoleId', 'error')} required">
	<label for="adminRoleId">
		<g:message code="nideshopAdmin.adminRoleId.label" default="Admin Role Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="adminRoleId" type="number" value="${nideshopAdminInstance.adminRoleId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'avatar', 'error')} required">
	<label for="avatar">
		<g:message code="nideshopAdmin.avatar.label" default="Avatar" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="avatar" required="" value="${nideshopAdminInstance?.avatar}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'lastLoginTime', 'error')} required">
	<label for="lastLoginTime">
		<g:message code="nideshopAdmin.lastLoginTime.label" default="Last Login Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lastLoginTime" type="number" value="${nideshopAdminInstance.lastLoginTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="nideshopAdmin.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${nideshopAdminInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'passwordSalt', 'error')} required">
	<label for="passwordSalt">
		<g:message code="nideshopAdmin.passwordSalt.label" default="Password Salt" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="passwordSalt" required="" value="${nideshopAdminInstance?.passwordSalt}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAdminInstance, field: 'updateTime', 'error')} required">
	<label for="updateTime">
		<g:message code="nideshopAdmin.updateTime.label" default="Update Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="updateTime" type="number" value="${nideshopAdminInstance.updateTime}" required=""/>

</div>

