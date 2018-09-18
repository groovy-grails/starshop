
<%@ page import="nideshop.NideshopGoodsIssue" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopGoodsIssue.label', default: 'NideshopGoodsIssue')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopGoodsIssue" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopGoodsIssue" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="nideshopGoodsIssue.goodsId.label" default="Goods Id" /></th>
					
						<g:sortableColumn property="question" title="${message(code: 'nideshopGoodsIssue.question.label', default: 'Question')}" />
					
						<g:sortableColumn property="answer" title="${message(code: 'nideshopGoodsIssue.answer.label', default: 'Answer')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopGoodsIssueInstanceList}" status="i" var="nideshopGoodsIssueInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopGoodsIssueInstance.id}">${fieldValue(bean: nideshopGoodsIssueInstance, field: "goodsId")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopGoodsIssueInstance, field: "question")}</td>
					
						<td>${fieldValue(bean: nideshopGoodsIssueInstance, field: "answer")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopGoodsIssueInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
