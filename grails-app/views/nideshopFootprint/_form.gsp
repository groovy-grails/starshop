<%@ page import="nideshop.NideshopFootprint" %>



<div class="fieldcontain ${hasErrors(bean: nideshopFootprintInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopFootprint.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopFootprintInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFootprintInstance, field: 'goodsId', 'error')} required">
	<label for="goodsId">
		<g:message code="nideshopFootprint.goodsId.label" default="Goods Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopFootprintInstance?.goodsId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopFootprintInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopFootprint.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopFootprintInstance?.userId?.id}" class="many-to-one"/>

</div>

