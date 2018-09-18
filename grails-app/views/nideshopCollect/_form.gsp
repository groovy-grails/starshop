<%@ page import="nideshop.NideshopCollect" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCollectInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopCollect.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopCollectInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCollectInstance, field: 'isAttention', 'error')} required">
	<label for="isAttention">
		<g:message code="nideshopCollect.isAttention.label" default="Is Attention" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isAttention" type="number" value="${nideshopCollectInstance.isAttention}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCollectInstance, field: 'typeId', 'error')} required">
	<label for="typeId">
		<g:message code="nideshopCollect.typeId.label" default="Type Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="typeId" type="number" value="${nideshopCollectInstance.typeId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCollectInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopCollect.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopCollectInstance?.userId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCollectInstance, field: 'valueId', 'error')} required">
	<label for="valueId">
		<g:message code="nideshopCollect.valueId.label" default="Value Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="valueId" name="valueId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" required="" value="${nideshopCollectInstance?.valueId?.id}" class="many-to-one"/>

</div>

