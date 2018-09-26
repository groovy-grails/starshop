<%@ page import="nideshop.NideshopOrderGoods" %>



<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsName', 'error')} required">
	<label for="goodsName">
		<g:message code="nideshopOrderGoods.goodsName.label" default="Goods Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsName" maxlength="120" required="" value="${nideshopOrderGoodsInstance?.goodsName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSn', 'error')} required">
	<label for="goodsSn">
		<g:message code="nideshopOrderGoods.goodsSn.label" default="Goods Sn" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSn" maxlength="60" required="" value="${nideshopOrderGoodsInstance?.goodsSn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSpecifitionNameValue', 'error')} required">
	<label for="goodsSpecifitionNameValue">
		<g:message code="nideshopOrderGoods.goodsSpecifitionNameValue.label" default="Goods Specifition Name Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="goodsSpecifitionNameValue" cols="40" rows="5" maxlength="8000" required="" value="${nideshopOrderGoodsInstance?.goodsSpecifitionNameValue}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopOrderGoods.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopOrderGoodsInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSpecifitionIds', 'error')} required">
	<label for="goodsSpecifitionIds">
		<g:message code="nideshopOrderGoods.goodsSpecifitionIds.label" default="Goods Specifition Ids" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSpecifitionIds" required="" value="${nideshopOrderGoodsInstance?.goodsSpecifitionIds}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'isReal', 'error')} required">
	<label for="isReal">
		<g:message code="nideshopOrderGoods.isReal.label" default="Is Real" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isReal" type="number" value="${nideshopOrderGoodsInstance.isReal}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'listPicUrl', 'error')} required">
	<label for="listPicUrl">
		<g:message code="nideshopOrderGoods.listPicUrl.label" default="List Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="listPicUrl" required="" value="${nideshopOrderGoodsInstance?.listPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'marketPrice', 'error')} required">
	<label for="marketPrice">
		<g:message code="nideshopOrderGoods.marketPrice.label" default="Market Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="marketPrice" value="${fieldValue(bean: nideshopOrderGoodsInstance, field: 'marketPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'number', 'error')} required">
	<label for="number">
		<g:message code="nideshopOrderGoods.number.label" default="Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="number" type="number" value="${nideshopOrderGoodsInstance.number}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'orderId', 'error')} required">
	<label for="orderId">
		<g:message code="nideshopOrderGoods.orderId.label" default="Order Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="orderId" name="orderId.id" from="${nideshop.NideshopOrder.list()}" optionKey="id" required="" value="${nideshopOrderGoodsInstance?.orderId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'productId', 'error')} required">
	<label for="productId">
		<g:message code="nideshopOrderGoods.productId.label" default="Product Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="productId" name="productId.id" from="${nideshop.NideshopProduct.list()}" optionKey="id" required="" value="${nideshopOrderGoodsInstance?.productId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderGoodsInstance, field: 'retailPrice', 'error')} required">
	<label for="retailPrice">
		<g:message code="nideshopOrderGoods.retailPrice.label" default="Retail Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="retailPrice" value="${fieldValue(bean: nideshopOrderGoodsInstance, field: 'retailPrice')}" required=""/>

</div>

