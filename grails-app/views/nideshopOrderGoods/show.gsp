
<%@ page import="nideshop.NideshopOrderGoods" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrderGoods.label', default: 'NideshopOrderGoods')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopOrderGoods" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopOrderGoods" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopOrderGoods">
			
				<g:if test="${nideshopOrderGoodsInstance?.goodsName}">
				<li class="fieldcontain">
					<span id="goodsName-label" class="property-label"><g:message code="nideshopOrderGoods.goodsName.label" default="Goods Name" /></span>
					
						<span class="property-value" aria-labelledby="goodsName-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="goodsName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.goodsSn}">
				<li class="fieldcontain">
					<span id="goodsSn-label" class="property-label"><g:message code="nideshopOrderGoods.goodsSn.label" default="Goods Sn" /></span>
					
						<span class="property-value" aria-labelledby="goodsSn-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="goodsSn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.goodsSpecifitionNameValue}">
				<li class="fieldcontain">
					<span id="goodsSpecifitionNameValue-label" class="property-label"><g:message code="nideshopOrderGoods.goodsSpecifitionNameValue.label" default="Goods Specifition Name Value" /></span>
					
						<span class="property-value" aria-labelledby="goodsSpecifitionNameValue-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="goodsSpecifitionNameValue"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopOrderGoods.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopOrderGoodsInstance?.goodsId?.id}">${nideshopOrderGoodsInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.goodsSpecifitionIds}">
				<li class="fieldcontain">
					<span id="goodsSpecifitionIds-label" class="property-label"><g:message code="nideshopOrderGoods.goodsSpecifitionIds.label" default="Goods Specifition Ids" /></span>
					
						<span class="property-value" aria-labelledby="goodsSpecifitionIds-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="goodsSpecifitionIds"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.isReal}">
				<li class="fieldcontain">
					<span id="isReal-label" class="property-label"><g:message code="nideshopOrderGoods.isReal.label" default="Is Real" /></span>
					
						<span class="property-value" aria-labelledby="isReal-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="isReal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.listPicUrl}">
				<li class="fieldcontain">
					<span id="listPicUrl-label" class="property-label"><g:message code="nideshopOrderGoods.listPicUrl.label" default="List Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="listPicUrl-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="listPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.marketPrice}">
				<li class="fieldcontain">
					<span id="marketPrice-label" class="property-label"><g:message code="nideshopOrderGoods.marketPrice.label" default="Market Price" /></span>
					
						<span class="property-value" aria-labelledby="marketPrice-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="marketPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.number}">
				<li class="fieldcontain">
					<span id="number-label" class="property-label"><g:message code="nideshopOrderGoods.number.label" default="Number" /></span>
					
						<span class="property-value" aria-labelledby="number-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="number"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.orderId}">
				<li class="fieldcontain">
					<span id="orderId-label" class="property-label"><g:message code="nideshopOrderGoods.orderId.label" default="Order Id" /></span>
					
						<span class="property-value" aria-labelledby="orderId-label"><g:link controller="nideshopOrder" action="show" id="${nideshopOrderGoodsInstance?.orderId?.id}">${nideshopOrderGoodsInstance?.orderId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.productId}">
				<li class="fieldcontain">
					<span id="productId-label" class="property-label"><g:message code="nideshopOrderGoods.productId.label" default="Product Id" /></span>
					
						<span class="property-value" aria-labelledby="productId-label"><g:link controller="nideshopProduct" action="show" id="${nideshopOrderGoodsInstance?.productId?.id}">${nideshopOrderGoodsInstance?.productId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderGoodsInstance?.retailPrice}">
				<li class="fieldcontain">
					<span id="retailPrice-label" class="property-label"><g:message code="nideshopOrderGoods.retailPrice.label" default="Retail Price" /></span>
					
						<span class="property-value" aria-labelledby="retailPrice-label"><g:fieldValue bean="${nideshopOrderGoodsInstance}" field="retailPrice"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopOrderGoodsInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopOrderGoodsInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
