
<%@ page import="nideshop.NideshopGoodsSpecification" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopGoodsSpecification" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopGoodsSpecification" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="value" title="${message(code: 'nideshopGoodsSpecification.value.label', default: 'Value')}" />
					
						<th><g:message code="nideshopGoodsSpecification.goodsId.label" default="Goods Id" /></th>
					
						<g:sortableColumn property="picUrl" title="${message(code: 'nideshopGoodsSpecification.picUrl.label', default: 'Pic Url')}" />
					
						<th><g:message code="nideshopGoodsSpecification.specificationId.label" default="Specification Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopGoodsSpecificationInstanceList}" status="i" var="nideshopGoodsSpecificationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopGoodsSpecificationInstance.id}">${fieldValue(bean: nideshopGoodsSpecificationInstance, field: "value")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopGoodsSpecificationInstance, field: "goodsId")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsSpecificationInstance, field: "picUrl")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsSpecificationInstance, field: "specificationId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopGoodsSpecificationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
