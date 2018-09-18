
<%@ page import="nideshop.NideshopAddress" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'nideshopAddress.label', default: 'NideshopAddress')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-nideshopAddress" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-nideshopAddress" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'nideshopAddress.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="address" title="${message(code: 'nideshopAddress.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="mobile" title="${message(code: 'nideshopAddress.mobile.label', default: 'Mobile')}" />
					
						<th><g:message code="nideshopAddress.cityId.label" default="City Id" /></th>
					
						<th><g:message code="nideshopAddress.countryId.label" default="Country Id" /></th>
					
						<th><g:message code="nideshopAddress.districtId.label" default="District Id" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${nideshopAddressInstanceList}" status="i" var="nideshopAddressInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${nideshopAddressInstance.id}">${fieldValue(bean: nideshopAddressInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: nideshopAddressInstance, field: "address")}</td>
					
						<td>${fieldValue(bean: nideshopAddressInstance, field: "mobile")}</td>
					
						<td>${fieldValue(bean: nideshopAddressInstance, field: "cityId")}</td>
					
						<td>${fieldValue(bean: nideshopAddressInstance, field: "countryId")}</td>
					
						<td>${fieldValue(bean: nideshopAddressInstance, field: "districtId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${nideshopAddressInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
