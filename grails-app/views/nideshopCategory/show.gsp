
<%@ page import="nideshop.NideshopCategory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCategory.label', default: 'NideshopCategory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopCategory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopCategory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopCategory">
			
				<g:if test="${nideshopCategoryInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopCategory.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.bannerUrl}">
				<li class="fieldcontain">
					<span id="bannerUrl-label" class="property-label"><g:message code="nideshopCategory.bannerUrl.label" default="Banner Url" /></span>
					
						<span class="property-value" aria-labelledby="bannerUrl-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="bannerUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.frontDesc}">
				<li class="fieldcontain">
					<span id="frontDesc-label" class="property-label"><g:message code="nideshopCategory.frontDesc.label" default="Front Desc" /></span>
					
						<span class="property-value" aria-labelledby="frontDesc-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="frontDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.frontName}">
				<li class="fieldcontain">
					<span id="frontName-label" class="property-label"><g:message code="nideshopCategory.frontName.label" default="Front Name" /></span>
					
						<span class="property-value" aria-labelledby="frontName-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="frontName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.iconUrl}">
				<li class="fieldcontain">
					<span id="iconUrl-label" class="property-label"><g:message code="nideshopCategory.iconUrl.label" default="Icon Url" /></span>
					
						<span class="property-value" aria-labelledby="iconUrl-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="iconUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.imgUrl}">
				<li class="fieldcontain">
					<span id="imgUrl-label" class="property-label"><g:message code="nideshopCategory.imgUrl.label" default="Img Url" /></span>
					
						<span class="property-value" aria-labelledby="imgUrl-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="imgUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.isShow}">
				<li class="fieldcontain">
					<span id="isShow-label" class="property-label"><g:message code="nideshopCategory.isShow.label" default="Is Show" /></span>
					
						<span class="property-value" aria-labelledby="isShow-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="isShow"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.keywords}">
				<li class="fieldcontain">
					<span id="keywords-label" class="property-label"><g:message code="nideshopCategory.keywords.label" default="Keywords" /></span>
					
						<span class="property-value" aria-labelledby="keywords-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="keywords"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.level}">
				<li class="fieldcontain">
					<span id="level-label" class="property-label"><g:message code="nideshopCategory.level.label" default="Level" /></span>
					
						<span class="property-value" aria-labelledby="level-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="level"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.parentId}">
				<li class="fieldcontain">
					<span id="parentId-label" class="property-label"><g:message code="nideshopCategory.parentId.label" default="Parent Id" /></span>
					
						<span class="property-value" aria-labelledby="parentId-label"><g:link controller="nideshopCategory" action="show" id="${nideshopCategoryInstance?.parentId?.id}">${nideshopCategoryInstance?.parentId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.showIndex}">
				<li class="fieldcontain">
					<span id="showIndex-label" class="property-label"><g:message code="nideshopCategory.showIndex.label" default="Show Index" /></span>
					
						<span class="property-value" aria-labelledby="showIndex-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="showIndex"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopCategory.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="nideshopCategory.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCategoryInstance?.wapBannerUrl}">
				<li class="fieldcontain">
					<span id="wapBannerUrl-label" class="property-label"><g:message code="nideshopCategory.wapBannerUrl.label" default="Wap Banner Url" /></span>
					
						<span class="property-value" aria-labelledby="wapBannerUrl-label"><g:fieldValue bean="${nideshopCategoryInstance}" field="wapBannerUrl"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCategoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCategoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
