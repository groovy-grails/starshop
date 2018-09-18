
<%@ page import="nideshop.NideshopAddress" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAddress.label', default: 'NideshopAddress')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopAddress" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopAddress" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopAddress">
			
				<g:if test="${nideshopAddressInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopAddress.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopAddressInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="nideshopAddress.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${nideshopAddressInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.mobile}">
				<li class="fieldcontain">
					<span id="mobile-label" class="property-label"><g:message code="nideshopAddress.mobile.label" default="Mobile" /></span>
					
						<span class="property-value" aria-labelledby="mobile-label"><g:fieldValue bean="${nideshopAddressInstance}" field="mobile"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.cityId}">
				<li class="fieldcontain">
					<span id="cityId-label" class="property-label"><g:message code="nideshopAddress.cityId.label" default="City Id" /></span>
					
						<span class="property-value" aria-labelledby="cityId-label"><g:link controller="nideshopRegion" action="show" id="${nideshopAddressInstance?.cityId?.id}">${nideshopAddressInstance?.cityId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.countryId}">
				<li class="fieldcontain">
					<span id="countryId-label" class="property-label"><g:message code="nideshopAddress.countryId.label" default="Country Id" /></span>
					
						<span class="property-value" aria-labelledby="countryId-label"><g:link controller="nideshopRegion" action="show" id="${nideshopAddressInstance?.countryId?.id}">${nideshopAddressInstance?.countryId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.districtId}">
				<li class="fieldcontain">
					<span id="districtId-label" class="property-label"><g:message code="nideshopAddress.districtId.label" default="District Id" /></span>
					
						<span class="property-value" aria-labelledby="districtId-label"><g:link controller="nideshopRegion" action="show" id="${nideshopAddressInstance?.districtId?.id}">${nideshopAddressInstance?.districtId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.isDefault}">
				<li class="fieldcontain">
					<span id="isDefault-label" class="property-label"><g:message code="nideshopAddress.isDefault.label" default="Is Default" /></span>
					
						<span class="property-value" aria-labelledby="isDefault-label"><g:fieldValue bean="${nideshopAddressInstance}" field="isDefault"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.provinceId}">
				<li class="fieldcontain">
					<span id="provinceId-label" class="property-label"><g:message code="nideshopAddress.provinceId.label" default="Province Id" /></span>
					
						<span class="property-value" aria-labelledby="provinceId-label"><g:link controller="nideshopRegion" action="show" id="${nideshopAddressInstance?.provinceId?.id}">${nideshopAddressInstance?.provinceId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopAddressInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopAddress.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopAddressInstance?.userId?.id}">${nideshopAddressInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopAddressInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopAddressInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
