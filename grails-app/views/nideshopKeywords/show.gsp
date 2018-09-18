
<%@ page import="nideshop.NideshopKeywords" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopKeywords.label', default: 'NideshopKeywords')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopKeywords" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopKeywords" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopKeywords">
			
				<g:if test="${nideshopKeywordsInstance?.keyword}">
				<li class="fieldcontain">
					<span id="keyword-label" class="property-label"><g:message code="nideshopKeywords.keyword.label" default="Keyword" /></span>
					
						<span class="property-value" aria-labelledby="keyword-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="keyword"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.isDefault}">
				<li class="fieldcontain">
					<span id="isDefault-label" class="property-label"><g:message code="nideshopKeywords.isDefault.label" default="Is Default" /></span>
					
						<span class="property-value" aria-labelledby="isDefault-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="isDefault"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.isHot}">
				<li class="fieldcontain">
					<span id="isHot-label" class="property-label"><g:message code="nideshopKeywords.isHot.label" default="Is Hot" /></span>
					
						<span class="property-value" aria-labelledby="isHot-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="isHot"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.isShow}">
				<li class="fieldcontain">
					<span id="isShow-label" class="property-label"><g:message code="nideshopKeywords.isShow.label" default="Is Show" /></span>
					
						<span class="property-value" aria-labelledby="isShow-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="isShow"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.schemeUrl}">
				<li class="fieldcontain">
					<span id="schemeUrl-label" class="property-label"><g:message code="nideshopKeywords.schemeUrl.label" default="Scheme Url" /></span>
					
						<span class="property-value" aria-labelledby="schemeUrl-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="schemeUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopKeywords.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopKeywordsInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="nideshopKeywords.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${nideshopKeywordsInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopKeywordsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopKeywordsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
