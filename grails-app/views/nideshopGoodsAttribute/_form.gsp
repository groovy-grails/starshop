<%@ page import="nideshop.NideshopGoodsAttribute" %>



<div class="fieldcontain ${hasErrors(bean: nideshopGoodsAttributeInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="nideshopGoodsAttribute.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="value" cols="40" rows="5" maxlength="8000" required="" value="${nideshopGoodsAttributeInstance?.value}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsAttributeInstance, field: 'attributeId', 'error')} required">
	<label for="attributeId">
		<g:message code="nideshopGoodsAttribute.attributeId.label" default="Attribute Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="attributeId" name="attributeId.id" from="${nideshop.NideshopAttribute.list()}" optionKey="id" required="" value="${nideshopGoodsAttributeInstance?.attributeId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsAttributeInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopGoodsAttribute.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopGoodsAttributeInstance?.goodsId?.id}" class="many-to-one"/>

</div>

