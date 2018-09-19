
<%@ page import="nideshop.NideshopOrder" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrder.label', default: 'NideshopOrder')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopOrder" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopOrder" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopOrder">
			
				<g:if test="${nideshopOrderInstance?.orderSn}">
				<li class="fieldcontain">
					<span id="orderSn-label" class="property-label"><g:message code="nideshopOrder.orderSn.label" default="Order Sn" /></span>
					
						<span class="property-value" aria-labelledby="orderSn-label"><g:fieldValue bean="${nideshopOrderInstance}" field="orderSn"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.consignee}">
				<li class="fieldcontain">
					<span id="consignee-label" class="property-label"><g:message code="nideshopOrder.consignee.label" default="Consignee" /></span>
					
						<span class="property-value" aria-labelledby="consignee-label"><g:fieldValue bean="${nideshopOrderInstance}" field="consignee"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.mobile}">
				<li class="fieldcontain">
					<span id="mobile-label" class="property-label"><g:message code="nideshopOrder.mobile.label" default="Mobile" /></span>
					
						<span class="property-value" aria-labelledby="mobile-label"><g:fieldValue bean="${nideshopOrderInstance}" field="mobile"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.payName}">
				<li class="fieldcontain">
					<span id="payName-label" class="property-label"><g:message code="nideshopOrder.payName.label" default="Pay Name" /></span>
					
						<span class="property-value" aria-labelledby="payName-label"><g:fieldValue bean="${nideshopOrderInstance}" field="payName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.callbackStatus}">
				<li class="fieldcontain">
					<span id="callbackStatus-label" class="property-label"><g:message code="nideshopOrder.callbackStatus.label" default="Callback Status" /></span>
					
						<span class="property-value" aria-labelledby="callbackStatus-label"><g:fieldValue bean="${nideshopOrderInstance}" field="callbackStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.parentId}">
				<li class="fieldcontain">
					<span id="parentId-label" class="property-label"><g:message code="nideshopOrder.parentId.label" default="Parent Id" /></span>
					
						<span class="property-value" aria-labelledby="parentId-label"><g:link controller="nideshopOrder" action="show" id="${nideshopOrderInstance?.parentId?.id}">${nideshopOrderInstance?.parentId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.actualPrice}">
				<li class="fieldcontain">
					<span id="actualPrice-label" class="property-label"><g:message code="nideshopOrder.actualPrice.label" default="Actual Price" /></span>
					
						<span class="property-value" aria-labelledby="actualPrice-label"><g:fieldValue bean="${nideshopOrderInstance}" field="actualPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.addTime}">
				<li class="fieldcontain">
					<span id="addTime-label" class="property-label"><g:message code="nideshopOrder.addTime.label" default="Add Time" /></span>
					
						<span class="property-value" aria-labelledby="addTime-label"><g:fieldValue bean="${nideshopOrderInstance}" field="addTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="nideshopOrder.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${nideshopOrderInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="nideshopOrder.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${nideshopOrderInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.confirmTime}">
				<li class="fieldcontain">
					<span id="confirmTime-label" class="property-label"><g:message code="nideshopOrder.confirmTime.label" default="Confirm Time" /></span>
					
						<span class="property-value" aria-labelledby="confirmTime-label"><g:fieldValue bean="${nideshopOrderInstance}" field="confirmTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.country}">
				<li class="fieldcontain">
					<span id="country-label" class="property-label"><g:message code="nideshopOrder.country.label" default="Country" /></span>
					
						<span class="property-value" aria-labelledby="country-label"><g:fieldValue bean="${nideshopOrderInstance}" field="country"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.couponId}">
				<li class="fieldcontain">
					<span id="couponId-label" class="property-label"><g:message code="nideshopOrder.couponId.label" default="Coupon Id" /></span>
					
						<span class="property-value" aria-labelledby="couponId-label"><g:link controller="nideshopCoupon" action="show" id="${nideshopOrderInstance?.couponId?.id}">${nideshopOrderInstance?.couponId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.couponPrice}">
				<li class="fieldcontain">
					<span id="couponPrice-label" class="property-label"><g:message code="nideshopOrder.couponPrice.label" default="Coupon Price" /></span>
					
						<span class="property-value" aria-labelledby="couponPrice-label"><g:fieldValue bean="${nideshopOrderInstance}" field="couponPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.district}">
				<li class="fieldcontain">
					<span id="district-label" class="property-label"><g:message code="nideshopOrder.district.label" default="District" /></span>
					
						<span class="property-value" aria-labelledby="district-label"><g:fieldValue bean="${nideshopOrderInstance}" field="district"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.freightPrice}">
				<li class="fieldcontain">
					<span id="freightPrice-label" class="property-label"><g:message code="nideshopOrder.freightPrice.label" default="Freight Price" /></span>
					
						<span class="property-value" aria-labelledby="freightPrice-label"><g:fieldValue bean="${nideshopOrderInstance}" field="freightPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.goodsPrice}">
				<li class="fieldcontain">
					<span id="goodsPrice-label" class="property-label"><g:message code="nideshopOrder.goodsPrice.label" default="Goods Price" /></span>
					
						<span class="property-value" aria-labelledby="goodsPrice-label"><g:fieldValue bean="${nideshopOrderInstance}" field="goodsPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.integral}">
				<li class="fieldcontain">
					<span id="integral-label" class="property-label"><g:message code="nideshopOrder.integral.label" default="Integral" /></span>
					
						<span class="property-value" aria-labelledby="integral-label"><g:fieldValue bean="${nideshopOrderInstance}" field="integral"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.integralMoney}">
				<li class="fieldcontain">
					<span id="integralMoney-label" class="property-label"><g:message code="nideshopOrder.integralMoney.label" default="Integral Money" /></span>
					
						<span class="property-value" aria-labelledby="integralMoney-label"><g:fieldValue bean="${nideshopOrderInstance}" field="integralMoney"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.orderPrice}">
				<li class="fieldcontain">
					<span id="orderPrice-label" class="property-label"><g:message code="nideshopOrder.orderPrice.label" default="Order Price" /></span>
					
						<span class="property-value" aria-labelledby="orderPrice-label"><g:fieldValue bean="${nideshopOrderInstance}" field="orderPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.orderStatus}">
				<li class="fieldcontain">
					<span id="orderStatus-label" class="property-label"><g:message code="nideshopOrder.orderStatus.label" default="Order Status" /></span>
					
						<span class="property-value" aria-labelledby="orderStatus-label"><g:fieldValue bean="${nideshopOrderInstance}" field="orderStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.payId}">
				<li class="fieldcontain">
					<span id="payId-label" class="property-label"><g:message code="nideshopOrder.payId.label" default="Pay Id" /></span>
					
						<span class="property-value" aria-labelledby="payId-label"><g:fieldValue bean="${nideshopOrderInstance}" field="payId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.payStatus}">
				<li class="fieldcontain">
					<span id="payStatus-label" class="property-label"><g:message code="nideshopOrder.payStatus.label" default="Pay Status" /></span>
					
						<span class="property-value" aria-labelledby="payStatus-label"><g:fieldValue bean="${nideshopOrderInstance}" field="payStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.payTime}">
				<li class="fieldcontain">
					<span id="payTime-label" class="property-label"><g:message code="nideshopOrder.payTime.label" default="Pay Time" /></span>
					
						<span class="property-value" aria-labelledby="payTime-label"><g:fieldValue bean="${nideshopOrderInstance}" field="payTime"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.postscript}">
				<li class="fieldcontain">
					<span id="postscript-label" class="property-label"><g:message code="nideshopOrder.postscript.label" default="Postscript" /></span>
					
						<span class="property-value" aria-labelledby="postscript-label"><g:fieldValue bean="${nideshopOrderInstance}" field="postscript"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.province}">
				<li class="fieldcontain">
					<span id="province-label" class="property-label"><g:message code="nideshopOrder.province.label" default="Province" /></span>
					
						<span class="property-value" aria-labelledby="province-label"><g:fieldValue bean="${nideshopOrderInstance}" field="province"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.shippingFee}">
				<li class="fieldcontain">
					<span id="shippingFee-label" class="property-label"><g:message code="nideshopOrder.shippingFee.label" default="Shipping Fee" /></span>
					
						<span class="property-value" aria-labelledby="shippingFee-label"><g:fieldValue bean="${nideshopOrderInstance}" field="shippingFee"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.shippingStatus}">
				<li class="fieldcontain">
					<span id="shippingStatus-label" class="property-label"><g:message code="nideshopOrder.shippingStatus.label" default="Shipping Status" /></span>
					
						<span class="property-value" aria-labelledby="shippingStatus-label"><g:fieldValue bean="${nideshopOrderInstance}" field="shippingStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopOrderInstance?.userId}">
				<li class="fieldcontain">
					<span id="userId-label" class="property-label"><g:message code="nideshopOrder.userId.label" default="User Id" /></span>
					
						<span class="property-value" aria-labelledby="userId-label"><g:link controller="nideshopUser" action="show" id="${nideshopOrderInstance?.userId?.id}">${nideshopOrderInstance?.userId?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopOrderInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopOrderInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
