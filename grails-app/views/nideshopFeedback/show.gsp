
<%@ page import="nideshop.NideshopFeedback" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopFeedback.label', default: 'NideshopFeedback')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopFeedback" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopFeedback" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopFeedback">
			
				<g:if test="${nideshopFeedbackInstance?.userName}">
				<li class="fieldcontain">
					<span id="userName-label" class="property-label"><g:message code="nideshopFeedback.userName.label" default="User Name" /></span>
					
						<span class="property-value" aria-labelledby="userName-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="userName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.userEmail}">
				<li class="fieldcontain">
					<span id="userEmail-label" class="property-label"><g:message code="nideshopFeedback.userEmail.label" default="User Email" /></span>
					
						<span class="property-value" aria-labelledby="userEmail-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="userEmail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgTitle}">
				<li class="fieldcontain">
					<span id="msgTitle-label" class="property-label"><g:message code="nideshopFeedback.msgTitle.label" default="Msg Title" /></span>
					
						<span class="property-value" aria-labelledby="msgTitle-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgTitle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgContent}">
				<li class="fieldcontain">
					<span id="msgContent-label" class="property-label"><g:message code="nideshopFeedback.msgContent.label" default="Msg Content" /></span>
					
						<span class="property-value" aria-labelledby="msgContent-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgContent"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.parentId}">
				<li class="fieldcontain">
					<span id="parentId-label" class="property-label"><g:message code="nideshopFeedback.parentId.label" default="Parent Id" /></span>
					
						<span class="property-value" aria-labelledby="parentId-label"><g:link controller="nideshopFeedback" action="show" id="${nideshopFeedbackInstance?.parentId?.id}">${nideshopFeedbackInstance?.parentId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.messageImg}">
				<li class="fieldcontain">
					<span id="messageImg-label" class="property-label"><g:message code="nideshopFeedback.messageImg.label" default="Message Img" /></span>
					
						<span class="property-value" aria-labelledby="messageImg-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="messageImg"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgArea}">
				<li class="fieldcontain">
					<span id="msgArea-label" class="property-label"><g:message code="nideshopFeedback.msgArea.label" default="Msg Area" /></span>
					
						<span class="property-value" aria-labelledby="msgArea-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgArea"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgStatus}">
				<li class="fieldcontain">
					<span id="msgStatus-label" class="property-label"><g:message code="nideshopFeedback.msgStatus.label" default="Msg Status" /></span>
					
						<span class="property-value" aria-labelledby="msgStatus-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgTime}">
				<li class="fieldcontain">
					<span id="msgTime-label" class="property-label"><g:message code="nideshopFeedback.msgTime.label" default="Msg Time" /></span>
					
						<span class="property-value" aria-labelledby="msgTime-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.msgType}">
				<li class="fieldcontain">
					<span id="msgType-label" class="property-label"><g:message code="nideshopFeedback.msgType.label" default="Msg Type" /></span>
					
						<span class="property-value" aria-labelledby="msgType-label"><g:fieldValue bean="${nideshopFeedbackInstance}" field="msgType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.orderId}">
				<li class="fieldcontain">
					<span id="orderId-label" class="property-label"><g:message code="nideshopFeedback.orderId.label" default="Order Id" /></span>
					
						<span class="property-value" aria-labelledby="orderId-label"><g:link controller="nideshopOrder" action="show" id="${nideshopFeedbackInstance?.orderId?.id}">${nideshopFeedbackInstance?.orderId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopFeedbackInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopFeedback.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopFeedbackInstance?.userId?.id}">${nideshopFeedbackInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopFeedbackInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopFeedbackInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
