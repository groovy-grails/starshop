
<%@ page import="nideshop.NideshopSearchHistory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopSearchHistory.label', default: 'NideshopSearchHistory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopSearchHistory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopSearchHistory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopSearchHistory">
			
				<g:if test="${nideshopSearchHistoryInstance?.keyword}">
				<li class="fieldcontain">
					<span id="keyword-label" class="property-label"><g:message code="nideshopSearchHistory.keyword.label" default="Keyword" /></span>
					
						<span class="property-value" aria-labelledby="keyword-label"><g:fieldValue bean="${nideshopSearchHistoryInstance}" field="keyword"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopSearchHistoryInstance?.from}">
				<li class="fieldcontain">
					<span id="from-label" class="property-label"><g:message code="nideshopSearchHistory.from.label" default="From" /></span>
					
						<span class="property-value" aria-labelledby="from-label"><g:fieldValue bean="${nideshopSearchHistoryInstance}" field="from"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopSearchHistoryInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopSearchHistory.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:fieldValue bean="${nideshopSearchHistoryInstance}" field="userId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopSearchHistoryInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopSearchHistory.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopSearchHistoryInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopSearchHistoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopSearchHistoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
