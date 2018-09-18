
<%@ page import="nideshop.NideshopGoodsAttribute" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsAttribute.label', default: 'NideshopGoodsAttribute')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopGoodsAttribute" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopGoodsAttribute" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="value" title="${message(code: 'nideshopGoodsAttribute.value.label', default: 'Value')}" />
					
						<th><g:message code="nideshopGoodsAttribute.attributeId.label" default="Attribute Id" /></th>
					
						<th><g:message code="nideshopGoodsAttribute.goodsId.label" default="Goods Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopGoodsAttributeInstanceList}" status="i" var="nideshopGoodsAttributeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopGoodsAttributeInstance.id}">${fieldValue(bean: nideshopGoodsAttributeInstance, field: "value")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopGoodsAttributeInstance, field: "attributeId")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsAttributeInstance, field: "goodsId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopGoodsAttributeInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
