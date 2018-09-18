
<%@ page import="nideshop.NideshopCart" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCart.label', default: 'NideshopCart')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopCart" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopCart" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopCart">
			
				<g:if test="${nideshopCartInstance?.sessionId}">
				<li class="fieldcontain">
					<span id="sessionId-label" class="property-label"><g:message code="nideshopCart.sessionId.label" default="Session Id" /></span>
					
						<span class="property-value" aria-labelledby="sessionId-label"><g:fieldValue bean="${nideshopCartInstance}" field="sessionId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.goodsSn}">
				<li class="fieldcontain">
					<span id="goodsSn-label" class="property-label"><g:message code="nideshopCart.goodsSn.label" default="Goods Sn" /></span>
					
						<span class="property-value" aria-labelledby="goodsSn-label"><g:fieldValue bean="${nideshopCartInstance}" field="goodsSn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.goodsName}">
				<li class="fieldcontain">
					<span id="goodsName-label" class="property-label"><g:message code="nideshopCart.goodsName.label" default="Goods Name" /></span>
					
						<span class="property-value" aria-labelledby="goodsName-label"><g:fieldValue bean="${nideshopCartInstance}" field="goodsName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.goodsSpecifitionNameValue}">
				<li class="fieldcontain">
					<span id="goodsSpecifitionNameValue-label" class="property-label"><g:message code="nideshopCart.goodsSpecifitionNameValue.label" default="Goods Specifition Name Value" /></span>
					
						<span class="property-value" aria-labelledby="goodsSpecifitionNameValue-label"><g:fieldValue bean="${nideshopCartInstance}" field="goodsSpecifitionNameValue"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.goodsSpecifitionIds}">
				<li class="fieldcontain">
					<span id="goodsSpecifitionIds-label" class="property-label"><g:message code="nideshopCart.goodsSpecifitionIds.label" default="Goods Specifition Ids" /></span>
					
						<span class="property-value" aria-labelledby="goodsSpecifitionIds-label"><g:fieldValue bean="${nideshopCartInstance}" field="goodsSpecifitionIds"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.checked}">
				<li class="fieldcontain">
					<span id="checked-label" class="property-label"><g:message code="nideshopCart.checked.label" default="Checked" /></span>
					
						<span class="property-value" aria-labelledby="checked-label"><g:fieldValue bean="${nideshopCartInstance}" field="checked"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopCart.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopCartInstance?.goodsId?.id}">${nideshopCartInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.listPicUrl}">
				<li class="fieldcontain">
					<span id="listPicUrl-label" class="property-label"><g:message code="nideshopCart.listPicUrl.label" default="List Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="listPicUrl-label"><g:fieldValue bean="${nideshopCartInstance}" field="listPicUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.marketPrice}">
				<li class="fieldcontain">
					<span id="marketPrice-label" class="property-label"><g:message code="nideshopCart.marketPrice.label" default="Market Price" /></span>
					
						<span class="property-value" aria-labelledby="marketPrice-label"><g:fieldValue bean="${nideshopCartInstance}" field="marketPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.number}">
				<li class="fieldcontain">
					<span id="number-label" class="property-label"><g:message code="nideshopCart.number.label" default="Number" /></span>
					
						<span class="property-value" aria-labelledby="number-label"><g:fieldValue bean="${nideshopCartInstance}" field="number"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.productId}">
				<li class="fieldcontain">
					<span id="productId-label" class="property-label"><g:message code="nideshopCart.productId.label" default="Product Id" /></span>
					
						<span class="property-value" aria-labelledby="productId-label"><g:link controller="nideshopProduct" action="show" id="${nideshopCartInstance?.productId?.id}">${nideshopCartInstance?.productId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.retailPrice}">
				<li class="fieldcontain">
					<span id="retailPrice-label" class="property-label"><g:message code="nideshopCart.retailPrice.label" default="Retail Price" /></span>
					
						<span class="property-value" aria-labelledby="retailPrice-label"><g:fieldValue bean="${nideshopCartInstance}" field="retailPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCartInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopCart.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopCartInstance?.userId?.id}">${nideshopCartInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCartInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCartInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
