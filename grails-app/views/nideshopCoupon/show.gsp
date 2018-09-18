
<%@ page import="nideshop.NideshopCoupon" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCoupon.label', default: 'NideshopCoupon')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-nideshopCoupon" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-nideshopCoupon" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list nideshopCoupon">
			
				<g:if test="${nideshopCouponInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="nideshopCoupon.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${nideshopCouponInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.maxAmount}">
				<li class="fieldcontain">
					<span id="maxAmount-label" class="property-label"><g:message code="nideshopCoupon.maxAmount.label" default="Max Amount" /></span>
					
						<span class="property-value" aria-labelledby="maxAmount-label"><g:fieldValue bean="${nideshopCouponInstance}" field="maxAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.minAmount}">
				<li class="fieldcontain">
					<span id="minAmount-label" class="property-label"><g:message code="nideshopCoupon.minAmount.label" default="Min Amount" /></span>
					
						<span class="property-value" aria-labelledby="minAmount-label"><g:fieldValue bean="${nideshopCouponInstance}" field="minAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.minGoodsAmount}">
				<li class="fieldcontain">
					<span id="minGoodsAmount-label" class="property-label"><g:message code="nideshopCoupon.minGoodsAmount.label" default="Min Goods Amount" /></span>
					
						<span class="property-value" aria-labelledby="minGoodsAmount-label"><g:fieldValue bean="${nideshopCouponInstance}" field="minGoodsAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.sendEndDate}">
				<li class="fieldcontain">
					<span id="sendEndDate-label" class="property-label"><g:message code="nideshopCoupon.sendEndDate.label" default="Send End Date" /></span>
					
						<span class="property-value" aria-labelledby="sendEndDate-label"><g:fieldValue bean="${nideshopCouponInstance}" field="sendEndDate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.sendStartDate}">
				<li class="fieldcontain">
					<span id="sendStartDate-label" class="property-label"><g:message code="nideshopCoupon.sendStartDate.label" default="Send Start Date" /></span>
					
						<span class="property-value" aria-labelledby="sendStartDate-label"><g:fieldValue bean="${nideshopCouponInstance}" field="sendStartDate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.sendType}">
				<li class="fieldcontain">
					<span id="sendType-label" class="property-label"><g:message code="nideshopCoupon.sendType.label" default="Send Type" /></span>
					
						<span class="property-value" aria-labelledby="sendType-label"><g:fieldValue bean="${nideshopCouponInstance}" field="sendType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.typeMoney}">
				<li class="fieldcontain">
					<span id="typeMoney-label" class="property-label"><g:message code="nideshopCoupon.typeMoney.label" default="Type Money" /></span>
					
						<span class="property-value" aria-labelledby="typeMoney-label"><g:fieldValue bean="${nideshopCouponInstance}" field="typeMoney"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.useEndDate}">
				<li class="fieldcontain">
					<span id="useEndDate-label" class="property-label"><g:message code="nideshopCoupon.useEndDate.label" default="Use End Date" /></span>
					
						<span class="property-value" aria-labelledby="useEndDate-label"><g:fieldValue bean="${nideshopCouponInstance}" field="useEndDate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${nideshopCouponInstance?.useStartDate}">
				<li class="fieldcontain">
					<span id="useStartDate-label" class="property-label"><g:message code="nideshopCoupon.useStartDate.label" default="Use Start Date" /></span>
					
						<span class="property-value" aria-labelledby="useStartDate-label"><g:fieldValue bean="${nideshopCouponInstance}" field="useStartDate"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:nideshopCouponInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${nideshopCouponInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
