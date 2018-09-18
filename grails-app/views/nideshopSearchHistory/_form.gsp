<%@ page import="nideshop.NideshopSearchHistory" %>



<div class="fieldcontain ${hasErrors(bean: nideshopSearchHistoryInstance, field: 'keyword', 'error')} required">
	<label for="keyword">
		<g:message code="nideshopSearchHistory.keyword.label" default="Keyword" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="keyword" maxlength="50" required="" value="${nideshopSearchHistoryInstance?.keyword}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopSearchHistoryInstance, field: 'from', 'error')} required">
	<label for="from">
		<g:message code="nideshopSearchHistory.from.label" default="From" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="from" maxlength="45" required="" value="${nideshopSearchHistoryInstance?.from}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopSearchHistoryInstance, field: 'userId', 'error')} ">
	<label for="userId">
		<g:message code="nideshopSearchHistory.userId.label" default="User Id" />
		
	</label>
	<g:textField name="userId" maxlength="45" value="${nideshopSearchHistoryInstance?.userId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopSearchHistoryInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopSearchHistory.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopSearchHistoryInstance.addTime}" required=""/>

</div>

