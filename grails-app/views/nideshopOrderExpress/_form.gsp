<%@ page import="nideshop.NideshopOrderExpress" %>



<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperName', 'error')} required">
	<label for="shipperName">
		<g:message code="nideshopOrderExpress.shipperName.label" default="Shipper Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="shipperName" maxlength="120" required="" value="${nideshopOrderExpressInstance?.shipperName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperCode', 'error')} required">
	<label for="shipperCode">
		<g:message code="nideshopOrderExpress.shipperCode.label" default="Shipper Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="shipperCode" maxlength="60" required="" value="${nideshopOrderExpressInstance?.shipperCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'logisticCode', 'error')} required">
	<label for="logisticCode">
		<g:message code="nideshopOrderExpress.logisticCode.label" default="Logistic Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="logisticCode" maxlength="20" required="" value="${nideshopOrderExpressInstance?.logisticCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'traces', 'error')} required">
	<label for="traces">
		<g:message code="nideshopOrderExpress.traces.label" default="Traces" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="traces" cols="40" rows="5" maxlength="2000" required="" value="${nideshopOrderExpressInstance?.traces}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'requestCount', 'error')} ">
	<label for="requestCount">
		<g:message code="nideshopOrderExpress.requestCount.label" default="Request Count" />
		
	</label>
	<g:field name="requestCount" type="number" value="${nideshopOrderExpressInstance.requestCount}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'requestTime', 'error')} ">
	<label for="requestTime">
		<g:message code="nideshopOrderExpress.requestTime.label" default="Request Time" />
		
	</label>
	<g:field name="requestTime" type="number" value="${nideshopOrderExpressInstance.requestTime}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopOrderExpress.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopOrderExpressInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'isFinish', 'error')} required">
	<label for="isFinish">
		<g:message code="nideshopOrderExpress.isFinish.label" default="Is Finish" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isFinish" type="number" value="${nideshopOrderExpressInstance.isFinish}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'orderId', 'error')} required">
	<label for="orderId">
		<g:message code="nideshopOrderExpress.orderId.label" default="Order Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="orderId" name="orderId.id" from="${nideshop.NideshopOrder.list()}" optionKey="id" required="" value="${nideshopOrderExpressInstance?.orderId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperId', 'error')} required">
	<label for="shipperId">
		<g:message code="nideshopOrderExpress.shipperId.label" default="Shipper Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="shipperId" name="shipperId.id" from="${nideshop.NideshopShipper.list()}" optionKey="id" required="" value="${nideshopOrderExpressInstance?.shipperId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderExpressInstance, field: 'updateTime', 'error')} required">
	<label for="updateTime">
		<g:message code="nideshopOrderExpress.updateTime.label" default="Update Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="updateTime" type="number" value="${nideshopOrderExpressInstance.updateTime}" required=""/>

</div>

