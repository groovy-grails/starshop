<%@ page import="nideshop.NideshopCart" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'sessionId', 'error')} required">
	<label for="sessionId">
		<g:message code="nideshopCart.sessionId.label" default="Session Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="sessionId" maxlength="32" required="" value="${nideshopCartInstance?.sessionId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'goodsSn', 'error')} required">
	<label for="goodsSn">
		<g:message code="nideshopCart.goodsSn.label" default="Goods Sn" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSn" maxlength="60" required="" value="${nideshopCartInstance?.goodsSn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'goodsName', 'error')} required">
	<label for="goodsName">
		<g:message code="nideshopCart.goodsName.label" default="Goods Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsName" maxlength="120" required="" value="${nideshopCartInstance?.goodsName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'goodsSpecifitionNameValue', 'error')} required">
	<label for="goodsSpecifitionNameValue">
		<g:message code="nideshopCart.goodsSpecifitionNameValue.label" default="Goods Specifition Name Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="goodsSpecifitionNameValue" cols="40" rows="5" maxlength="8000" required="" value="${nideshopCartInstance?.goodsSpecifitionNameValue}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'goodsSpecifitionIds', 'error')} required">
	<label for="goodsSpecifitionIds">
		<g:message code="nideshopCart.goodsSpecifitionIds.label" default="Goods Specifition Ids" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="goodsSpecifitionIds" maxlength="60" required="" value="${nideshopCartInstance?.goodsSpecifitionIds}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'checked', 'error')} required">
	<label for="checked">
		<g:message code="nideshopCart.checked.label" default="Checked" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="checked" type="number" value="${nideshopCartInstance.checked}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopCart.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopCartInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'listPicUrl', 'error')} required">
	<label for="listPicUrl">
		<g:message code="nideshopCart.listPicUrl.label" default="List Pic Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="listPicUrl" required="" value="${nideshopCartInstance?.listPicUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'marketPrice', 'error')} required">
	<label for="marketPrice">
		<g:message code="nideshopCart.marketPrice.label" default="Market Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="marketPrice" value="${fieldValue(bean: nideshopCartInstance, field: 'marketPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'number', 'error')} required">
	<label for="number">
		<g:message code="nideshopCart.number.label" default="Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="number" type="number" value="${nideshopCartInstance.number}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'productId', 'error')} required">
	<label for="productId">
		<g:message code="nideshopCart.productId.label" default="Product Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="productId" name="productId.id" from="${nideshop.NideshopProduct.list()}" optionKey="id" required="" value="${nideshopCartInstance?.productId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'retailPrice', 'error')} required">
	<label for="retailPrice">
		<g:message code="nideshopCart.retailPrice.label" default="Retail Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="retailPrice" value="${fieldValue(bean: nideshopCartInstance, field: 'retailPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCartInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopCart.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopCartInstance?.userId?.id}" class="many-to-one"/>

</div>

