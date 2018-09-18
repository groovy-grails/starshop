<%@ page import="nideshop.NideshopCategory" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopCategory.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="90" required="" value="${nideshopCategoryInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'bannerUrl', 'error')} required">
	<label for="bannerUrl">
		<g:message code="nideshopCategory.bannerUrl.label" default="Banner Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="bannerUrl" required="" value="${nideshopCategoryInstance?.bannerUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'frontDesc', 'error')} required">
	<label for="frontDesc">
		<g:message code="nideshopCategory.frontDesc.label" default="Front Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="frontDesc" required="" value="${nideshopCategoryInstance?.frontDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'frontName', 'error')} required">
	<label for="frontName">
		<g:message code="nideshopCategory.frontName.label" default="Front Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="frontName" required="" value="${nideshopCategoryInstance?.frontName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'iconUrl', 'error')} required">
	<label for="iconUrl">
		<g:message code="nideshopCategory.iconUrl.label" default="Icon Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="iconUrl" required="" value="${nideshopCategoryInstance?.iconUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'imgUrl', 'error')} required">
	<label for="imgUrl">
		<g:message code="nideshopCategory.imgUrl.label" default="Img Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imgUrl" required="" value="${nideshopCategoryInstance?.imgUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'isShow', 'error')} required">
	<label for="isShow">
		<g:message code="nideshopCategory.isShow.label" default="Is Show" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isShow" type="number" value="${nideshopCategoryInstance.isShow}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'keywords', 'error')} required">
	<label for="keywords">
		<g:message code="nideshopCategory.keywords.label" default="Keywords" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="keywords" required="" value="${nideshopCategoryInstance?.keywords}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'level', 'error')} required">
	<label for="level">
		<g:message code="nideshopCategory.level.label" default="Level" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="level" required="" value="${nideshopCategoryInstance?.level}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'parentId', 'error')} required">
	<label for="parentId">
		<g:message code="nideshopCategory.parentId.label" default="Parent Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="parentId" name="parentId.id" from="${nideshop.NideshopCategory.list()}" optionKey="id" required="" value="${nideshopCategoryInstance?.parentId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'showIndex', 'error')} required">
	<label for="showIndex">
		<g:message code="nideshopCategory.showIndex.label" default="Show Index" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="showIndex" type="number" value="${nideshopCategoryInstance.showIndex}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopCategory.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopCategoryInstance.sortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="nideshopCategory.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="type" type="number" value="${nideshopCategoryInstance.type}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCategoryInstance, field: 'wapBannerUrl', 'error')} required">
	<label for="wapBannerUrl">
		<g:message code="nideshopCategory.wapBannerUrl.label" default="Wap Banner Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="wapBannerUrl" required="" value="${nideshopCategoryInstance?.wapBannerUrl}"/>

</div>

