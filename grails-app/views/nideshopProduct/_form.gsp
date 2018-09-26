<%@ page import="nideshop.NideshopProduct" %>



<div class="fieldcontain ${hasErrors(bean: nideshopProductInstance, field: 'goodsSn', 'error')} required">
	<label for="goodsSn">
		<g:message code="nideshopProduct.goodsSn.label" default="Goods Sn" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSn" maxlength="60" required="" value="${nideshopProductInstance?.goodsSn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopProductInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopProduct.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopProductInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopProductInstance, field: 'goodsNumber', 'error')} required">
	<label for="goodsNumber">
		<g:message code="nideshopProduct.goodsNumber.label" default="Goods Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="goodsNumber" type="number" value="${nideshopProductInstance.goodsNumber}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopProductInstance, field: 'goodsSpecificationIds', 'error')} required">
	<label for="goodsSpecificationIds">
		<g:message code="nideshopProduct.goodsSpecificationIds.label" default="Goods Specification Ids" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsSpecificationIds" name="goodsSpecificationIds.id" from="${nideshop.NideshopGoodsSpecification.list()}" optionKey="id" required="" value="${nideshopProductInstance?.goodsSpecificationIds?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopProductInstance, field: 'retailPrice', 'error')} required">
	<label for="retailPrice">
		<g:message code="nideshopProduct.retailPrice.label" default="Retail Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="retailPrice" value="${fieldValue(bean: nideshopProductInstance, field: 'retailPrice')}" required=""/>

</div>

