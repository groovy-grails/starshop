<%@ page import="nideshop.NideshopRelatedGoods" %>



<div class="fieldcontain ${hasErrors(bean: nideshopRelatedGoodsInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopRelatedGoods.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopRelatedGoodsInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopRelatedGoodsInstance, field: 'relatedGoodsId', 'error')} required">
	<label for="relatedGoodsId">
		<g:message code="nideshopRelatedGoods.relatedGoodsId.label" default="Related Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="relatedGoodsId" name="relatedGoodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopRelatedGoodsInstance?.relatedGoodsId?.id}" class="many-to-one"/>

</div>

