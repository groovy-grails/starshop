
<%@ page import="nideshop.NideshopAd" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAd.label', default: 'NideshopAd')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopAd" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopAd" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopAd.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="imageUrl" title="${message(code: 'nideshopAd.imageUrl.label', default: 'Image Url')}" />
					
						<th><g:message code="nideshopAd.adPositionId.label" default="Ad Position Id" /></th>
					
						<g:sortableColumn property="content" title="${message(code: 'nideshopAd.content.label', default: 'Content')}" />
					
						<g:sortableColumn property="enabled" title="${message(code: 'nideshopAd.enabled.label', default: 'Enabled')}" />
					
						<g:sortableColumn property="endTime" title="${message(code: 'nideshopAd.endTime.label', default: 'End Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopAdInstanceList}" status="i" var="nideshopAdInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopAdInstance.id}">${fieldValue(bean: nideshopAdInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopAdInstance, field: "imageUrl")}</td>
					
						<td>${fieldValue(bean: nideshopAdInstance, field: "adPositionId")}</td>
					
						<td>${fieldValue(bean: nideshopAdInstance, field: "content")}</td>
					
						<td>${fieldValue(bean: nideshopAdInstance, field: "enabled")}</td>
					
						<td>${fieldValue(bean: nideshopAdInstance, field: "endTime")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopAdInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
