<%@ page import="nideshop.NideshopGoods" %>



<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'goodsSn', 'error')} required">
	<label for="goodsSn">
		<g:message code="nideshopGoods.goodsSn.label" default="Goods Sn" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSn" maxlength="60" required="" value="${nideshopGoodsInstance?.goodsSn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopGoods.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="120" required="" value="${nideshopGoodsInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'goodsDesc', 'error')} ">
	<label for="goodsDesc">
		<g:message code="nideshopGoods.goodsDesc.label" default="Goods Desc" />
		
	</label>
	<g:textArea name="goodsDesc" cols="40" rows="5" maxlength="8000" value="${nideshopGoodsInstance?.goodsDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'goodsUnit', 'error')} required">
	<label for="goodsUnit">
		<g:message code="nideshopGoods.goodsUnit.label" default="Goods Unit" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsUnit" maxlength="45" required="" value="${nideshopGoodsInstance?.goodsUnit}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'promotionTag', 'error')} required">
	<label for="promotionTag">
		<g:message code="nideshopGoods.promotionTag.label" default="Promotion Tag" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="promotionTag" maxlength="45" required="" value="${nideshopGoodsInstance?.promotionTag}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopGoods.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopGoodsInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'appExclusivePrice', 'error')} required">
	<label for="appExclusivePrice">
		<g:message code="nideshopGoods.appExclusivePrice.label" default="App Exclusive Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="appExclusivePrice" value="${fieldValue(bean: nideshopGoodsInstance, field: 'appExclusivePrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'attributeCategory', 'error')} required">
	<label for="attributeCategory">
		<g:message code="nideshopGoods.attributeCategory.label" default="Attribute Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="attributeCategory" name="attributeCategory.id" from="${nideshop.NideshopAttributeCategory.list()}" optionKey="id" required="" value="${nideshopGoodsInstance?.attributeCategory?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'brandId', 'error')} required">
	<label for="brandId">
		<g:message code="nideshopGoods.brandId.label" default="Brand Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="brandId" name="brandId.id" from="${nideshop.NideshopBrand.list()}" optionKey="id" required="" value="${nideshopGoodsInstance?.brandId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'categoryId', 'error')} required">
	<label for="categoryId">
		<g:message code="nideshopGoods.categoryId.label" default="Category Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="categoryId" name="categoryId.id" from="${nideshop.NideshopCategory.list()}" optionKey="id" required="" value="${nideshopGoodsInstance?.categoryId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'counterPrice', 'error')} required">
	<label for="counterPrice">
		<g:message code="nideshopGoods.counterPrice.label" default="Counter Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="counterPrice" value="${fieldValue(bean: nideshopGoodsInstance, field: 'counterPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'extraPrice', 'error')} required">
	<label for="extraPrice">
		<g:message code="nideshopGoods.extraPrice.label" default="Extra Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="extraPrice" value="${fieldValue(bean: nideshopGoodsInstance, field: 'extraPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'goodsBrief', 'error')} required">
	<label for="goodsBrief">
		<g:message code="nideshopGoods.goodsBrief.label" default="Goods Brief" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsBrief" required="" value="${nideshopGoodsInstance?.goodsBrief}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'goodsNumber', 'error')} required">
	<label for="goodsNumber">
		<g:message code="nideshopGoods.goodsNumber.label" default="Goods Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="goodsNumber" type="number" value="${nideshopGoodsInstance.goodsNumber}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isAppExclusive', 'error')} required">
	<label for="isAppExclusive">
		<g:message code="nideshopGoods.isAppExclusive.label" default="Is App Exclusive" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isAppExclusive" type="number" value="${nideshopGoodsInstance.isAppExclusive}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isDelete', 'error')} required">
	<label for="isDelete">
		<g:message code="nideshopGoods.isDelete.label" default="Is Delete" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isDelete" type="number" value="${nideshopGoodsInstance.isDelete}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isHot', 'error')} required">
	<label for="isHot">
		<g:message code="nideshopGoods.isHot.label" default="Is Hot" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isHot" type="number" value="${nideshopGoodsInstance.isHot}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isLimited', 'error')} required">
	<label for="isLimited">
		<g:message code="nideshopGoods.isLimited.label" default="Is Limited" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isLimited" type="number" value="${nideshopGoodsInstance.isLimited}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isNew', 'error')} required">
	<label for="isNew">
		<g:message code="nideshopGoods.isNew.label" default="Is New" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isNew" type="number" value="${nideshopGoodsInstance.isNew}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'isOnSale', 'error')} required">
	<label for="isOnSale">
		<g:message code="nideshopGoods.isOnSale.label" default="Is On Sale" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isOnSale" type="number" value="${nideshopGoodsInstance.isOnSale}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'keywords', 'error')} required">
	<label for="keywords">
		<g:message code="nideshopGoods.keywords.label" default="Keywords" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="keywords" required="" value="${nideshopGoodsInstance?.keywords}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'listPicUrl', 'error')} required">
	<label for="listPicUrl">
		<g:message code="nideshopGoods.listPicUrl.label" default="List Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="listPicUrl" required="" value="${nideshopGoodsInstance?.listPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'primaryPicUrl', 'error')} required">
	<label for="primaryPicUrl">
		<g:message code="nideshopGoods.primaryPicUrl.label" default="Primary Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="primaryPicUrl" required="" value="${nideshopGoodsInstance?.primaryPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'primaryProductId', 'error')} required">
	<label for="primaryProductId">
		<g:message code="nideshopGoods.primaryProductId.label" default="Primary Product Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="primaryProductId" name="primaryProductId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopGoodsInstance?.primaryProductId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'promotionDesc', 'error')} required">
	<label for="promotionDesc">
		<g:message code="nideshopGoods.promotionDesc.label" default="Promotion Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="promotionDesc" required="" value="${nideshopGoodsInstance?.promotionDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'retailPrice', 'error')} required">
	<label for="retailPrice">
		<g:message code="nideshopGoods.retailPrice.label" default="Retail Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="retailPrice" value="${fieldValue(bean: nideshopGoodsInstance, field: 'retailPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'sellVolume', 'error')} required">
	<label for="sellVolume">
		<g:message code="nideshopGoods.sellVolume.label" default="Sell Volume" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sellVolume" type="number" value="${nideshopGoodsInstance.sellVolume}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopGoods.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopGoodsInstance.sortOrder}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsInstance, field: 'unitPrice', 'error')} required">
	<label for="unitPrice">
		<g:message code="nideshopGoods.unitPrice.label" default="Unit Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="unitPrice" value="${fieldValue(bean: nideshopGoodsInstance, field: 'unitPrice')}" required=""/>

</div>

