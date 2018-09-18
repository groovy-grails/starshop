<%@ page import="nideshop.NideshopKeywords" %>



<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'keyword', 'error')} required">
	<label for="keyword">
		<g:message code="nideshopKeywords.keyword.label" default="Keyword" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="keyword" maxlength="90" required="" value="${nideshopKeywordsInstance?.keyword}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'isDefault', 'error')} required">
	<label for="isDefault">
		<g:message code="nideshopKeywords.isDefault.label" default="Is Default" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isDefault" type="number" value="${nideshopKeywordsInstance.isDefault}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'isHot', 'error')} required">
	<label for="isHot">
		<g:message code="nideshopKeywords.isHot.label" default="Is Hot" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isHot" type="number" value="${nideshopKeywordsInstance.isHot}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'isShow', 'error')} required">
	<label for="isShow">
		<g:message code="nideshopKeywords.isShow.label" default="Is Show" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isShow" type="number" value="${nideshopKeywordsInstance.isShow}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'schemeUrl', 'error')} required">
	<label for="schemeUrl">
		<g:message code="nideshopKeywords.schemeUrl.label" default="Scheme Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="schemeUrl" required="" value="${nideshopKeywordsInstance?.schemeUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopKeywords.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopKeywordsInstance.sortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopKeywordsInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="nideshopKeywords.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="type" type="number" value="${nideshopKeywordsInstance.type}" required=""/>

</div>

