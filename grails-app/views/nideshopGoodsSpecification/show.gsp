
<%@ page import="nideshop.NideshopGoodsSpecification" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopGoodsSpecification" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopGoodsSpecification" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopGoodsSpecification">
			
				<g:if test="${nideshopGoodsSpecificationInstance?.value}">
				<li class="fieldcontain">
					<span id="value-label" class="property-label"><g:message code="nideshopGoodsSpecification.value.label" default="Value" /></span>
					
						<span class="property-value" aria-labelledby="value-label"><g:fieldValue bean="${nideshopGoodsSpecificationInstance}" field="value"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsSpecificationInstance?.goodsId}">
				<li class="fieldcontain">
					<span id="goodsId-label" class="property-label"><g:message code="nideshopGoodsSpecification.goodsId.label" default="Goods Id" /></span>
					
						<span class="property-value" aria-labelledby="goodsId-label"><g:link controller="nideshopGoods" action="show" id="${nideshopGoodsSpecificationInstance?.goodsId?.id}">${nideshopGoodsSpecificationInstance?.goodsId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsSpecificationInstance?.picUrl}">
				<li class="fieldcontain">
					<span id="picUrl-label" class="property-label"><g:message code="nideshopGoodsSpecification.picUrl.label" default="Pic Url" /></span>
					
						<span class="property-value" aria-labelledby="picUrl-label"><g:fieldValue bean="${nideshopGoodsSpecificationInstance}" field="picUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopGoodsSpecificationInstance?.specificationId}">
				<li class="fieldcontain">
					<span id="specificationId-label" class="property-label"><g:message code="nideshopGoodsSpecification.specificationId.label" default="Specification Id" /></span>
					
						<span class="property-value" aria-labelledby="specificationId-label"><g:link controller="nideshopSpecification" action="show" id="${nideshopGoodsSpecificationInstance?.specificationId?.id}">${nideshopGoodsSpecificationInstance?.specificationId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopGoodsSpecificationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopGoodsSpecificationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
