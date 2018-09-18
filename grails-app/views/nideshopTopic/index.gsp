
<%@ page import="nideshop.NideshopTopic" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopTopic.label', default: 'NideshopTopic')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopTopic" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopTopic" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="content" title="${message(code: 'nideshopTopic.content.label', default: 'Content')}" />
					
						<g:sortableColumn property="avatar" title="${message(code: 'nideshopTopic.avatar.label', default: 'Avatar')}" />
					
						<g:sortableColumn property="isShow" title="${message(code: 'nideshopTopic.isShow.label', default: 'Is Show')}" />
					
						<g:sortableColumn property="itemPicUrl" title="${message(code: 'nideshopTopic.itemPicUrl.label', default: 'Item Pic Url')}" />
					
						<g:sortableColumn property="priceInfo" title="${message(code: 'nideshopTopic.priceInfo.label', default: 'Price Info')}" />
					
						<g:sortableColumn property="readCount" title="${message(code: 'nideshopTopic.readCount.label', default: 'Read Count')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopTopicInstanceList}" status="i" var="nideshopTopicInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopTopicInstance.id}">${fieldValue(bean: nideshopTopicInstance, field: "content")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopTopicInstance, field: "avatar")}</td>
					
						<td>${fieldValue(bean: nideshopTopicInstance, field: "isShow")}</td>
					
						<td>${fieldValue(bean: nideshopTopicInstance, field: "itemPicUrl")}</td>
					
						<td>${fieldValue(bean: nideshopTopicInstance, field: "priceInfo")}</td>
					
						<td>${fieldValue(bean: nideshopTopicInstance, field: "readCount")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopTopicInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
