
<%@ page import="nideshop.NideshopBrand" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopBrand.label', default: 'NideshopBrand')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopBrand" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopBrand" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopBrand">
			
				<g:if test="${nideshopBrandInstance?.appListPicUrl}">
				<li class="fieldcontain">
					<span id="appListPicUrl-label" class="property-label"><g:message code="nideshopBrand.appListPicUrl.label" default="App List Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="appListPicUrl-label"><g:fieldValue bean="${nideshopBrandInstance}" field="appListPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.floorPrice}">
				<li class="fieldcontain">
					<span id="floorPrice-label" class="property-label"><g:message code="nideshopBrand.floorPrice.label" default="Floor Price" /></span>
					
						<span class="property-value" aria-labelledby="floorPrice-label"><g:fieldValue bean="${nideshopBrandInstance}" field="floorPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.isNew}">
				<li class="fieldcontain">
					<span id="isNew-label" class="property-label"><g:message code="nideshopBrand.isNew.label" default="Is New" /></span>
					
						<span class="property-value" aria-labelledby="isNew-label"><g:formatBoolean boolean="${nideshopBrandInstance?.isNew}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.isShow}">
				<li class="fieldcontain">
					<span id="isShow-label" class="property-label"><g:message code="nideshopBrand.isShow.label" default="Is Show" /></span>
					
						<span class="property-value" aria-labelledby="isShow-label"><g:formatBoolean boolean="${nideshopBrandInstance?.isShow}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.listPicUrl}">
				<li class="fieldcontain">
					<span id="listPicUrl-label" class="property-label"><g:message code="nideshopBrand.listPicUrl.label" default="List Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="listPicUrl-label"><g:fieldValue bean="${nideshopBrandInstance}" field="listPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopBrand.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopBrandInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.newPicUrl}">
				<li class="fieldcontain">
					<span id="newPicUrl-label" class="property-label"><g:message code="nideshopBrand.newPicUrl.label" default="New Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="newPicUrl-label"><g:fieldValue bean="${nideshopBrandInstance}" field="newPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.newSortOrder}">
				<li class="fieldcontain">
					<span id="newSortOrder-label" class="property-label"><g:message code="nideshopBrand.newSortOrder.label" default="New Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="newSortOrder-label"><g:fieldValue bean="${nideshopBrandInstance}" field="newSortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.picUrl}">
				<li class="fieldcontain">
					<span id="picUrl-label" class="property-label"><g:message code="nideshopBrand.picUrl.label" default="Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="picUrl-label"><g:fieldValue bean="${nideshopBrandInstance}" field="picUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.simpleDesc}">
				<li class="fieldcontain">
					<span id="simpleDesc-label" class="property-label"><g:message code="nideshopBrand.simpleDesc.label" default="Simple Desc" /></span>
					
						<span class="property-value" aria-labelledby="simpleDesc-label"><g:fieldValue bean="${nideshopBrandInstance}" field="simpleDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopBrandInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopBrand.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopBrandInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopBrandInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopBrandInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
