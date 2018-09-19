
<%@ page import="nideshop.NideshopFeedback" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopFeedback.label', default: 'NideshopFeedback')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopFeedback" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopFeedback" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="userName" title="${message(code: 'nideshopFeedback.userName.label', default: 'User Name')}" />
					
						<g:sortableColumn property="userEmail" title="${message(code: 'nideshopFeedback.userEmail.label', default: 'User Email')}" />
					
						<g:sortableColumn property="msgTitle" title="${message(code: 'nideshopFeedback.msgTitle.label', default: 'Msg Title')}" />
					
						<g:sortableColumn property="msgContent" title="${message(code: 'nideshopFeedback.msgContent.label', default: 'Msg Content')}" />
					
						<th><g:message code="nideshopFeedback.parentId.label" default="Parent Id" /></th>
					
						<g:sortableColumn property="messageImg" title="${message(code: 'nideshopFeedback.messageImg.label', default: 'Message Img')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopFeedbackInstanceList}" status="i" var="nideshopFeedbackInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopFeedbackInstance.id}">${fieldValue(bean: nideshopFeedbackInstance, field: "userName")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopFeedbackInstance, field: "userEmail")}</td>
					
						<td>${fieldValue(bean: nideshopFeedbackInstance, field: "msgTitle")}</td>
					
						<td>${fieldValue(bean: nideshopFeedbackInstance, field: "msgContent")}</td>
					
						<td>${fieldValue(bean: nideshopFeedbackInstance, field: "parentId")}</td>
					
						<td>${fieldValue(bean: nideshopFeedbackInstance, field: "messageImg")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopFeedbackInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
