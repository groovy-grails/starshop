<%@ page import="nideshop.SysRole" %>



<div class="fieldcontain ${hasErrors(bean: sysRoleInstance, field: 'authority', 'error')} required">
	<label for="authority">
		<g:message code="sysRole.authority.label" default="Authority" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="authority" required="" value="${sysRoleInstance?.authority}"/>

</div>

