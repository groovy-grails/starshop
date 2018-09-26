
<%@ page import="nideshop.NideshopProduct" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopProduct.label', default: 'NideshopProduct')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopProduct" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopProduct" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopProduct">
			
				<g:if test="${nideshopProductInstance?.goodsSn}">
				<li class="fieldcontain">
					<span id="goodsSn-label" class="property-label"><g:message code="nideshopProduct.goodsSn.label" default="Goods Sn" /></span>
					
						<span class="property-value" aria-labelledby="goodsSn-label"><g:fieldValue bean="${nideshopProductInstance}" field="goodsSn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopProductInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopProduct.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopProductInstance?.goodsId?.id}">${nideshopProductInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopProductInstance?.goodsNumber}">
				<li class="fieldcontain">
					<span id="goodsNumber-label" class="property-label"><g:message code="nideshopProduct.goodsNumber.label" default="Goods Number" /></span>
					
						<span class="property-value" aria-labelledby="goodsNumber-label"><g:fieldValue bean="${nideshopProductInstance}" field="goodsNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopProductInstance?.goodsSpecificationIds}">
				<li class="fieldcontain">
					<span id="goodsSpecificationIds-label" class="property-label"><g:message code="nideshopProduct.goodsSpecificationIds.label" default="Goods Specification Ids" /></span>
					
						<span class="property-value" aria-labelledby="goodsSpecificationIds-label"><g:link controller="nideshopGoodsSpecification" action="show" id="${nideshopProductInstance?.goodsSpecificationIds?.id}">${nideshopProductInstance?.goodsSpecificationIds?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopProductInstance?.retailPrice}">
				<li class="fieldcontain">
					<span id="retailPrice-label" class="property-label"><g:message code="nideshopProduct.retailPrice.label" default="Retail Price" /></span>
					
						<span class="property-value" aria-labelledby="retailPrice-label"><g:fieldValue bean="${nideshopProductInstance}" field="retailPrice"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopProductInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopProductInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
