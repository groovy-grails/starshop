<%@ page import="nideshop.NideshopGoodsGallery" %>



<div class="fieldcontain ${hasErrors(bean: nideshopGoodsGalleryInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopGoodsGallery.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopGoodsGalleryInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsGalleryInstance, field: 'imgDesc', 'error')} required">
	<label for="imgDesc">
		<g:message code="nideshopGoodsGallery.imgDesc.label" default="Img Desc" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imgDesc" required="" value="${nideshopGoodsGalleryInstance?.imgDesc}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsGalleryInstance, field: 'imgUrl', 'error')} required">
	<label for="imgUrl">
		<g:message code="nideshopGoodsGallery.imgUrl.label" default="Img Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="imgUrl" required="" value="${nideshopGoodsGalleryInstance?.imgUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsGalleryInstance, field: 'sortOrder', 'error')} required">
	<label for="sortOrder">
		<g:message code="nideshopGoodsGallery.sortOrder.label" default="Sort Order" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sortOrder" type="number" value="${nideshopGoodsGalleryInstance.sortOrder}" required=""/>

</div>

