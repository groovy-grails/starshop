
<%@ page import="nideshop.NideshopProduct" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopProduct.label', default: 'NideshopProduct')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopProduct" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopProduct" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="goodsSn" title="${message(code: 'nideshopProduct.goodsSn.label', default: 'Goods Sn')}" />
					
						<th><g:message code="nideshopProduct.goodsId.label" default="Goods Id" /></th>
					
						<g:sortableColumn property="goodsNumber" title="${message(code: 'nideshopProduct.goodsNumber.label', default: 'Goods Number')}" />
					
						<th><g:message code="nideshopProduct.goodsSpecificationIds.label" default="Goods Specification Ids" /></th>
					
						<g:sortableColumn property="retailPrice" title="${message(code: 'nideshopProduct.retailPrice.label', default: 'Retail Price')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopProductInstanceList}" status="i" var="nideshopProductInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopProductInstance.id}">${fieldValue(bean: nideshopProductInstance, field: "goodsSn")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopProductInstance, field: "goodsId")}</td>
					
						<td>${fieldValue(bean: nideshopProductInstance, field: "goodsNumber")}</td>
					
						<td>${fieldValue(bean: nideshopProductInstance, field: "goodsSpecificationIds")}</td>
					
						<td>${fieldValue(bean: nideshopProductInstance, field: "retailPrice")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopProductInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
