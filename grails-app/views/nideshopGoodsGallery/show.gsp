
<%@ page import="nideshop.NideshopGoodsGallery" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsGallery.label', default: 'NideshopGoodsGallery')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopGoodsGallery" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopGoodsGallery" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopGoodsGallery">
			
				<g:if test="${nideshopGoodsGalleryInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopGoodsGallery.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopGoodsGalleryInstance?.goodsId?.id}">${nideshopGoodsGalleryInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsGalleryInstance?.imgDesc}">
				<li class="fieldcontain">
					<span id="imgDesc-label" class="property-label"><g:message code="nideshopGoodsGallery.imgDesc.label" default="Img Desc" /></span>
					
						<span class="property-value" aria-labelledby="imgDesc-label"><g:fieldValue bean="${nideshopGoodsGalleryInstance}" field="imgDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsGalleryInstance?.imgUrl}">
				<li class="fieldcontain">
					<span id="imgUrl-label" class="property-label"><g:message code="nideshopGoodsGallery.imgUrl.label" default="Img Url" /></span>
					
						<span class="property-value" aria-labelledby="imgUrl-label"><g:fieldValue bean="${nideshopGoodsGalleryInstance}" field="imgUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsGalleryInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopGoodsGallery.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopGoodsGalleryInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopGoodsGalleryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopGoodsGalleryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
