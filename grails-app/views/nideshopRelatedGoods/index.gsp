
<%@ page import="nideshop.NideshopRelatedGoods" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopRelatedGoods.label', default: 'NideshopRelatedGoods')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopRelatedGoods" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopRelatedGoods" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="nideshopRelatedGoods.goodsId.label" default="Goods Id" /></th>
					
						<th><g:message code="nideshopRelatedGoods.relatedGoodsId.label" default="Related Goods Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopRelatedGoodsInstanceList}" status="i" var="nideshopRelatedGoodsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopRelatedGoodsInstance.id}">${fieldValue(bean: nideshopRelatedGoodsInstance, field: "goodsId")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopRelatedGoodsInstance, field: "relatedGoodsId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopRelatedGoodsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
