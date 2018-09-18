
<%@ page import="nideshop.NideshopTopic" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopTopic.label', default: 'NideshopTopic')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopTopic" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopTopic" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopTopic">
			
				<g:if test="${nideshopTopicInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="nideshopTopic.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${nideshopTopicInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.avatar}">
				<li class="fieldcontain">
					<span id="avatar-label" class="property-label"><g:message code="nideshopTopic.avatar.label" default="Avatar" /></span>
					
						<span class="property-value" aria-labelledby="avatar-label"><g:fieldValue bean="${nideshopTopicInstance}" field="avatar"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.isShow}">
				<li class="fieldcontain">
					<span id="isShow-label" class="property-label"><g:message code="nideshopTopic.isShow.label" default="Is Show" /></span>
					
						<span class="property-value" aria-labelledby="isShow-label"><g:fieldValue bean="${nideshopTopicInstance}" field="isShow"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.itemPicUrl}">
				<li class="fieldcontain">
					<span id="itemPicUrl-label" class="property-label"><g:message code="nideshopTopic.itemPicUrl.label" default="Item Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="itemPicUrl-label"><g:fieldValue bean="${nideshopTopicInstance}" field="itemPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.priceInfo}">
				<li class="fieldcontain">
					<span id="priceInfo-label" class="property-label"><g:message code="nideshopTopic.priceInfo.label" default="Price Info" /></span>
					
						<span class="property-value" aria-labelledby="priceInfo-label"><g:fieldValue bean="${nideshopTopicInstance}" field="priceInfo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.readCount}">
				<li class="fieldcontain">
					<span id="readCount-label" class="property-label"><g:message code="nideshopTopic.readCount.label" default="Read Count" /></span>
					
						<span class="property-value" aria-labelledby="readCount-label"><g:fieldValue bean="${nideshopTopicInstance}" field="readCount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.scenePicUrl}">
				<li class="fieldcontain">
					<span id="scenePicUrl-label" class="property-label"><g:message code="nideshopTopic.scenePicUrl.label" default="Scene Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="scenePicUrl-label"><g:fieldValue bean="${nideshopTopicInstance}" field="scenePicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopTopic.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopTopicInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.subtitle}">
				<li class="fieldcontain">
					<span id="subtitle-label" class="property-label"><g:message code="nideshopTopic.subtitle.label" default="Subtitle" /></span>
					
						<span class="property-value" aria-labelledby="subtitle-label"><g:fieldValue bean="${nideshopTopicInstance}" field="subtitle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.title}">
				<li class="fieldcontain">
					<span id="title-label" class="property-label"><g:message code="nideshopTopic.title.label" default="Title" /></span>
					
						<span class="property-value" aria-labelledby="title-label"><g:fieldValue bean="${nideshopTopicInstance}" field="title"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.topicCategoryId}">
				<li class="fieldcontain">
					<span id="topicCategoryId-label" class="property-label"><g:message code="nideshopTopic.topicCategoryId.label" default="Topic Category Id" /></span>
					
						<span class="property-value" aria-labelledby="topicCategoryId-label"><g:link controller="nideshopTopicCategory" action="show" id="${nideshopTopicInstance?.topicCategoryId?.id}">${nideshopTopicInstance?.topicCategoryId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.topicTagId}">
				<li class="fieldcontain">
					<span id="topicTagId-label" class="property-label"><g:message code="nideshopTopic.topicTagId.label" default="Topic Tag Id" /></span>
					
						<span class="property-value" aria-labelledby="topicTagId-label"><g:fieldValue bean="${nideshopTopicInstance}" field="topicTagId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopTopicInstance?.topicTemplateId}">
				<li class="fieldcontain">
					<span id="topicTemplateId-label" class="property-label"><g:message code="nideshopTopic.topicTemplateId.label" default="Topic Template Id" /></span>
					
						<span class="property-value" aria-labelledby="topicTemplateId-label"><g:fieldValue bean="${nideshopTopicInstance}" field="topicTemplateId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopTopicInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopTopicInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
