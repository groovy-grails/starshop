<%@ page import="nideshop.NideshopFeedback" %>



<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'userName', 'error')} required">
	<label for="userName">
		<g:message code="nideshopFeedback.userName.label" default="User Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userName" maxlength="60" required="" value="${nideshopFeedbackInstance?.userName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'userEmail', 'error')} required">
	<label for="userEmail">
		<g:message code="nideshopFeedback.userEmail.label" default="User Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="userEmail" maxlength="60" required="" value="${nideshopFeedbackInstance?.userEmail}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgTitle', 'error')} required">
	<label for="msgTitle">
		<g:message code="nideshopFeedback.msgTitle.label" default="Msg Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="msgTitle" maxlength="200" required="" value="${nideshopFeedbackInstance?.msgTitle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgContent', 'error')} required">
	<label for="msgContent">
		<g:message code="nideshopFeedback.msgContent.label" default="Msg Content" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="msgContent" cols="40" rows="5" maxlength="8000" required="" value="${nideshopFeedbackInstance?.msgContent}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'parentId', 'error')} ">
	<label for="parentId">
		<g:message code="nideshopFeedback.parentId.label" default="Parent Id" />
		
	</label>
	<g:select id="parentId" name="parentId.id" from="${nideshop.NideshopFeedback.list()}" optionKey="id" value="${nideshopFeedbackInstance?.parentId?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'messageImg', 'error')} required">
	<label for="messageImg">
		<g:message code="nideshopFeedback.messageImg.label" default="Message Img" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="messageImg" required="" value="${nideshopFeedbackInstance?.messageImg}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgArea', 'error')} required">
	<label for="msgArea">
		<g:message code="nideshopFeedback.msgArea.label" default="Msg Area" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="msgArea" type="number" value="${nideshopFeedbackInstance.msgArea}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgStatus', 'error')} required">
	<label for="msgStatus">
		<g:message code="nideshopFeedback.msgStatus.label" default="Msg Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="msgStatus" type="number" value="${nideshopFeedbackInstance.msgStatus}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgTime', 'error')} required">
	<label for="msgTime">
		<g:message code="nideshopFeedback.msgTime.label" default="Msg Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="msgTime" type="number" value="${nideshopFeedbackInstance.msgTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'msgType', 'error')} required">
	<label for="msgType">
		<g:message code="nideshopFeedback.msgType.label" default="Msg Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="msgType" type="number" value="${nideshopFeedbackInstance.msgType}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'orderId', 'error')} required">
	<label for="orderId">
		<g:message code="nideshopFeedback.orderId.label" default="Order Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="orderId" type="number" value="${nideshopFeedbackInstance.orderId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFeedbackInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopFeedback.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopFeedbackInstance?.userId?.id}" class="many-to-one"/>

</div>

