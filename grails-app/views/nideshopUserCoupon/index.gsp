
<%@ page import="nideshop.NideshopUserCoupon" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopUserCoupon.label', default: 'NideshopUserCoupon')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopUserCoupon" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopUserCoupon" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="couponNumber" title="${message(code: 'nideshopUserCoupon.couponNumber.label', default: 'Coupon Number')}" />
					
						<th><g:message code="nideshopUserCoupon.couponId.label" default="Coupon Id" /></th>
					
						<th><g:message code="nideshopUserCoupon.orderId.label" default="Order Id" /></th>
					
						<g:sortableColumn property="usedTime" title="${message(code: 'nideshopUserCoupon.usedTime.label', default: 'Used Time')}" />
					
						<th><g:message code="nideshopUserCoupon.userId.label" default="User Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopUserCouponInstanceList}" status="i" var="nideshopUserCouponInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopUserCouponInstance.id}">${fieldValue(bean: nideshopUserCouponInstance, field: "couponNumber")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopUserCouponInstance, field: "couponId")}</td>
					
						<td>${fieldValue(bean: nideshopUserCouponInstance, field: "orderId")}</td>
					
						<td>${fieldValue(bean: nideshopUserCouponInstance, field: "usedTime")}</td>
					
						<td>${fieldValue(bean: nideshopUserCouponInstance, field: "userId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopUserCouponInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
