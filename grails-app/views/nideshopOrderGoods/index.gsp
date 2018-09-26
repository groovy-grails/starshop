
<%@ page import="nideshop.NideshopOrderGoods" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopOrderGoods.label', default: 'NideshopOrderGoods')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopOrderGoods" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopOrderGoods" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="goodsName" title="${message(code: 'nideshopOrderGoods.goodsName.label', default: 'Goods Name')}" />
					
						<g:sortableColumn property="goodsSn" title="${message(code: 'nideshopOrderGoods.goodsSn.label', default: 'Goods Sn')}" />
					
						<g:sortableColumn property="goodsSpecifitionNameValue" title="${message(code: 'nideshopOrderGoods.goodsSpecifitionNameValue.label', default: 'Goods Specifition Name Value')}" />
					
						<th><g:message code="nideshopOrderGoods.goodsId.label" default="Goods Id" /></th>
					
						<g:sortableColumn property="goodsSpecifitionIds" title="${message(code: 'nideshopOrderGoods.goodsSpecifitionIds.label', default: 'Goods Specifition Ids')}" />
					
						<g:sortableColumn property="isReal" title="${message(code: 'nideshopOrderGoods.isReal.label', default: 'Is Real')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopOrderGoodsInstanceList}" status="i" var="nideshopOrderGoodsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopOrderGoodsInstance.id}">${fieldValue(bean: nideshopOrderGoodsInstance, field: "goodsName")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopOrderGoodsInstance, field: "goodsSn")}</td>
					
						<td>${fieldValue(bean: nideshopOrderGoodsInstance, field: "goodsSpecifitionNameValue")}</td>
					
						<td>${fieldValue(bean: nideshopOrderGoodsInstance, field: "goodsId")}</td>
					
						<td>${fieldValue(bean: nideshopOrderGoodsInstance, field: "goodsSpecifitionIds")}</td>
					
						<td>${fieldValue(bean: nideshopOrderGoodsInstance, field: "isReal")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopOrderGoodsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
