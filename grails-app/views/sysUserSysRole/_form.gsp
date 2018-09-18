<%@ page import="nideshop.SysUserSysRole" %>



<div class="fieldcontain ${hasErrors(bean: sysUserSysRoleInstance, field: 'sysRole', 'error')} required">
	<label for="sysRole">
		<g:message code="sysUserSysRole.sysRole.label" default="Sys Role" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="sysRole" name="sysRole.id" from="${nideshop.SysRole.list()}" optionKey="id" required="" value="${sysUserSysRoleInstance?.sysRole?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: sysUserSysRoleInstance, field: 'sysUser', 'error')} required">
	<label for="sysUser">
		<g:message code="sysUserSysRole.sysUser.label" default="Sys User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="sysUser" name="sysUser.id" from="${nideshop.SysUser.list()}" optionKey="id" required="" value="${sysUserSysRoleInstance?.sysUser?.id}" class="many-to-one"/>

</div>

