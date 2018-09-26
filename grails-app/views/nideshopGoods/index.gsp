
<%@ page import="nideshop.NideshopGoods" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoods.label', default: 'NideshopGoods')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopGoods" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopGoods" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="goodsSn" title="${message(code: 'nideshopGoods.goodsSn.label', default: 'Goods Sn')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopGoods.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="keywords" title="${message(code: 'nideshopGoods.keywords.label', default: 'Keywords')}" />
					
						<g:sortableColumn property="goodsUnit" title="${message(code: 'nideshopGoods.goodsUnit.label', default: 'Goods Unit')}" />
					
						<g:sortableColumn property="promotionTag" title="${message(code: 'nideshopGoods.promotionTag.label', default: 'Promotion Tag')}" />
					
						<th><g:message code="nideshopGoods.primaryProductId.label" default="Primary Product Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopGoodsInstanceList}" status="i" var="nideshopGoodsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopGoodsInstance.id}">${fieldValue(bean: nideshopGoodsInstance, field: "goodsSn")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopGoodsInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsInstance, field: "keywords")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsInstance, field: "goodsUnit")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsInstance, field: "promotionTag")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsInstance, field: "primaryProductId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopGoodsInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
