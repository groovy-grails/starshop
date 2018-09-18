<%@ page import="nideshop.NideshopBrand" %>



<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'appListPicUrl', 'error')} required">
	<label for="appListPicUrl">
		<g:message code="nideshopBrand.appListPicUrl.label" default="App List Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="appListPicUrl" required="" value="${nideshopBrandInstance?.appListPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'floorPrice', 'error')} required">
	<label for="floorPrice">
		<g:message code="nideshopBrand.floorPrice.label" default="Floor Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="floorPrice" value="${fieldValue(bean: nideshopBrandInstance, field: 'floorPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'isNew', 'error')} ">
	<label for="isNew">
		<g:message code="nideshopBrand.isNew.label" default="Is New" />
		
	</label>
	<g:checkBox name="isNew" value="${nideshopBrandInstance?.isNew}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'isShow', 'error')} ">
	<label for="isShow">
		<g:message code="nideshopBrand.isShow.label" default="Is Show" />
		
	</label>
	<g:checkBox name="isShow" value="${nideshopBrandInstance?.isShow}" />

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'listPicUrl', 'error')} required">
	<label for="listPicUrl">
		<g:message code="nideshopBrand.listPicUrl.label" default="List Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="listPicUrl" required="" value="${nideshopBrandInstance?.listPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopBrand.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${nideshopBrandInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'newPicUrl', 'error')} required">
	<label for="newPicUrl">
		<g:message code="nideshopBrand.newPicUrl.label" default="New Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="newPicUrl" required="" value="${nideshopBrandInstance?.newPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'newSortOrder', 'error')} required">
	<label for="newSortOrder">
		<g:message code="nideshopBrand.newSortOrder.label" default="New Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="newSortOrder" type="number" value="${nideshopBrandInstance.newSortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'picUrl', 'error')} required">
	<label for="picUrl">
		<g:message code="nideshopBrand.picUrl.label" default="Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="picUrl" required="" value="${nideshopBrandInstance?.picUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'simpleDesc', 'error')} required">
	<label for="simpleDesc">
		<g:message code="nideshopBrand.simpleDesc.label" default="Simple Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="simpleDesc" required="" value="${nideshopBrandInstance?.simpleDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopBrandInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopBrand.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopBrandInstance.sortOrder}" required=""/>

</div>

