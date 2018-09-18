
<%@ page import="nideshop.NideshopCart" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopCart.label', default: 'NideshopCart')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopCart" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopCart" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="sessionId" title="${message(code: 'nideshopCart.sessionId.label', default: 'Session Id')}" />
					
						<g:sortableColumn property="goodsSn" title="${message(code: 'nideshopCart.goodsSn.label', default: 'Goods Sn')}" />
					
						<g:sortableColumn property="goodsName" title="${message(code: 'nideshopCart.goodsName.label', default: 'Goods Name')}" />
					
						<g:sortableColumn property="goodsSpecifitionNameValue" title="${message(code: 'nideshopCart.goodsSpecifitionNameValue.label', default: 'Goods Specifition Name Value')}" />
					
						<g:sortableColumn property="goodsSpecifitionIds" title="${message(code: 'nideshopCart.goodsSpecifitionIds.label', default: 'Goods Specifition Ids')}" />
					
						<g:sortableColumn property="checked" title="${message(code: 'nideshopCart.checked.label', default: 'Checked')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopCartInstanceList}" status="i" var="nideshopCartInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopCartInstance.id}">${fieldValue(bean: nideshopCartInstance, field: "sessionId")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopCartInstance, field: "goodsSn")}</td>
					
						<td>${fieldValue(bean: nideshopCartInstance, field: "goodsName")}</td>
					
						<td>${fieldValue(bean: nideshopCartInstance, field: "goodsSpecifitionNameValue")}</td>
					
						<td>${fieldValue(bean: nideshopCartInstance, field: "goodsSpecifitionIds")}</td>
					
						<td>${fieldValue(bean: nideshopCartInstance, field: "checked")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopCartInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
