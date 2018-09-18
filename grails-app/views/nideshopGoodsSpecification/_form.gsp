<%@ page import="nideshop.NideshopGoodsSpecification" %>



<div class="fieldcontain ${hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="nideshopGoodsSpecification.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="value" maxlength="50" required="" value="${nideshopGoodsSpecificationInstance?.value}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopGoodsSpecification.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopGoodsSpecificationInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'picUrl', 'error')} required">
	<label for="picUrl">
		<g:message code="nideshopGoodsSpecification.picUrl.label" default="Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="picUrl" required="" value="${nideshopGoodsSpecificationInstance?.picUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'specificationId', 'error')} required">
	<label for="specificationId">
		<g:message code="nideshopGoodsSpecification.specificationId.label" default="Specification Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="specificationId" name="specificationId.id" from="${nideshop.NideshopGoodsSpecification.list()}" optionKey="id" required="" value="${nideshopGoodsSpecificationInstance?.specificationId?.id}" class="many-to-one"/>

</div>

