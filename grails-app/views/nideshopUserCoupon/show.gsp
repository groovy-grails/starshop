
<%@ page import="nideshop.NideshopUserCoupon" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopUserCoupon.label', default: 'NideshopUserCoupon')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopUserCoupon" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopUserCoupon" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopUserCoupon">
			
				<g:if test="${nideshopUserCouponInstance?.couponNumber}">
				<li class="fieldcontain">
					<span id="couponNumber-label" class="property-label"><g:message code="nideshopUserCoupon.couponNumber.label" default="Coupon Number" /></span>
					
						<span class="property-value" aria-labelledby="couponNumber-label"><g:fieldValue bean="${nideshopUserCouponInstance}" field="couponNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserCouponInstance?.couponId}">
				<li class="fieldcontain">
					<span id="couponId-label" class="property-label"><g:message code="nideshopUserCoupon.couponId.label" default="Coupon Id" /></span>
					
						<span class="property-value" aria-labelledby="couponId-label"><g:link controller="nideshopCoupon" action="show" id="${nideshopUserCouponInstance?.couponId?.id}">${nideshopUserCouponInstance?.couponId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserCouponInstance?.orderId}">
				<li class="fieldcontain">
					<span id="orderId-label" class="property-label"><g:message code="nideshopUserCoupon.orderId.label" default="Order Id" /></span>
					
						<span class="property-value" aria-labelledby="orderId-label"><g:link controller="nideshopOrder" action="show" id="${nideshopUserCouponInstance?.orderId?.id}">${nideshopUserCouponInstance?.orderId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserCouponInstance?.usedTime}">
				<li class="fieldcontain">
					<span id="usedTime-label" class="property-label"><g:message code="nideshopUserCoupon.usedTime.label" default="Used Time" /></span>
					
						<span class="property-value" aria-labelledby="usedTime-label"><g:fieldValue bean="${nideshopUserCouponInstance}" field="usedTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopUserCouponInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopUserCoupon.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopUserCouponInstance?.userId?.id}">${nideshopUserCouponInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopUserCouponInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopUserCouponInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
