
<%@ page import="nideshop.NideshopGoods" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoods.label', default: 'NideshopGoods')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopGoods" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopGoods" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopGoods">
			
				<g:if test="${nideshopGoodsInstance?.goodsSn}">
				<li class="fieldcontain">
					<span id="goodsSn-label" class="property-label"><g:message code="nideshopGoods.goodsSn.label" default="Goods Sn" /></span>
					
						<span class="property-value" aria-labelledby="goodsSn-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="goodsSn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopGoods.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.goodsDesc}">
				<li class="fieldcontain">
					<span id="goodsDesc-label" class="property-label"><g:message code="nideshopGoods.goodsDesc.label" default="Goods Desc" /></span>
					
						<span class="property-value" aria-labelledby="goodsDesc-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="goodsDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.goodsUnit}">
				<li class="fieldcontain">
					<span id="goodsUnit-label" class="property-label"><g:message code="nideshopGoods.goodsUnit.label" default="Goods Unit" /></span>
					
						<span class="property-value" aria-labelledby="goodsUnit-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="goodsUnit"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.promotionTag}">
				<li class="fieldcontain">
					<span id="promotionTag-label" class="property-label"><g:message code="nideshopGoods.promotionTag.label" default="Promotion Tag" /></span>
					
						<span class="property-value" aria-labelledby="promotionTag-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="promotionTag"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.primaryProductId}">
				<li class="fieldcontain">
					<span id="primaryProductId-label" class="property-label"><g:message code="nideshopGoods.primaryProductId.label" default="Primary Product Id" /></span>
					
						<span class="property-value" aria-labelledby="primaryProductId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopGoodsInstance?.primaryProductId?.id}">${nideshopGoodsInstance?.primaryProductId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopGoods.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.appExclusivePrice}">
				<li class="fieldcontain">
					<span id="appExclusivePrice-label" class="property-label"><g:message code="nideshopGoods.appExclusivePrice.label" default="App Exclusive Price" /></span>
					
						<span class="property-value" aria-labelledby="appExclusivePrice-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="appExclusivePrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.attributeCategory}">
				<li class="fieldcontain">
					<span id="attributeCategory-label" class="property-label"><g:message code="nideshopGoods.attributeCategory.label" default="Attribute Category" /></span>
					
						<span class="property-value" aria-labelledby="attributeCategory-label"><g:link controller="nideshopAttributeCategory" action="show" id="${nideshopGoodsInstance?.attributeCategory?.id}">${nideshopGoodsInstance?.attributeCategory?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.brandId}">
				<li class="fieldcontain">
					<span id="brandId-label" class="property-label"><g:message code="nideshopGoods.brandId.label" default="Brand Id" /></span>
					
						<span class="property-value" aria-labelledby="brandId-label"><g:link controller="nideshopBrand" action="show" id="${nideshopGoodsInstance?.brandId?.id}">${nideshopGoodsInstance?.brandId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.categoryId}">
				<li class="fieldcontain">
					<span id="categoryId-label" class="property-label"><g:message code="nideshopGoods.categoryId.label" default="Category Id" /></span>
					
						<span class="property-value" aria-labelledby="categoryId-label"><g:link controller="nideshopCategory" action="show" id="${nideshopGoodsInstance?.categoryId?.id}">${nideshopGoodsInstance?.categoryId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.counterPrice}">
				<li class="fieldcontain">
					<span id="counterPrice-label" class="property-label"><g:message code="nideshopGoods.counterPrice.label" default="Counter Price" /></span>
					
						<span class="property-value" aria-labelledby="counterPrice-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="counterPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.extraPrice}">
				<li class="fieldcontain">
					<span id="extraPrice-label" class="property-label"><g:message code="nideshopGoods.extraPrice.label" default="Extra Price" /></span>
					
						<span class="property-value" aria-labelledby="extraPrice-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="extraPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.goodsBrief}">
				<li class="fieldcontain">
					<span id="goodsBrief-label" class="property-label"><g:message code="nideshopGoods.goodsBrief.label" default="Goods Brief" /></span>
					
						<span class="property-value" aria-labelledby="goodsBrief-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="goodsBrief"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.goodsNumber}">
				<li class="fieldcontain">
					<span id="goodsNumber-label" class="property-label"><g:message code="nideshopGoods.goodsNumber.label" default="Goods Number" /></span>
					
						<span class="property-value" aria-labelledby="goodsNumber-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="goodsNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isAppExclusive}">
				<li class="fieldcontain">
					<span id="isAppExclusive-label" class="property-label"><g:message code="nideshopGoods.isAppExclusive.label" default="Is App Exclusive" /></span>
					
						<span class="property-value" aria-labelledby="isAppExclusive-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isAppExclusive"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isDelete}">
				<li class="fieldcontain">
					<span id="isDelete-label" class="property-label"><g:message code="nideshopGoods.isDelete.label" default="Is Delete" /></span>
					
						<span class="property-value" aria-labelledby="isDelete-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isDelete"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isHot}">
				<li class="fieldcontain">
					<span id="isHot-label" class="property-label"><g:message code="nideshopGoods.isHot.label" default="Is Hot" /></span>
					
						<span class="property-value" aria-labelledby="isHot-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isHot"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isLimited}">
				<li class="fieldcontain">
					<span id="isLimited-label" class="property-label"><g:message code="nideshopGoods.isLimited.label" default="Is Limited" /></span>
					
						<span class="property-value" aria-labelledby="isLimited-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isLimited"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isNew}">
				<li class="fieldcontain">
					<span id="isNew-label" class="property-label"><g:message code="nideshopGoods.isNew.label" default="Is New" /></span>
					
						<span class="property-value" aria-labelledby="isNew-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isNew"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.isOnSale}">
				<li class="fieldcontain">
					<span id="isOnSale-label" class="property-label"><g:message code="nideshopGoods.isOnSale.label" default="Is On Sale" /></span>
					
						<span class="property-value" aria-labelledby="isOnSale-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="isOnSale"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.keywords}">
				<li class="fieldcontain">
					<span id="keywords-label" class="property-label"><g:message code="nideshopGoods.keywords.label" default="Keywords" /></span>
					
						<span class="property-value" aria-labelledby="keywords-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="keywords"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.listPicUrl}">
				<li class="fieldcontain">
					<span id="listPicUrl-label" class="property-label"><g:message code="nideshopGoods.listPicUrl.label" default="List Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="listPicUrl-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="listPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.primaryPicUrl}">
				<li class="fieldcontain">
					<span id="primaryPicUrl-label" class="property-label"><g:message code="nideshopGoods.primaryPicUrl.label" default="Primary Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="primaryPicUrl-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="primaryPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.promotionDesc}">
				<li class="fieldcontain">
					<span id="promotionDesc-label" class="property-label"><g:message code="nideshopGoods.promotionDesc.label" default="Promotion Desc" /></span>
					
						<span class="property-value" aria-labelledby="promotionDesc-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="promotionDesc"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.retailPrice}">
				<li class="fieldcontain">
					<span id="retailPrice-label" class="property-label"><g:message code="nideshopGoods.retailPrice.label" default="Retail Price" /></span>
					
						<span class="property-value" aria-labelledby="retailPrice-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="retailPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.sellVolume}">
				<li class="fieldcontain">
					<span id="sellVolume-label" class="property-label"><g:message code="nideshopGoods.sellVolume.label" default="Sell Volume" /></span>
					
						<span class="property-value" aria-labelledby="sellVolume-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="sellVolume"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.sortOrder}">
				<li class="fieldcontain">
					<span id="sortOrder-label" class="property-label"><g:message code="nideshopGoods.sortOrder.label" default="Sort Order" /></span>
					
						<span class="property-value" aria-labelledby="sortOrder-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="sortOrder"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsInstance?.unitPrice}">
				<li class="fieldcontain">
					<span id="unitPrice-label" class="property-label"><g:message code="nideshopGoods.unitPrice.label" default="Unit Price" /></span>
					
						<span class="property-value" aria-labelledby="unitPrice-label"><g:fieldValue bean="${nideshopGoodsInstance}" field="unitPrice"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopGoodsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopGoodsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
