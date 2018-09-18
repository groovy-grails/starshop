
<%@ page import="nideshop.NideshopCoupon" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCoupon.label', default: 'NideshopCoupon')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopCoupon" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopCoupon" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopCoupon.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="maxAmount" title="${message(code: 'nideshopCoupon.maxAmount.label', default: 'Max Amount')}" />
					
						<g:sortableColumn property="minAmount" title="${message(code: 'nideshopCoupon.minAmount.label', default: 'Min Amount')}" />
					
						<g:sortableColumn property="minGoodsAmount" title="${message(code: 'nideshopCoupon.minGoodsAmount.label', default: 'Min Goods Amount')}" />
					
						<g:sortableColumn property="sendEndDate" title="${message(code: 'nideshopCoupon.sendEndDate.label', default: 'Send End Date')}" />
					
						<g:sortableColumn property="sendStartDate" title="${message(code: 'nideshopCoupon.sendStartDate.label', default: 'Send Start Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCouponInstanceList}" status="i" var="nideshopCouponInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCouponInstance.id}">${fieldValue(bean: nideshopCouponInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCouponInstance, field: "maxAmount")}</td>
					
						<td>${fieldValue(bean: nideshopCouponInstance, field: "minAmount")}</td>
					
						<td>${fieldValue(bean: nideshopCouponInstance, field: "minGoodsAmount")}</td>
					
						<td>${fieldValue(bean: nideshopCouponInstance, field: "sendEndDate")}</td>
					
						<td>${fieldValue(bean: nideshopCouponInstance, field: "sendStartDate")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCouponInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
