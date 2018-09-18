
<%@ page import="nideshop.NideshopGoodsGallery" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsGallery.label', default: 'NideshopGoodsGallery')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopGoodsGallery" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopGoodsGallery" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="nideshopGoodsGallery.goodsId.label" default="Goods Id" /></th>
					
						<g:sortableColumn property="imgDesc" title="${message(code: 'nideshopGoodsGallery.imgDesc.label', default: 'Img Desc')}" />
					
						<g:sortableColumn property="imgUrl" title="${message(code: 'nideshopGoodsGallery.imgUrl.label', default: 'Img Url')}" />
					
						<g:sortableColumn property="sortOrder" title="${message(code: 'nideshopGoodsGallery.sortOrder.label', default: 'Sort Order')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopGoodsGalleryInstanceList}" status="i" var="nideshopGoodsGalleryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopGoodsGalleryInstance.id}">${fieldValue(bean: nideshopGoodsGalleryInstance, field: "goodsId")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopGoodsGalleryInstance, field: "imgDesc")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsGalleryInstance, field: "imgUrl")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsGalleryInstance, field: "sortOrder")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopGoodsGalleryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
