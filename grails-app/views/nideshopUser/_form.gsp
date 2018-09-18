<%@ page import="nideshop.NideshopUser" %>



<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="nideshopUser.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" maxlength="60" required="" value="${nideshopUserInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="nideshopUser.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" maxlength="32" required="" value="${nideshopUserInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'lastLoginIp', 'error')} required">
	<label for="lastLoginIp">
		<g:message code="nideshopUser.lastLoginIp.label" default="Last Login Ip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastLoginIp" maxlength="15" required="" value="${nideshopUserInstance?.lastLoginIp}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'nickname', 'error')} required">
	<label for="nickname">
		<g:message code="nideshopUser.nickname.label" default="Nickname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nickname" maxlength="60" required="" value="${nideshopUserInstance?.nickname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'mobile', 'error')} required">
	<label for="mobile">
		<g:message code="nideshopUser.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mobile" maxlength="20" required="" value="${nideshopUserInstance?.mobile}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'registerIp', 'error')} required">
	<label for="registerIp">
		<g:message code="nideshopUser.registerIp.label" default="Register Ip" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="registerIp" maxlength="45" required="" value="${nideshopUserInstance?.registerIp}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'weixinOpenid', 'error')} required">
	<label for="weixinOpenid">
		<g:message code="nideshopUser.weixinOpenid.label" default="Weixin Openid" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="weixinOpenid" maxlength="50" required="" value="${nideshopUserInstance?.weixinOpenid}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'avatar', 'error')} required">
	<label for="avatar">
		<g:message code="nideshopUser.avatar.label" default="Avatar" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="avatar" required="" value="${nideshopUserInstance?.avatar}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'birthday', 'error')} required">
	<label for="birthday">
		<g:message code="nideshopUser.birthday.label" default="Birthday" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="birthday" type="number" value="${nideshopUserInstance.birthday}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="nideshopUser.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="gender" type="number" value="${nideshopUserInstance.gender}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'lastLoginTime', 'error')} required">
	<label for="lastLoginTime">
		<g:message code="nideshopUser.lastLoginTime.label" default="Last Login Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lastLoginTime" type="number" value="${nideshopUserInstance.lastLoginTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'registerTime', 'error')} required">
	<label for="registerTime">
		<g:message code="nideshopUser.registerTime.label" default="Register Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="registerTime" type="number" value="${nideshopUserInstance.registerTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserInstance, field: 'userLevelId', 'error')} required">
	<label for="userLevelId">
		<g:message code="nideshopUser.userLevelId.label" default="User Level Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userLevelId" name="userLevelId.id" from="${nideshop.NideshopUserLevel.list()}" optionKey="id" required="" value="${nideshopUserInstance?.userLevelId?.id}" class="many-to-one"/>

</div>

