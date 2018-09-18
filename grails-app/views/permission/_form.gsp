<%@ page import="nideshop.Permission" %>



<div class="fieldcontain ${hasErrors(bean: permissionInstance, field: 'permission', 'error')} required">
	<label for="permission">
		<g:message code="permission.permission.label" default="Permission" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="permission" required="" value="${permissionInstance?.permission}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: permissionInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="permission.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${nideshop.SysUser.list()}" optionKey="id" required="" value="${permissionInstance?.user?.id}" class="many-to-one"/>

</div>

